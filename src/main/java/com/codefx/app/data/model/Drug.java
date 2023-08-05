package com.codefx.app.data.model;

public class Drug {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private int code;   // drug code

    public Drug(int id, String name, String description, double price, int quantity, int code) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }

    public Drug(String name, String description, double price, int quantity, int code) {
        this.id = 0;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
