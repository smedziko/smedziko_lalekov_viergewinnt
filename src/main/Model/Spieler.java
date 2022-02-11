package main.Model;

public class Spieler {
    //Name des Spielers
    private final String name;
    //Spielfeld
    private Spielstein[] spielstein = new Spielstein[21];

    //Konstruktor für den Spieler
    public Spieler(String name, Spielstein[] spielstein) {
        this.name = name;
        this.spielstein = spielstein;
    }
    //getName() --> holt sich den Namen vom Spieler
    public String getName() {
        return name;
    }
    //getSpielstein() --> holt sich die Daten vom Spielstein (Farbe, Symbol, ...)
    public Spielstein[] getSpielstein(){
        return spielstein;
    }
}
