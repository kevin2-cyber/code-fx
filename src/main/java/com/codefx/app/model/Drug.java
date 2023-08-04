package com.codefx.app.model;

public class Drug {
    private int id;
    private String name;
    private int quantity;
    private String manufacturer;

    public Drug(int id,String name,int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
