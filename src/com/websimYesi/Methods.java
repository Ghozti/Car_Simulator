package com.websimYesi;
import java.util.Scanner;

public class Methods {

    public boolean pedalPressed() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 if you want to drive, else enter another number: ");
        int A = scanner.nextInt();
        boolean AA;
        if (A == 1) {
            AA = true;
        } else {
            AA = false;
        }
        return AA;
    }

    public boolean stopTrigger() {
        System.out.println("To Stop the car type 1, else enter another number");
        Scanner scanner3 = new Scanner(System.in);
        int AAA = scanner3.nextInt();
        boolean STOP;
        if (AAA == 1) {
            STOP = true;
        } else {
            STOP = false;
        }
        return STOP;
    }

    public boolean lightsSwitch() {
        System.out.println("The car lights are off. To turn them on, Type 1, otherwise type any other number");
        Scanner scannerLight = new Scanner(System.in);
        int PPP = scannerLight.nextInt();
        boolean ON;
        if (PPP == 1) {
            ON = true;
        } else {
            ON = false;
        }
        return ON;
    }

    public void speedAndPoliceChase() {
        Scanner scanner333 = new Scanner(System.in);
        final int SPEED_LIMIT = 65;
        final int MAX_SPEED = 156;
        int currentSpeed;
        System.out.println("Enter a desired speed: ");
        int desiredSpeed = scanner333.nextInt();
        if (desiredSpeed >= 0 && desiredSpeed <= MAX_SPEED) {
            currentSpeed = desiredSpeed;
            System.out.println("car is driving at: " + currentSpeed + " MPH");
        }
        if (desiredSpeed > MAX_SPEED) {
            System.err.println("CAR MAX SPEED IS 156 MPH PLEASE ENTER A VALID SPEED");
            System.exit(0);
        }
        if (desiredSpeed > SPEED_LIMIT) {
            System.out.println("You Have Gone Above The Speed Limit. The Police Is Now Active");
            System.out.println("You can try going faster to outrun them. Test your luck but it may end up worse for you though");
            Scanner scannerPolice = new Scanner(System.in);
            System.out.println("Enter a speed to outrun them");
            int newSpeed = scannerPolice.nextInt();
            if (newSpeed > 135) {
                System.err.println("well...You crashed into a truck and worst part is... You did not die of impact but the driver expressing the 2nd amendment");
                System.exit(0);
            }
            if (newSpeed <= 135 & newSpeed >= 75) {
                System.out.println("great job! you outran the police... you probably were driving in New York, jeez have you seen the strict traffic laws there?");
            }
            if (newSpeed <= 65) {
                System.err.println("The Police Caught You...Your Driver License Is Suspended And Worst Of All... You Have An Angry Mother");
                System.exit(0);
            }
        }
    }

    public void carRace() {
        System.out.println("Another car has challenged you to a race...do you choose to accept? PRESS [1] TO ACCEPT PRESS [0] TO DECLINE");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int accept = 1;
        int decline = 0;
        if (option == accept) {
            System.out.println("so you have chosen to accept");
            System.out.println("enter a speed to go against your opponent:");
            Scanner scanner1 = new Scanner(System.in);
            int speed = scanner1.nextInt();
            int otherCarSpeed = 0;
                while (speed != otherCarSpeed && speed <= 156) {
                otherCarSpeed++;
                 }
                if (speed > 156){
                    System.err.println("remember that the max speed limit is 156");
                    System.exit(0);
                }
                System.out.println("other car speed: " + otherCarSpeed + " seems like they are mocking you... Try going faster");
                System.out.println("Enter a new speed: ");
                Scanner scanner2 = new Scanner(System.in);
                int chosenSpeed = scanner2.nextInt();
                int opponentSpeed2 = 0;
                    while (chosenSpeed != opponentSpeed2) {
                        opponentSpeed2++;
                    }
                    System.out.println("Other car speed: "+opponentSpeed2);
                    System.out.println("Seems like going faster won't work they think you are a joke...I did not tell you this before but your car is equipped with NOS");
                    System.out.println("determine how much NOS you want to use...however be very careful...if you put too much it could lead to some very bad stuff.");
                    System.out.println("On a scale of [1-10] type how much NOS do you want to use?: ");
                    Scanner scannerNOS = new Scanner(System.in);
                    int desiredPower = scannerNOS.nextInt();
                        if (desiredPower > 6) {
                            System.err.println("well i told you not to go crazy with the NOS..You went over your limit for too long and your engine...well let's say you no longer have an engine");
                            System.exit(0);
                        }
                         if (desiredPower <= 6 && desiredPower > 3){
                             System.out.println("Congrats! you chose a right amount of power...AND you won the race! or maybe the guy crashed half a mile back...oh well ");
                         }
                            if(desiredPower <= 3){
                                System.out.println("well you got a slight speed boost but the other car was able to surpass you...");
                            }
                            if (desiredPower < 11 && desiredPower<0){
                                System.err.println("Please follow the syntax");
                                System.exit(0);
                            }
            if (option == decline) {
                System.out.println("so you declined...");
            }
            if (option != accept && option != decline) {
                System.err.println("Not a Valid Option Please Follow The Format");
                System.exit(0);
            }
        }
    }
}

