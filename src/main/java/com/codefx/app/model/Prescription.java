package com.codefx.app.model;

public class Prescription {
    private int medicineId;
    private String name;
    private int dosage;

    public Prescription(int medicineId, String name, int dosage) {
        this.medicineId = medicineId;
        this.name = name;
        this.dosage = dosage;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public int getDosage() {
        return dosage;
    }
}
