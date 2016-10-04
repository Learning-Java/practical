package com.sergtm.application.factory;

import com.sergtm.application.Interface.IPrintable;

import java.util.Map;

/**
 * Created by admin on 20.08.2016.
 */
public class PrintMap<K, V> implements IPrintable {
    Map<K, V> map;
    public PrintMap(Map<K, V> map) {
        this.map = map;

    }

    @Override
    public void print() {
        map.entrySet().forEach(e -> System.out.println(e.getValue()));
    }
}
