import java.util.ArrayList;

public class Team {
    // Opgave 1.c: Privat instansvariabel for holdets navn
    private String name;
    // Opgave 1.d: Privat instansvariabel for holdets rang
    private int rank;
    // Opgave 1.e: Privat instansvariabel for spillernavnene i holdet
    private ArrayList<String> players;

    // Opgave 1.f: Konstruktør med en parameter for at instantiere holdet med et holdnavn
    public Team(String teamName) {
        this.name = teamName;
        this.players = new ArrayList<>();
    }

    // Opgave 1.h: Metode til at sætte rang for holdet
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Opgave 1.l: Metode til at tilføje en spiller
    public void addPlayer(String player) {
        this.players.add(player);
    }

    // Opgave 1.j: Override toString metoden for at returnere en formatteret streng
    @Override
    public String toString() {
        // Formaterer udskriften for holdets navn og rang samt spillernavnene
        StringBuilder result = new StringBuilder("Hold: " + name + " Rang: " + rank);
        for (String player : players) {
            result.append("\n").append(player);
        }
        return result.toString();
    }
}