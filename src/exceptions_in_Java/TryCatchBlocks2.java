package exceptions_in_Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {

    public static void main(String[] args) {


        System.out.println("Program1 started");

        int[] arr = {1,2,3,4};

        try{
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            //e.printStackTrace(); // display the full details of the exception after the execution of program
            System.out.println(e.getMessage());
        }

        System.out.println("Program1 ended");


        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Program 2 started");


        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("Program 2 ended");

        System.out.println("--------------------------------------------------------------");

        System.out.println("Program 3 started");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
