package audi1;

import org.prog.Car;

public class les {

    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();

        carOne.color = "red";
        carTwo.color = "blue";

        carOne.goTo("Kiev");
        carTwo.goTo("Lviv");

//        System.out.println("carOne color is" + carOne.color  );
//        System.out.println("carTwo color is"+ carTwo.color);
//
//        carTwo.color = "yellow";
//        System.out.println("carTwo color is"+ carTwo.color);
    }
}
