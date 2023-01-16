package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    //  public static ExcelSheet sheet;


    static {
        a = 100;
        b = 20.5;
        c = "Java";
    }
}


    /*
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/



    /*
    public static void main(String[] args) {
        a = 100;
        b = 20.5;
        c = "Java";
    }
*/
