package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'D';

        switch(switchValue){

            case 'A':
                System.out.println("The value is A");
                break;

            case 'B':
                System.out.println("The value is B");
                break;

            case 'C':case 'D':case 'E':
                System.out.println("C, D or E");
                break;

            default:
                System.out.println("default");
                break;
        }
    }
}
