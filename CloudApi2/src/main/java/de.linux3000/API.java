package de.linux3000;

import de.linux3000.manager.PlayerManager;

public class API {

    private PlayerManager playerManager;

    private static API Instance;

    public API() {
        Instance = this;
        this.playerManager = new PlayerManager();
    }

    public static API getInstance() {
        if(API.Instance == null) {
            API.Instance = new API();
        }
        return API.Instance;
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}
