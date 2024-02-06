package exceptions_in_Java.practices;

public class Garden {

    private double o2Level , waterLevel;

    public Garden(double o2Level, double waterLevel) {
        setO2Level(o2Level);
        setWaterLevel(waterLevel);
    }

    public double getO2Level() {
        return o2Level;
    }

    public void setO2Level(double o2Level) {
        this.o2Level = o2Level;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void runSprinkler(){
        if(waterLevel < 20){
            throw new NotEnoughWaterException();
        }else {
            System.out.println("Sprinkler running.");
        }
    }

    public void grow() throws NotEnoughOxygenException{
        if (o2Level < 10){
            throw new NotEnoughOxygenException();
        }else {
            System.out.println("Plant is growing");
        }
    }
}
