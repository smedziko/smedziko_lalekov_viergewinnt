package main.Model;

import java.awt.*;

public class Spielstein {
    private char zeichen;
    private Color color;

    public Spielstein(char zeichen, Color color) {
        this.zeichen = zeichen;
        this.color=color;
    }

    public char getZeichen() {
        return zeichen;
    }

    public Color getColor() {
        return color;
    }
}
