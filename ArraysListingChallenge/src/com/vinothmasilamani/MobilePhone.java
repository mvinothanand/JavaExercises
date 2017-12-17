package com.vinothmasilamani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vinoth on 27-Nov-17.
 */
public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone() {
        this.myContacts = new ArrayList<Contacts>();
    }


    /* This function exposes the Contacts module of the mobile phone.
        This function of the mobile phone shall be accessed in the Main class to access the operations of the contact.
    */
    public void AccessContacts(){
        boolean quit = false;
        int chosenOption;

        ContactList.ListContactOptions();

        while(!quit){

            System.out.println("What do you want to do on the Contacts? ");
            chosenOption = scanner.nextInt();
            System.out.println("Chosen Option is "+ chosenOption);

            switch (chosenOption){
                case 0:
                    ContactList.ListContactOptions();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 5:
                    System.out.println("Quiting Contacts.");
                    quit = true;
                    break;
                default:
                    ContactList.ListContactOptions();
                    break;
            }
        }
    }

    public static boolean addContact(){
        System.out.println("Provide these details of the contact you want to add.");
        System.out.println("Contact Name: ");
        String newContactName = scanner.next();
        System.out.println("Contact Number: ");
        String newContactNumber = scanner.next();

        Contacts newContact = new Contacts(newContactName, newContactNumber);

        boolean result = myContacts.add(newContact);
        if(result) {
            System.out.println("Contact added: " + newContact.getContactName() + " " + newContact.getContactNumber());
            System.out.println("You have " + myContacts.size() + " contacts in your directory.");
        }
        return result;
    }

    public boolean findContact(){
        System.out.println("Provide the name of the contact you want to find: ");
        String contactName = scanner.next();
/*
        System.out.println("Provide the number of the contact you want to find: ");
        String contactNumber = scanner.next();

        Contacts searchItem = new Contacts(contactName, contactNumber);

        int contactIndex = myContacts.indexOf(searchItem);
        System.out.println("contactIndex: " + contactIndex);
        if(contactIndex >= 0){
            System.out.println("Contact Found.");
            Contacts matchedContact = myContacts.get(contactIndex);

            System.out.println("Name: " + matchedContact.getContactNumber());
            System.out.println("Number: " + matchedContact.getContactName());
        }
        else{
            System.out.println("Contact not found.");
            return false;
        }
*/
        for(int i =0; i < myContacts.size(); i++){
            Contacts contact = myContacts.get(i);
            if(contact.getContactName().equals(contactName)){
                System.out.println("Contact " + contactName + " found.");
                return true;
            }
        }

        System.out.println("Contact " + contactName + " not found.");
        return false;
    }

    private int findContact(String contactName){

        for(int i =0; i < myContacts.size(); i++){
            Contacts contact = myContacts.get(i);
            if(contact.getContactName().equals(contactName)){
                System.out.println("Contact " + contactName + " found.");
                return i;
            }
        }
        System.out.println("Contact " + contactName + " not found.");
        return -1;
    }

    public boolean removeContact(){
        System.out.println("Provide the contact name to be removed.");
        String contactName = scanner.next();
        int contactIndex = findContact(contactName);
        if( contactIndex >= 0){
            myContacts.remove(contactIndex);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean updateContact(){
        System.out.println("Provide the contact name to be updated.");
        String contactName = scanner.next();
        int contactIndex = findContact(contactName);
        if(contactIndex >=0){
            System.out.println("Provide the new contact name: ");
            String newName = scanner.next();
            System.out.println("Provide the new number:");
            String newNumber = scanner.next();

            Contacts newContact = new Contacts(newName, newNumber);
            myContacts.set(contactIndex, newContact);

            System.out.println("Contact updated.");
        }
        else{
            System.out.println("Contact not found.");
            return false;
        }
        return true;
    }

}
