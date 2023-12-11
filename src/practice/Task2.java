package practice;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Double> price  = new ArrayList<>();

        price.add(15.5);
        price.add(30.0);
        price.add(45.5);
        price.add(17.2);

        for (Double i:price) {
            System.out.print(i + "  ");
        }
        System.out.println("\n--------");

        price.set(2,50.0);


        System.out.println("Обновленные цены:");
        for (Double i:price) {
            System.out.print(i + "  ");
        }
    }
}
