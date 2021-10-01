package de.linux3000.player;

import de.linux3000.player.ICloudPlayer;

import java.util.UUID;

public class CloudPlayer implements ICloudPlayer {

    private String playerName;
    private UUID uuid;

    public CloudPlayer(String playerName, UUID uuid) {
        this.playerName = playerName;
        this.uuid = uuid;
    }

    @Override
    public String playerName() {
        return playerName;
    }

    @Override
    public UUID uuid() {
        return uuid;
    }
}
