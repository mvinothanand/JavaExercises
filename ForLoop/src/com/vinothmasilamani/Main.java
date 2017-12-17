package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        double amount = 10000.0;

        /*
        for(double i=2.0; i<9; i++){
            System.out.println("Interest at " + i + "% = " + calculateInterest(amount, i));
        }*/

/*        for(int i=8; i>1; i--){
            System.out.println("Interest at " + i + "% = " + String.format("%.2f",calculateInterest(amount, (double)i)));
        }*/

       // System.out.println(isPrime(137));

        int count = 0;
        for(int i = 1; i <= 100; i ++){
            if (isPrime(i)){

                count += 1;
                System.out.println(count + ". " + i);
                if (count == 10){
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double intRate){
        return amount * (intRate / 100);
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        //for(int i = 2; i <= n/2; i++){
        // Using a square root function optimizes the loop.
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            //System.out.println("i is " + i);
            if ((n % i) == 0){
                return false;
            }
        }
        return true;
    }
}
