package com.sergtm.application.factory;

import com.sergtm.application.Interface.IPrintable;

import java.util.Collection;

/**
 * Created by admin on 20.08.2016.
 */
public class PrintCollection<T> implements IPrintable {
    Collection<T> collection;

    public PrintCollection(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void print() {
        collection.forEach(System.out::println);
    }
}
