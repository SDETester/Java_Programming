package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if( result.contains( ""+str.charAt(i) )){ // if the character is already contained in new string
                continue; // skip it
            }

            result += str.charAt(i);

        }


        System.out.println(result);



    }


}


/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */
