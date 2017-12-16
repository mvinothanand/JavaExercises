package com.vinothmasilamani;

import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int[] inputValues = getIntegers(10);
//        System.out.println("Provided Values:");
//        printArray(inputValues);
        System.out.println("Sorted Values: ");
        printArray(sortArray(inputValues));
    }

    public static int[] getIntegers (int number){
        System.out.println("Enter " + number + " numbers to be sorted: \r");
        int[] enteredNumbers = new int[number];

        for(int i=0; i<number; i++){
            enteredNumbers[i] = scanner.nextInt();
//            System.out.println("Getting number " + i + " " + enteredNumbers[i]);
        }
        return enteredNumbers;
    }

    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.print("Element " + i + ": " + array[i]);
        }
    }

    public static int[] sortArray(int[] array){

//        int[] sortedArray = new int[array.length];
        int temp;
        int swapPosition;

        for(int i =0; i < array.length; i++){
            temp = array[i];
            swapPosition = i;

//            System.out.println(" i = " + i);

            for(int j = i+1; j < array.length ; j++){
//                System.out.println("j = " + j);

//                System.out.println("temp = " + temp + "; array[j] = " + array[j]);
                if(!(temp > array[j])){
                    temp = array[j];
                    swapPosition = j;
                }
            }

//            sortedArray[i] = temp;
            if(swapPosition != i){
                array[swapPosition] = array[i];
                array[i] = temp;
            }

        }
        /*System.out.println("Values in temp Array:");
        printArray(array);*/

        return array;
    }

}
