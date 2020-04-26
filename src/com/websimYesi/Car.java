package com.websimYesi;
import java.util.Scanner;

public class Car extends Methods {
    public static final String CAR_MAN = "Mazda";
    public static final String CAR_MODEL = "rx7";
    public static final int MAX_SPEED = 156;
    public static final String CAR_TYPE = "manual";
    public static final String VIN = "B24VG5RTO00X522PO";

    public void drive() {
        String isDriving = "Car is driving";
        if (pedalPressed() == true) {
            System.out.println(isDriving);
        } else {
            System.exit(0);
            System.out.println("car is not driving");
        }
    }

    public void currentSpeed() {
    }


    public void carStats() {
        System.out.println("Car manufacturer: " + CAR_MAN);
        System.out.println("Car model: " + CAR_MODEL);
        System.out.println("Car max speed: " + MAX_SPEED + " MPH");
        System.out.println("Car Type: " + CAR_TYPE);
        System.out.println("Car VIN:" + VIN);

    }

    public void stop() {
        if (stopTrigger() == true) {
            System.exit(0);
            System.out.println("car has stopped");
            System.out.println("have a great day!");
        }
        else {
            System.out.println("Car will not stop");
        }
    }

    public void lights() {
        if (lightsSwitch() == true) {
            System.out.println("headlights are on");
        }
        else {
            System.out.println("headlights still are off");
        }
    }

}

