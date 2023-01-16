package day20_forEach;

import java.util.Arrays;


public class MergeTwoArrays {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4};
        int[]  arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length];
        // to make sure that 3rd array has enough capacity t
        // o contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {
            //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};



        System.out.println( Arrays.toString(arr2));

        System.out.println("--------------------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};



        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char[] ch2 = {'X', 'Y', 'Z'};



        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------");

        String[] c1 = {"Java", "Python", "JavaScript", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};



        System.out.println(Arrays.toString(a1));



    }

}

/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}
	        output
	            arr3 = {1,2,3,4,5,6}
 */