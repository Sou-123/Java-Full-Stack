package com.cap.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class AssignmentOneTest {

	 int[] array = new int[] {5, 67, 13, 87, 21, 54, 19};

     @Test
     public void shouldBeMaxValue() {
         int maxValue = AssignmentOne.getMaxValue(array);
         assert(maxValue == 87);
     }

     @Test
     public void shouldBeMinValue() {
         int minValue = AssignmentOne.getMinValue(array);
         assert(minValue == 5);
     }
     
     public void shouldBeMinMaxValue() {
         int minValue = AssignmentOne.getMinValue(array);
         int maxValue = AssignmentOne.getMaxValue(array);
         int[] minMax = {minValue, maxValue};
         assert(minMax[0]==5 && minMax[1]==87);
     }
         @BeforeAll
         static void setUpBeforeAll() {
           System.out.println("OuterClass - Setup @BeforeAll");
         }

         @AfterAll
         static void tearDownAfterAll() {
           System.out.println("OuterClass - Tear down @AfterAll");
         }

         @BeforeEach
         void setUp() {
           System.out.println("OuterClass - Setup");
         }

         @AfterEach
         void tearDown() {
           System.out.println("OuterClass - TearDown");
         }

         @TestInstance(TestInstance.Lifecycle.PER_CLASS)
         @Nested
         class WithLifecycleCalls {

           @BeforeAll
           void setUpBeforeAll() {
             System.out.println("InnerClass - Setup @BeforeAll");
           }

           @AfterAll
           void tearDownAfterAll() {
             System.out.println("InnerClass - Tear down @AfterAll");
           }

           @BeforeEach
           void setUp() {
             System.out.println("InnerClass - Setup");
           }

           @BeforeEach
           void setUp2() {
             System.out.println("InnerClass - Setup");
           }

           @AfterEach
           void tearDown() {
             System.out.println("InnerClass - TearDown");
           }

           @Test
           void nestedClassTest() {}
         }
       }
