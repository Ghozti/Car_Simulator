package com.websimYesi;
import java.util.Scanner;

public class Car extends Boolean{
    static final String CAR_MAN = "Mazda";
    static final String CAR_MODEL = "rx7";
    static final int MAX_SPEED = 156;
    static final String CAR_TYPE = "manual";
    static final String VIN = "B24VG5RTO00X522PO";

    public void drive(){
        String isDriving = "Car is driving";
        if(pedalPressed() == true){
            System.out.println(isDriving);
        }else{
            System.exit(0);
            System.out.println("car is not driving");
        }
    }

    public int currentSpeed(){
        Scanner scanner1 = new Scanner(System.in);
        int currentSpeed1 = 0;
        System.out.println("enter desired speed: ");
        int desiredSpeed = scanner1.nextInt();
        if(desiredSpeed == currentSpeed1 & desiredSpeed < MAX_SPEED){
           currentSpeed1 = 0;
        }
        if(desiredSpeed >= 0){
            currentSpeed1= desiredSpeed;
        }if(desiredSpeed>MAX_SPEED){
            System.err.println("Car max speed is 156 MPH please enter a valid speed");
            System.exit(0);
        }

        System.out.println("Car is driving at: "+ currentSpeed1 + "MPH");
        return currentSpeed1;
    }

    public void carStats(){
        System.out.println("Car manufacturer: "+ CAR_MAN);
        System.out.println("Car model: "+ CAR_MODEL);
        System.out.println("Car max speed: "+ MAX_SPEED+" MPH");
        System.out.println("Car Type: "+ CAR_TYPE);
        System.out.println("Car VIN:"+ VIN);

    }

    public void stop(){
        System.out.println("to stop car, type [stop]");
        System.out.println("PLEASE TYPE AS INDICATED");
        if(stopTrigger() == true){
            System.exit(0);
            System.out.println("car has stopped");
            System.out.println("have a great day!");
        }
    }
    public  void lights(){
        System.out.println("your headlights are off, to turn on your headlights type [on] to keep them off type [off]");
        System.out.println("PLEASE TYPE AS INDICATED");
        if (lightsSwitch() == true){
            System.out.println("headlights are on");
        }else{
            System.out.println("headlights still are off");
        }
    }
}
