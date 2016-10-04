package com.sergtm.application.factory;

import com.sergtm.application.Interface.IPrintable;

/**
 * Created by admin on 20.08.2016.
 */
public class Factory {
    public IPrintable create(CollectionType type, Wrapper wrapper){
        IPrintable iPrintable = null;
        if(type.equals(CollectionType.COLLECTION)){
            iPrintable = new PrintCollection(wrapper.getCollection());
        }else if(type.equals(CollectionType.MAP)){
            iPrintable = new PrintMap(wrapper.getMap());
        }
        return iPrintable;
    }
}
