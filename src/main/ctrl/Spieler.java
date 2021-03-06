package main.ctrl;

public class Spieler {
    //Name des Spielers
    private final String name;
    //Spielfeld
    private final int spielstein;

    //Konstruktor für den Spieler
    public Spieler(String name, int spielstein) {
        this.name = name;
        this.spielstein = spielstein;
    }

    //getName() --> holt sich den Namen vom Spieler
    public String getName() {
        return name;
    }

    //getSpielstein() --> holt sich die Daten vom Spielstein (Farbe, Symbol, ...)
    public int getSpielstein() {
        return spielstein;
    }
}
