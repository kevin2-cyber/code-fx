package com.codefx.app.model;

public class Drug {
    private int id;
    private String manufacturer;

    public Drug(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
