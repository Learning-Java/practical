package com.sergtm.application.factory;

import java.util.Collection;
import java.util.Map;

/**
 * Created by admin on 20.08.2016.
 */
public class Wrapper {

    private Collection collection;
    private Map map;

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Collection getCollection() {
        return collection;
    }

    public Map getMap() {
        return map;
    }
}
