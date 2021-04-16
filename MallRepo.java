package com.company;

import java.sql.*;
import java.util.ArrayList;

public class MallRepo {

        private String m_conn; // connection string

        public MallRepo (String m_conn) {
            this.m_conn = m_conn;
        }

        // Remove to different class
        public void createDatabase(String name) {
            String url = "jdbc:sqlite:C:\\Users\\yelena\\MALL.db" + name;
            try (Connection conn = DriverManager.getConnection(url)) {
                if (conn != null) {
                    DatabaseMetaData meta = conn.getMetaData();
                    System.out.println("The driver name is " + meta.getDriverName());
                    System.out.println("A new database has been created.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public ArrayList<Mall> getAllStories() {
            // fire select query
            // create Employee instance per record
            // create array list of all employees
            // try to connect to db

            ArrayList<Mall> stories = new ArrayList<>();

            try (Connection conn = DriverManager.getConnection(m_conn)) {
                // check if connection succeed
                if (conn != null) {

                    // prepare query string
                    String sql = "SELECT * FROM STORIES";

                    // prepare statement
                    Statement stmt = conn.createStatement();

                    // fire query
                    ResultSet rs = stmt.executeQuery(sql);

                    // read results
                    while (rs.next()) {
                        Mall e = new Mall(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("floor"),
                                rs.getInt("isReustarant"),
                                rs.getInt("isOpenLate"),
                                rs.getInt("isLarge"));
                        stories.add(e);
                    }
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            return stories;
        }

        public void select(String query) {

            // try to connect to db
            try (Connection conn = DriverManager.getConnection(m_conn)) {
                // check if connection succeed
                if (conn != null) {

                    // prepare query string
                    String sql = query;

                    // prepare statement
                    Statement stmt = conn.createStatement();

                    // fire query
                    ResultSet rs = stmt.executeQuery(sql);

                    // read results
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getInt("floor") + "\t" +
                                rs.getInt("isReustarant") + "\t" +
                                rs.getInt("isOpenLate")+ "\t"+
                                rs.getInt("isLarge") + "\t"
                        );
                    }
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public void update(String query) {

            // try to connect to db
            try (Connection conn = DriverManager.getConnection(m_conn)) {
                // check if connection succeed
                if (conn != null) {

                    // prepare query
                    String sql = query;

                    // prepare statement
                    Statement stmt = conn.createStatement();

                    // fire query
                    int result = stmt.executeUpdate(sql); // not expect result
                    System.out.println(result + " record updated.");
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }