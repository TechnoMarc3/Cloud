package de.linux3000.manager;

import de.linux3000.cache.ICacheList;
import de.linux3000.server.CloudServer;
import de.linux3000.server.ICloudServer;

public interface CloudServerManager extends ICacheList<ICloudServer> {

    default ICloudServer getServerByName(String name) {
        for(ICloudServer server : getCache()) {
            if(server.getName().equalsIgnoreCase(name)) {
                return server;
            }
        }
        return null;
    }

    default void startNewServer(String name) {
        CloudServer server = new CloudServer(name);
        update(server);


    }


}
