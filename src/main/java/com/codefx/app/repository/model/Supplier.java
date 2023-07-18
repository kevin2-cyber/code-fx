package com.codefx.app.repository.model;

public class Supplier {
    private int id;
    private String name;
    private int drugCode;

    public Supplier(int id, String name, int drugCode) {
        this.id = id;
        this.name = name;
        this.drugCode = drugCode;
    }

    public Supplier(String name, int drugCode) {
        this.id = 0;
        this.name = name;
        this.drugCode = drugCode;
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

    public int getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(int drugCode) {
        this.drugCode = drugCode;
    }
}
