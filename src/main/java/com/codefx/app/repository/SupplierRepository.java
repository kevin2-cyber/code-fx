package com.codefx.app.repository;

import com.codefx.app.data.model.Supplier;
import javafx.collections.ObservableList;

import java.util.List;

public class SupplierRepository implements Repository<Supplier> {

    ObservableList<Supplier> suppliers;

    @Override
    public void save(Supplier model) {
        suppliers.add(model);
    }

    @Override
    public Supplier retrieve(int id) {
        for (Supplier supplier : suppliers) {
            if (supplier.getId() == id)
                return supplier;
        }
        return null;
    }

    @Override
    public List<Supplier> retrieveAll() {
        return suppliers;
    }
}
