package com.example.KvikMaler2.ui.services;

public class Services {
    private String name;
    private int iconId;

    Services (String name, int iconId) {
        this.name=name;
        this.iconId= iconId;
    }

    public String getName() {
        return name;
    }

    public int getIconId() {
        return iconId;
    }
}
