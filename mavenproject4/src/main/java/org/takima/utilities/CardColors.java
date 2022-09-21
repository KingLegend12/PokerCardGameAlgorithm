package org.takima.utilities;

public enum CardColors {

    SQUARE("square"),
    SPADE("spade"),
    CLUB("club"),
    HEARTH("hearth");

    private final String name;

    CardColors(String name) {
        this.name = name;
    }

    public String getName() { // CR: This getter should be used
        return name;
    }

}
