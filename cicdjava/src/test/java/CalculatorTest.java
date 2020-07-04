/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class CalculatorTest {
    Calculator cal;
    
    public CalculatorTest() {
        cal = new Calculator();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
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
