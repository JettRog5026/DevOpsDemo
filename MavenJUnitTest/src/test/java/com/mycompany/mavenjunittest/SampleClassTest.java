/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenjunittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jettr
 */
public class SampleClassTest {
    
    public SampleClassTest() {
    }

    @Test
    public void testAddNumbers() {
        SampleClass test = new SampleClass();
        
        int expectedValue = 5;
        int actual;
        
        actual = test.addNumbers(2, 3);
        
        assertEquals(expectedValue,actual);
    }
    
    @Test
    public void testSubNumbers() {
        SampleClass test = new SampleClass();
        
        int expectedValue = 5;
        int actual;
        
        actual = test.subtractNumbers(10, 5);
        
        assertEquals(expectedValue,actual);
    }
    
    @Test
    public void testDivNumbers() {
        SampleClass test = new SampleClass();
        
        int expectedValue = 7;
        float actual;
        
        actual = test.divNumbers(21, 3);
        
        assertEquals(expectedValue,actual);
    }
}
