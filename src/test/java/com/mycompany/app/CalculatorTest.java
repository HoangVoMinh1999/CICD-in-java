package com.mycompany.app;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    Calculator cal;
    
    public CalculatorTest() {
        cal = new Calculator();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        int rs = cal.add(1, 2);
        int expected = 3;
        assertEquals(rs, expected);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @Test
    public void testSub() {
        int rs = cal.sub(4, 2);
        int expected = 2;
        assertEquals(rs, expected);
    }

    /**
     * Test of mul method, of class Calculator.
     */
    @Test
    public void testMul() {
        int rs = cal.mul(4, 2);
        int expected = 8;
        assertEquals(rs, expected);
    }

    /**
     * Test of div method, of class Calculator.
     */
    @Test
    public void testDiv() {
        int rs = cal.div(4, 2);
        int expected = 2;
        assertEquals(rs, expected);
    }
    
}