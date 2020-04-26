package com.websimYesi;

public class Car {
    public static final String CAR_MAN = "Mazda";
    public static final String CAR_MODEL = "rx7";
    public static final int MAX_SPEED = 156;
    public static final String CAR_TYPE = "manual";
    public static final String VIN = "B24VG5RTO00X522PO";
    public static TextArt textArt =  new TextArt();
    public static  Methods methods =  new Methods();

    public void drive() {
        String isDriving = "Car is driving";
        if (methods.pedalPressed() == true) {
            textArt.carGO();
            System.out.println(isDriving);
        } else {
            textArt.carStop();
            System.out.println("car is not driving");
            System.exit(0);
        }
    }

    public void currentSpeed() {
        methods.speed();
    }


    public void carStats() {
        textArt.loadingScreen();
        System.out.println("Car manufacturer: " + CAR_MAN);
        System.out.println("Car model: " + CAR_MODEL);
        System.out.println("Car max speed: " + MAX_SPEED + " MPH");
        System.out.println("Car Type: " + CAR_TYPE);
        System.out.println("Car VIN:" + VIN);

    }

    public void stop() {
        if (methods.stopTrigger() == true) {
            textArt.carStop();
            System.out.println("car has stopped");
            System.out.println("have a great day!");
            System.exit(0);
        }
        else {
            textArt.carGO();
            System.out.println("Car will not stop");
        }
    }

    public void lights() {
        if (methods.lightsSwitch() == true) {
            textArt.lightsOn();
            System.out.println("headlights are on");
        }
        else {
            textArt.lightsOFF();
            System.out.println("headlights still are off");
      }
    }

}

