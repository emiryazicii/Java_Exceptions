package exceptions_in_Java;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";
        //char ch = str.charAt(250); // unchecked exception
        //System.out.println(ch);

        Pizza pizza = null;
        // pizza.calculateCost(); // unchecked exception

        //System.out.println(15 / 0); // unchecked exception

        System.out.println("Hello World");

        System.out.println("--------------------------------------------------------------");

        int score = 100 ;

        if(score > 59 ){
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }

        System.out.println("------------------------------------------------------------------");

        //  FileInputStream file = new FileInputStream("");  //checked exception

        // Thread.sleep(3000); // checked exception
    }
}
