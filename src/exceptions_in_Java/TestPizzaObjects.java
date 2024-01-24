package exceptions_in_Java;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',3,3);

        System.out.println(pizza1 == pizza2);

        System.out.println(pizza1.equals(pizza2));

        Object obj = new Pizza('S',4,3); // upcasting (done implicitly)
        boolean r = obj.equals(pizza2);

        System.out.println(r);

        int total = ((Pizza)obj).calculateCost();

        System.out.println(total);

        // double area = ((Circle)obj).area();

        // System.out.println(area);
    }
}
