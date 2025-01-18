package audi1;

import org.w3c.dom.ls.LSOutput;

public class les1 {
    public String color;

    public void goTo(String destination) {
        System.out.println("Going to "+ destination);
        if (color.equals("blue")) {
            System.out.println(color + " car is moving fast");
        } else {
            System.out.println(color + " car is moving slow");
        }
    }

}
