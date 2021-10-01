package de.linux3000;

import de.linux3000.manager.DefaultPlayerManager;
import de.linux3000.manager.PlayerManager;
import de.linux3000.player.ICloudPlayer;

import java.util.List;

public class API {

    private PlayerManager playerManager;

    private static API Instance;

    public API() {

        Instance = this;
        this.playerManager = new DefaultPlayerManager();
    }

    public static API getInstance() {

        if(API.Instance == null) {
            API.Instance = new API();
        }
        System.out.println(API.Instance);
        return API.Instance;
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}
