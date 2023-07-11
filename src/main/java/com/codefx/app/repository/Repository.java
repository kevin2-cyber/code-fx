package com.codefx.app.repository;

import java.util.List;

public interface Repository <T> {
    public void save(T model);

    public T retrieve(int id);
    public List<T> retrieveAll();
}
