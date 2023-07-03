package com.codefx.app.util;

import java.util.ArrayList;

public class Stack<T> {

    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(list.size(), element);
    }

    public void pop() {
        list.remove(list.size() -1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
