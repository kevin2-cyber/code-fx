package com.codefx.app.repository;

import com.codefx.app.data.model.Drug;
import com.codefx.app.util.ObservableQueue;

import java.util.List;

public class DrugRepository implements Repository<Drug> {

    ObservableQueue<Drug> drugs;

    @Override
    public void save(Drug model) {
        drugs.add(model);
    }

    @Override
    public Drug retrieve(int id) {
        for (Drug drug : drugs) {
            if (drug.getId() == id)
                return drug;
        }
        return null;
    }

    @Override
    public List<Drug> retrieveAll() {
        return drugs;
    }
}
