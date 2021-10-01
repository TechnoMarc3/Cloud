package de.linux3000.server;

public class CloudServer implements ICloudServer{
    private String name;

    public CloudServer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }
}
