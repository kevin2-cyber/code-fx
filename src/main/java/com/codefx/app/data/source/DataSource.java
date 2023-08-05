package com.codefx.app.data.source;

import com.codefx.app.repository.Repository;

import java.util.List;

public interface DataSource<T> extends Repository<T> {

    @Override
    void save(T model);

    @Override
    T retrieve(int id);

    @Override
    List<T> retrieveAll();
}
