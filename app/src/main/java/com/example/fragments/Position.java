package com.example.fragments;

public class Position {
    private String title;
    private  String description;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static  final Position[] positions = {
            new Position("Ios Devloper","Devloping Ios APPS"),
            new Position("java developer","developing java se ee applications"),
            new Position("Android developer","Developing android appliction"),
            new Position("Firmware designer","Desgininh firmware for iot system"),
            new Position("Pathon Devloper","Devloping paython ")
    };

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
