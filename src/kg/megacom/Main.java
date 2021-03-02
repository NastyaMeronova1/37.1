package kg.megacom;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("Rolls-Royce Ghost");
        cars.push("Rolls-Royce Wraith");
        cars.push("Rolls-Royce Dawn");
        cars.push("Rolls-Royce Phantom");
        cars.push("Rolls-Royce Cullinan");
        System.out.println("Car list_________");
        cars.forEach(System.out::println);
        System.out.println("\nDeleted car_________");
        String deletedCar = cars.pop();
        System.out.println(deletedCar);
        System.out.println();
        int lastCar = cars.search("Rolls-Royce Ghost");
        System.out.println("Printed the last item after deleting " + lastCar);
        int firstCar = cars.search("Rolls-Royce Phantom");
        System.out.println("Printed the first item after deleting " + firstCar);
    }
}
