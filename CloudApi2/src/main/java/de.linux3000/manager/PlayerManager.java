package de.linux3000.manager;

import de.linux3000.cache.ICacheList;
import de.linux3000.player.ICloudPlayer;


public interface PlayerManager extends ICacheList<ICloudPlayer> {


    default ICloudPlayer getCloudPlayer(String name) {
        for(ICloudPlayer player : getCache()) {
            if(player.playerName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }

    void kickPlayer(ICloudPlayer player);

}
