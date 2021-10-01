package de.linux3000.cache;

import java.util.ArrayList;
import java.util.List;

public class CacheList <T extends CacheValue> implements ICacheList<T>{

    private List<T> cache = new ArrayList<>();

    @Override
    public List<T> getCache() {
        return cache;
    }

    @Override
    public void update(T toAdd) {
        cache.remove(toAdd);
        cache.add(toAdd);
    }
}
