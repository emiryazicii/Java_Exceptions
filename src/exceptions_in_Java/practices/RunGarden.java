package exceptions_in_Java.practices;

public class RunGarden {

    public static void main(String[] args) {


        Garden garden = new Garden(-20,-20);

        garden.runSprinkler();

        try {
            garden.grow();
        } catch (NotEnoughOxygenException e) {
            e.printStackTrace();
        }
    }
}
