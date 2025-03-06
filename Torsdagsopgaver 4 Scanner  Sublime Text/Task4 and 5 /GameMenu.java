import java.util.ArrayList; // Importer ArrayList klassen fra java.util pakken
import java.util.Scanner; // Importer Scanner klassen fra java.util til at læse brugerinput

// Opgave 4.a Opretter en klasse GameMenu
public class GameMenu {
    // 4.b Tilføjer en privat instansvariabel actions af typen ArrayList<String>
    private ArrayList<String> actions;

    // 4.c Tilføjer en konstruktør med en parameter af typen ArrayList
    public GameMenu(ArrayList<String> actions) {
        // 4.d konstruktøren tildeler listen modtaget som argument til instansvariablen actions
        this.actions = actions;
    }

    // 4.h Tilføjer en metode displayMenu() til at udskrive elementerne i actions
    public void displayMenu() {
        // Gennemløb alle elementerne i actions og print dem
        for (String action : actions) { // for-each loop til at itererer over alle elementerne i listen
            System.out.println(action);
        }
    }

    // 5.a Tilføjer en metode getAction() til at få brugerens valg
    public String getAction() {
        // Udskriver beskeden og menuen
        System.out.println("Type a number to choose an action:");
        // Kalder displayMenu() metoden for at vise selve menuen
        displayMenu();

        // Opretter Scanner objekt og læser brugerens input
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine(); // Læ

        // 5.c Returner brugerens valg
        return choice; // Retuner den streng soem brugeren har indtastet. 
    }
}
