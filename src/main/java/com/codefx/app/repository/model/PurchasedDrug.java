package com.codefx.app.repository.model;

public class PurchasedDrug {
    private int id;
    private int drugCode;
    private int quantity;   // quantity of drug purchased
    private long timestamp;  // time and date of purchase

    public PurchasedDrug(int id, int drugCode, int quantity, long timestamp) {
        this.id = id;
        this.drugCode = drugCode;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public PurchasedDrug(int drugCode, int quantity, long timestamp) {
        this.id = 0;
        this.drugCode = drugCode;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(int drugCode) {
        this.drugCode = drugCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
