package com.vinothmasilamani;

/**
 * Created by vinoth on 27-Nov-17.
 */
public class Contacts {
        private String contactName;
        private String contactNumber;

    public Contacts(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
