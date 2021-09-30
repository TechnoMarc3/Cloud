package de.linux3000.player;


import de.linux3000.cache.CacheValue;

import java.util.UUID;

public interface ICloudPlayer extends CacheValue {


    String playerName();
    UUID uuid();

}
