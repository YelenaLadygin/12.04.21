package com.company;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class UniqueListTest {

    @Test
    public void testcases() {

    UniqueList ulist = new UniqueList();

    boolean actual_result = ulist.addNumbers(23);
    assertEquals(true, actual_result);

    boolean actual_result1 = ulist.addNumbers(-1);
    assertEquals(false, actual_result1);

    boolean actual_result3 = ulist.addNumbers(0);
    assertEquals(false, actual_result3);

    }
}