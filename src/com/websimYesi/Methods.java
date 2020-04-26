package com.websimYesi;

import java.util.Scanner;

public class Methods{
    public boolean pedalPressed(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 if you want to drive, else enter another number: ");
        int A = scanner.nextInt();
        boolean AA;
        if(A == 1){
            AA = true;
        }else{
            AA = false;
        }
        return AA;
    }
    public boolean stopTrigger(){
        System.out.println("To Stop the car type 1, else enter another number");
        Scanner scanner3 = new Scanner(System.in);
        int AAA = scanner3.nextInt();
        boolean STOP;
        if(AAA == 1){
            STOP= true;
        }else{
            STOP= false;
        }
        return STOP;
    }
    public boolean lightsSwitch(){
        System.out.println("The car lights are off. To turn them on, Type 1, otherwise type any other number");
        Scanner scannerLight = new Scanner(System.in);
        int PPP = scannerLight.nextInt();
        boolean ON;
       if(PPP == 1){
           ON = true;
       }else {
           ON = false;
       }
       return ON;
    }
    public int speed() {
        final int MAX_SPEED = 156;
        Scanner scanner1 = new Scanner(System.in);
        int currentSpeed1 = 0;
        System.out.println("enter desired speed: ");
        int desiredSpeed = scanner1.nextInt();
        if (desiredSpeed == currentSpeed1 & desiredSpeed < MAX_SPEED) {
            currentSpeed1 = 0;
        }
        if (desiredSpeed >= 0) {
            currentSpeed1 = desiredSpeed;
        }
        if (desiredSpeed > MAX_SPEED) {
            System.err.println("Car max speed is 156 MPH please enter a valid speed");
            System.exit(0);
        }
        System.out.println("Car is driving at: " + currentSpeed1 + "MPH");
        return currentSpeed1;
    }
}
