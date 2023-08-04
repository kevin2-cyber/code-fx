package com.codefx.app.repository;

import com.codefx.app.model.PurchasedDrug;
import com.codefx.app.util.ObservableStack;

import java.util.List;

public class PurchasedDrugRepository implements Repository<PurchasedDrug> {

    ObservableStack<PurchasedDrug> purchasedDrugs;

    @Override
    public void save(PurchasedDrug model) {
        purchasedDrugs.add(model);
    }

    @Override
    public PurchasedDrug retrieve(int id) {
        for (PurchasedDrug drug : purchasedDrugs) {
            if (drug.getId() == id)
                return drug;
        }
        return null;
    }

    @Override
    public List<PurchasedDrug> retrieveAll() {
        return purchasedDrugs;
    }
}
