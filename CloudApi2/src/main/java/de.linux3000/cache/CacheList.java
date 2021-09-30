package de.linux3000.cache;


import java.util.ArrayList;
import java.util.List;

public abstract class CacheList<T extends CacheValue>{

    private final List<T> cache = new ArrayList<>();


    public List<T> getCache() {
        return cache;
    }

    public void update(T toAdd) {
        if(cache.contains(toAdd)) {
            cache.remove(toAdd);
        }
        cache.add(toAdd);
    }

}
