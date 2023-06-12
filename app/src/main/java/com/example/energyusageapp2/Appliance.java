package com.example.energyusageapp2;

public class Appliance {

    String heading;
    int titleImage;

    public Appliance(String heading, int titleImage) {
        this.heading = heading;
        this.titleImage = titleImage;
    }

    public String getHeading() {
        return heading;
    }
    public int getImage() { return titleImage;}

}
