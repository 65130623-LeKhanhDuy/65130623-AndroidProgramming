package com.example.th9;

public class LandScape {
    private String imageFileName;
    private String caption;

    public LandScape(String imageFileName, String caption) {
        this.imageFileName = imageFileName;
        this.caption = caption;
    }

    public String getImageFileName() { return imageFileName; }
    public String getCaption() { return caption; }
}