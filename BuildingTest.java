package com.company;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

  public  class BuildingTest {
   @Test
    public void testcases () {

    Building homeMaintance = new Building(25, true, false, 500);

    float actual_result = homeMaintance.collectMoney();
    assertEquals (BuildingTestData.expectedresult2, actual_result) ;
    boolean actualResult = homeMaintance.callCleaner();
    assertEquals (BuildingTestData.expectedresult1,actualResult);
    boolean actualResult1 = homeMaintance.maintainceBuilding();
    assertEquals (BuildingTestData.expectedresult1,actualResult1);

   }
}
