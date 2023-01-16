package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "heart"; //"aehtr"
        String str2 = "earth"; //"aehtr"


        // String[] a1 = str1.split("");

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println("isAnagram = " + isAnagram);


    }

}

/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)
            Ex: str1 = "heart"
            	str2 = "earth"
            output:
            	true
        		str1 = "java"
        		str2 = "python"
    		output:
    			false
 */

