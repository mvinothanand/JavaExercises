package com.vinothmasilamani;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vinoth on 03-Dec-17.
 */
public class ContactList {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> myContacts;

    public ContactList() {
        myContacts = new ArrayList<Contacts>();
    }

    public static void ListContactOptions(){
        System.out.println("Contacts - Options: ");
        System.out.println("\t 0 - List Options");
        System.out.println("\t 1 - New Contact");
        System.out.println("\t 2 - Update Contact");
        System.out.println("\t 3 - Delete Contact");
        System.out.println("\t 4 - Find a Contact");
        System.out.println("\t 5 - Quit");
    }

}
