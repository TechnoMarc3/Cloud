package de.linux3000.manager;


import de.linux3000.player.ICloudPlayer;

public class DefaultPlayerManager extends AbstractCloudPlayerManager {


    @Override
    public void kickPlayer(ICloudPlayer player) {
        System.out.println("normal");
    }
}
