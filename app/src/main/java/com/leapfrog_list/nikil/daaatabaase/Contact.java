package com.leapfrog_list.nikil.daaatabaase;

/**
 * Created by Nikil on 9/1/2016.
 */
public class Contact {
    private String name;
    private  String address;
    private String contactID;
    private String gender;

    public Contact(String name, String address, String contactID, String gender) {
        this.name = name;
        this.address = address;
        this.contactID = contactID;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
