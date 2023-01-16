package utilities;

public class Library {

    public static void sleep(double seconds)  {

        try {
            Thread.sleep( (long)(seconds * 1000L) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}