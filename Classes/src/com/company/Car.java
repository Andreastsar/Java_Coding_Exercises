package com.company;

import java.util.Locale;

public class Car {
    // fields of class (χαρακτηριστικα της κλασης)
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {

        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;  // ενημερωνει το περιεχομενο της μεταβλητης από το private String model με το περιεχομενο της παραμετρου model της μεθοδου setModel
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }
}
