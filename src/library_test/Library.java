package library_test;

public class Library {

    public static void sleep(double seconds) {

        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
