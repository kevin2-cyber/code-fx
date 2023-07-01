package com.codefx.app.model;

import java.util.Date;

public class Doctor {
    private int patientId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String address;
    private int phoneNumber;

    public Doctor(int patientId, String firstName, String lastName, Date dob, String address, int phoneNumber) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
