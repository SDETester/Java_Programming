package day06_practice;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 1111111;
        int n2 = 1111112;
        int n3 = 1111113 ;
        int n4 = 1111114 ;
        int n5= 1111115;

        String result = " " ;

        if (n1 == n2 &&  n2 == n3){
            result = " all equal" ;
        }
        if ( n1 == n2 && n1 != n3 && n1 == n5 && n2 ==n5) {
            result  = "n1&n2 && n2&n5 are equal ";
        }
        if ( n2 == n3 && n1 != n3){
            result = " n2&n3 are equal";
        }
        if ( n3 == n1 && n2 != n1) {
            result = "n3&n1 are equal";
        }
        if (n1 != n2 && n2 != n3 && n3 != n4 && n4 != n5) {
            result = " none of them are equal";
        }
        System.out.println(result);
    }
}

/*
if all are equal ==> print "all equal"
                  if only n1 and n2 are equal  =>print  "n1&n2 are equal"
                   if only n2 and n3 are equal ==>print "n2&n3 are equal"
                   if only n3 and n1 are equal ==>print "n3&n1 are equal"
                if none of them are euqal ==> none of them are equal
 */

