package main.ctrl;

import java.awt.*;

public class Spielstein {
    private final char zeichen;
    private final String color;

    public Spielstein(char zeichen, String color) {
        this.zeichen = zeichen;
        this.color= String.valueOf(color);
    }

    public char getZeichen() {
        return zeichen;
    }

    public String getColor() {
        return color;
    }
}
