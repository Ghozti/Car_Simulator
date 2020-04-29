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

    public int speedAndPoliceChase() {
        Scanner scanner333 = new Scanner(System.in);
        final int SPEED_LIMIT = 65;
        final int MAX_SPEED = 156;
        int currentSpeed= 0;
        System.out.println("Enter a desired speed: ");
        int desiredSpeed = scanner333.nextInt();
        if(desiredSpeed>=0 && desiredSpeed <= MAX_SPEED){
            currentSpeed = desiredSpeed;
            System.out.println("car is driving at: "+ currentSpeed + " MPH");
        }
        if (desiredSpeed > MAX_SPEED){
            System.err.println("CAR MAX SPEED IS 156 MPH PLEASE ENTER A VALID SPEED");
            System.exit(0);
        }
        if (desiredSpeed > SPEED_LIMIT){
            System.out.println("You Have Gone Above The Speed Limit. The Police Is Now Active");
            System.out.println("You can try going faster to outrun them. Test your luck but it may end up worse for you though");
            Scanner scannerPolice = new Scanner(System.in);
            System.out.println("Enter a speed to outrun them");
            int newSpeed = scannerPolice.nextInt();
            if(newSpeed > 135){
                System.err.println("well...You crashed into a truck and worst part is... You did not die of impact but the driver expressing the 2nd amendment");
                System.exit(0);
            }
            if(newSpeed <= 135 & newSpeed >= 65){
                System.out.println("great job! you outran the police... you probably were driving in New York, jeez have you seen the strict traffic laws there?");
            }
            if (newSpeed <= 65 ){
                System.err.println("The Police Caught You...Your Driver License Is Suspended And Worst Of All... You Have An Angry Mother");
                System.exit(0);
            }
        }
        return currentSpeed;
    }
}
