package com.codefx.app.model.dao;

import java.util.List;

public interface Dao<T> {
    T getItemById(int id);
    List<T> getAllItems();
    void addDrugs(T item);
    void updateDrug(T item);
    void deleteDrug(int id);
}
