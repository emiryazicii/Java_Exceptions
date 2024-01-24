package exceptions_in_Java;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args)  {


        System.out.println("Enter your age : ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age > 150){
            if(age < 0){
                throw new InputMismatchException("Age should be greater than 0.");
            }else{
                throw new InputMismatchException("Age should be lees than 150");
            }
        }

        if (age > 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------------------");

        //throw new RuntimeException("Runtime exception");
        //System.out.println("Hello world");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        //throw exception;
        //throw new RuntimeException();

        //throw new Person("Serpil",52,'F');
    }
}
