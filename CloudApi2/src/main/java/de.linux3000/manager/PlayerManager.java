package de.linux3000.manager;

import de.linux3000.cache.CacheList;
import de.linux3000.player.ICloudPlayer;


public class PlayerManager extends CacheList<ICloudPlayer> {


    public ICloudPlayer getCloudPlayer(String name) {
        for(ICloudPlayer player : getCache()) {
            if(player.playerName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }

}
