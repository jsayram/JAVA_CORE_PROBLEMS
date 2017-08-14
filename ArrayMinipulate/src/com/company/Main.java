package com.company;

import java.util.Arrays;

public class Main {





    public static void main(String[] args) {
	// write your code here
       int[] myArray ={1,2,3,4,5};
       double[] myArray2 ={1.2,2.4,3.2,4.3,5.3};
       long[] myArray3 = {1,2,3,3,2,3};
       char[] myArray4 = {'a','b','c','d'};

        //Integer Arrays
        System.out.println("Before add: ");
        printArray(myArray);

        myArray= insertToArray(myArray,2,8);
        System.out.println("After add: ");
        printArray(myArray);

        myArray =deleteFromArray(myArray,3);
        System.out.println("After delete: ");
        printArray(myArray);

        //Double Arrays
        System.out.println("Before add: ");
        printArray(myArray2);
        myArray2 = insertToArray(myArray2,2,9.9);
        System.out.println("After add: ");
        printArray(myArray2);
        myArray2 = deleteFromArray(myArray2,3);
        System.out.println("After delete: ");
        printArray(myArray2);

        //long Arrays
        System.out.println("Before add: ");
        printArray(myArray3);
        myArray3 = insertToArray(myArray3,2,8);
        System.out.println("After add: ");
        printArray(myArray3);
        myArray3 = deleteFromArray(myArray3,3);
        System.out.println("After delete: ");
        printArray(myArray3);

        //char Arrays
        System.out.println("Before add: ");
        printArray(myArray4);
        myArray4 = insertToArray(myArray4,2,8);
        System.out.println("After add: ");
        printArray(myArray4);
        myArray4 = deleteFromArray(myArray4,3);
        System.out.println("After delete: ");
        printArray(myArray4);

    }


    /*Integer array delete method*/
    public static int[] deleteFromArray(int[] myArray, int index){

        //creating a new array
        int[] result = new int[myArray.length-1];

        for (int i = 0; i < index ; i++)
            result[i] = myArray[i];

        for (int i = index; i < result.length; i++)
            result[i] = myArray[i+1];

        return result;
    }
    /*Integer array insert method*/
    public static int[] insertToArray(int[] myArray, int index, int num) {

        //creating a new array
        int[] result = new int[myArray.length+1];

        for (int i = 0; i < index; i++) {
            result[i] = myArray[i];
        }
            result[index] = num;

        for(int i = index + 1; i < myArray.length+1; i++)
            result[i] = myArray[i-1];

        return result;

    }


    /*double array delete methods*/
    public static double[] deleteFromArray(double[] myArray, int index){

        //creating a new array
        double[] result = new double[myArray.length-1];

        for (int i = 0; i < index ; i++)
            result[i] = myArray[i];

        for (int i = index; i < result.length; i++)
            result[i] = myArray[i+1];

        return result;
    }

    /*double Array insert method*/
    public static double[] insertToArray(double[] myArray, int index, double num) {

        //creating a new array
        double[] result = new double[myArray.length+1];

        for (int i = 0; i < index; i++) {
            result[i] = myArray[i];
        }
        result[index] = num;

        for(int i = index + 1; i < myArray.length+1; i++)
            result[i] = myArray[i-1];

        return result;
    }


    /*long array delete methods*/
    public static long[] deleteFromArray(long[] myArray, long index){

        //creating a new array
        long[] result = new long[myArray.length-1];

        for (int i = 0; i < index ; i++)
            result[i] = myArray[i];

        for (int i = index; i < result.length; i++)
            result[i] = myArray[i+1];

        return result;
    }

    /*long Array insert method*/
    public static long[] insertToArray(long[] myArray, int index, long num) {

        //creating a new array
        long[] result = new long[myArray.length+1];

        for (int i = 0; i < index; i++) {
            result[i] = myArray[i];
        }
        result[index] = num;

        for(int i = index + 1; i < myArray.length+1; i++)
            result[i] = myArray[i-1];

        return result;
    }


    /*char array delete methods*/
    public static char[] deleteFromArray(char[] myArray, int index){

        //creating a new array
        char[] result = new char[myArray.length-1];

        for (int i = 0; i < index ; i++)
            result[i] = myArray[i];

        for (int i = index; i < result.length; i++)
            result[i] = myArray[i+1];

        return result;
    }

    /*char Array insert method*/
    public static char[] insertToArray(char[] myArray, int index, char num) {

        //creating a new array
        char[] result = new char[myArray.length+1];

        for (int i = 0; i < index; i++) {
            result[i] = myArray[i];
        }
        result[index] = num;

        for(int i = index + 1; i < myArray.length+1; i++)
            result[i] = myArray[i-1];

        return result;
    }



    static void printArray(int myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    static void printArray(double myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
    static void printArray(long myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    static void printArray(char myArray[])
    {
        //get array length
        int n = myArray.length;
        //iterate through array and print it out
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }


}
