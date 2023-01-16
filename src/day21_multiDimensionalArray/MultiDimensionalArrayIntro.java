package day21_multiDimensionalArray;

import java.util.Arrays;

    public class MultiDimensionalArrayIntro {


        public static void main(String[] args) {

            int[] arr1 = {10, 20, 30};
            int[] arr2 = {40, 50, 60, 70, 80};
            int[] arr3 = {90, 100};
            int[] arr4 = {1000, 2000};


            System.out.println("------------------------------------");


            int[][] arr2D = {  {10, 20, 30} , {40, 50, 60, 70, 80} ,  {90, 100} }; // index: 0 ~ 2
            //  index :             0                    1                2

            System.out.println(arr2D.length);

            System.out.println( Arrays.toString( arr2D[1] ) ); // [40, 50, 60, 70, 80]
            System.out.println( Arrays.toString( arr2D[2] ) ); // [90, 100]
            System.out.println( Arrays.toString( arr2D[0] ) ); // [10, 20, 30]

            System.out.println( arr2D[2][0] ); // 90

            System.out.println( arr2D[1][2]  ); // 60





        }




}
