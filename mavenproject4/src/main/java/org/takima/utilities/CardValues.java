package org.takima.utilities;

public enum CardValues {

    ACE("Ace", 1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13);

    private final String name;

    private final int value;

    CardValues(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { // CR: Tu n'utilise pas ce getter. Dommage, il doit être utile!
        return name;
    }

    public int getValue() { // CR: Tu n'utilise pas ce getter. Dommage, il doit être utile!
        return value;
    }

}
