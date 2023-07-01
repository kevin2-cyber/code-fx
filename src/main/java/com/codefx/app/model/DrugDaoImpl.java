package com.codefx.app.model;

import com.codefx.app.model.dao.DrugDao;

import java.util.List;

public class DrugDaoImpl implements DrugDao {

    List<Drug> drugs;

    // searching for a drug
    @Override
    public Drug getDrugById(int id) {
        for (Drug drug: drugs) {
            if (drug.getId() == id) {
                return drug;
            }
        }
        return null;
    }

    // getting all drugs from the database
    @Override
    public List<Drug> getAllDrugs() {
        return drugs;
    }

    // add a new drug
    @Override
    public void addDrugs(Drug drug) {
        drugs.add(drug);
    }

    @Override
    public void updateDrug(Drug drug) {
        for (int i = 0; i < drugs.size(); i++) {
            if (drugs.get(i).getId() == drug.getId()){
                drugs.set(i,drug);
                break;
            }
        }
    }
}
