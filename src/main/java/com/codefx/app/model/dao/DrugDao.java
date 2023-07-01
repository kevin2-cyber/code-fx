package com.codefx.app.model.dao;

import com.codefx.app.model.Drug;

import java.util.List;

public interface DrugDao {
    Drug getDrugById(int id);
    List<Drug> getAllDrugs();
    void addDrugs(Drug drug);
    void updateDrug(Drug drug);
}
