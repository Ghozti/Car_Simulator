package com.websimYesi;

import java.util.Scanner;

public class Boolean{
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
        Scanner scanner3 = new Scanner(System.in);
        String AAA = scanner3.next();
        boolean STOP;
        if(AAA == "Stop" ){
            STOP = true;
        }else{
            STOP = false;
        }
        return STOP;
    }
    public boolean lightsSwitch(){
        Scanner scanner4 = new Scanner(System.in);
        String PPP = scanner4.next();
        boolean AAAA = false;
       if(PPP == "on"){
           AAAA = true;
       }if(PPP == "off") {
           AAAA = false;
       }
       return AAAA;
    }
}
