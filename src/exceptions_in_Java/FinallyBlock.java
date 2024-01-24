package exceptions_in_Java;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime exception has been caught");
            e.printStackTrace();
            // System.exit(1);
        }finally {
            System.out.println("Finally block ");
        }
    }
}
