package de.linux3000.cache;

import java.util.List;

public interface ICacheList<T extends CacheValue>{


    List<T> getCache();

     void update(T toAdd) ;

}
