package exceptions_in_Java;

import library_test.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1();

        Library.sleep(3.5);

        //method2();
    }

    public static void pausedFor5seconds() throws InterruptedException {

        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException {

        System.out.println("Hello World");
        pausedFor5seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws InterruptedException, FileNotFoundException {
        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program enden");

        new FileInputStream("");

        Thread.sleep(5000);
    }
}
