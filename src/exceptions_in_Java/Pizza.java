package exceptions_in_Java;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopics, int numberOfPepperoniTopics) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopics);
        setNumberOfPepperoniTopping(numberOfPepperoniTopics);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calculateCost() {

        int totalPrice = 0;

        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size: " + size);
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calculateCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) { // if the specified object is not pizza
            System.err.println("Invalid object");
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;

        if (size == pizza.size) {
            if (numberOfPepperoniTopping == pizza.numberOfPepperoniTopping) {
                return true;
            }
        }
        return false;
    }
}
