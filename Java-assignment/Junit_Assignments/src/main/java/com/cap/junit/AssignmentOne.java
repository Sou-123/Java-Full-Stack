package com.cap.junit;

public class AssignmentOne {

    public static int getMaxValue(int[] array) {
        int value = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
            }
        }
        return value;
    }

    public static int getMinValue(int[] array) {
        int value = Integer.MAX_VALUE;


        for (int i=0; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        return value;
    }   
    
    public static int[] getMinMax(int[] array)
    {

    int[] arr={AssignmentOne.getMinValue(array),AssignmentOne.getMaxValue(array)};  //initializing array
    return arr;
    }
}