/*package day11_practice;

public class CombineWords {
    public static void main(String[] args) {

        String yazi1 = "one";
        String yazi2 = "eight";
        String length = "";
        String print;


        if (yazi2.charAt(0) == yazi1.charAt()yazi1.length - 1))
            String.format(print.yazi1, yazi2.substring(1, yazi2.length));
        else {
            print.charAt((yazi1 + yazi2));

            System.out.println("eight");
        }

    }
}*/


   /* public static boolean karakterKontrolu(String yazi1, String yazi2) {
        int harfler = yazi2.length();
        for (int i = 0; i < yazi2.length(); i++) {
            char c = yazi2.charAt(i);

            for (int j = 0; j < yazi1.length(); j++) {
                if (c == yazi1.charAt(j)) {
                    harfler--;
                    break;
                }
            }
        }
        if (harfler == 0)
            return true;
        else
            return false;
    }

}






        /*System.out.print("\n2- o Harfi Kaçıncı İndis Numarasında: "+one.indexOf("o"));
        System.out.print("\n2- e Harfi Kaçıncı İndis Numarasında: "+eight.indexOf("e"));
        System.out.println("Enter a string: "); //user enters a word
        java.lang.String word = input.nextLine();
        System.out.print("The length of " + word + " is " +
                word.length()); //gives the number of characters in the word
        java.lang.String length = input.nextLine();
        System.out.print("The first character: " + word1.charAt(3)); //gives the first letter of word
        java.lang.String first = input.next();
        System.out.print("The last character: " + word2.charAt(0)); //gives the last letter of word
        java.lang.String last = input.next();

        System.out.print("The last character: " + word.charAt(3+0) + "The first character: "); //gives the last letter of word

        /*char data[] = {'a', 'b', 'c'};
      String str = new String(data);

Here are some more examples of how strings can be used:
      System.out.println("abc");
      String cde = "cde";
      System.out.println("abc" + cde);
      String c = "abc".substring(2,3);
      String d = cde.substring(1, 2);

    /*CombineWords adında bir sınıf oluşturun.
    Kullanıcıdan iki kelime girmesini isteyin.
    Sonra bunları toplayın ve yazdırın.
    Ancak ilk kelimenin son harfi ile son harfin ilk harfi aynıysa,
    o karakteri bir kez yazdırın.
    char data[] = {'a', 'b', 'c'};
      String str = new String(data);

Here are some more examples of how strings can be used:
      System.out.println("abc");
      String cde = "cde";
      System.out.println("abc" + cde);
      String c = "abc".substring(2,3);
      String d = cde.substring(1, 2);

    Create a class named CombineWords.
    Ask user to enter two words.
    Then add them together and print.
    But if the last letter if the first word and
    the first letter of the last letter is the same,
    print that character once.
                    Input:
                    one
                    eight
                Output:
                    oneight
   */