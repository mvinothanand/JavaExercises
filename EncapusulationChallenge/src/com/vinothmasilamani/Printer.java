package com.vinothmasilamani;

/**
 * Created by vinoth on 14-Oct-17.
 */
public class Printer {

    private Toner toner;
    private int noOfPages;
    public boolean isDuplex;

    public Printer(Toner toner, int noOfPages, boolean isDuplex) {
        this.toner = toner;
        this.noOfPages = noOfPages;
        this.isDuplex = isDuplex;
    }

    public void print(int noOfPages){

        if(!checkTonerAvailability(noOfPages)){
            System.out.println("INSUFFICIENT TONER LEVEL. REQUIRED: " + (noOfPages*.5) + " AVAILABLE: " + toner.getTonerLevel());
            return;
        }

        if(isDuplex){
            this.noOfPages += (noOfPages/2);
        }
        else{
            this.noOfPages += noOfPages;
        }

        System.out.println("Pages printed: " + noOfPages + "; Total pages printed: " + this.noOfPages);

        this.toner.reduceTonerLevel(noOfPages);
        System.out.println("Toner level: " + toner.getTonerLevel() + "%");

        if ((toner.getTonerLevel() < 20) && (toner.getTonerLevel() > 0 )){
            System.out.println("TONER LEVEL LOW @ " + toner.getTonerLevel() + " !! REFILL SOON");
        }
    }

    private boolean checkTonerAvailability(int noOfPages){
        if (toner.getTonerLevel() < (noOfPages*.5)){
            return false;
        }
        return true;
    }

    public void Refilltoner(){
        this.toner.setTonerLevel(100);
        System.out.println("REFILL DONE!! Toner level: " + toner.getTonerLevel() + "%");
    }
}
