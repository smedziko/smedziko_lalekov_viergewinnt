package main.Model;

public class Spieler {
    private String name;
    private Spielstein[] spielstein = new Spielstein[21];


    public Spieler(String name, Spielstein[] spielstein) {
        this.name = name;
        this.spielstein = spielstein;
    }

    public String getName() {
        return name;
    }
    public Spielstein[] getSpielstein(){
        return spielstein;
    }
}
