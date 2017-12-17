package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {
        /*int inputValue = 99;
        if(isEvenNumber(inputValue)){
            System.out.println(inputValue + " is an even number.");
        }
        else{
            System.out.println(inputValue + " is an odd number.");
        }*/

        int startNumber = 10;
        int endNumber = 50;
        int inputValue = startNumber;
        int count = 0;

        /*while (inputValue <= endNumber){
            if(isEvenNumber(inputValue)){
                System.out.println(inputValue);
                count++;
            }
            inputValue++;
        }
        System.out.println("No. of even numbers between " + startNumber + " and " + endNumber + ": " + count);
        */

        do{
            if(isEvenNumber(inputValue)){
                System.out.println(inputValue);
                count++;
            }
            inputValue++;
        }while(count <= 5);

        }

    public static boolean isEvenNumber(int inputValue){
        if(inputValue%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
