import java.util.ArrayList; // Importer ArrayList klassen fra java.util pakken

// Opretter Main klassen
public class Main {
    // 5.e Metoden til at udføre handling baseret på brugerens valg
    public static void doAction(int action) {
        // Bruger switch-case til at håndtere de forskellige valg
        switch (action) {
            case 1:
                // Hvis en brugere vælger 1 bliver der printet den her bedsked: 
                System.out.println("Spillet starter nu");
                break;
            case 2:
                System.out.println("Henter tidligere gemte spildata");
                break;
            case 3:
                System.out.println("Spillet er på pause");
                break;
            case 4:
                System.out.println("Spillet slutter");
                break;
            default:
                System.out.println("Ugyldigt valg");
                break;
        }
    }

    // main metode til at køre programmet
    public static void main(String[] args) {
        // 4.f Opretter ArrayList<String> som kaldes actions
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start spil"); // Tilføjer "Start spil" til listen
        actions.add("2) Forsæt spil"); // Tilføjer "Forsæt spil" til listen
        actions.add("3) Pause spil"); // Tilføjer "Pause spil" til listen
        actions.add("4) Afslut spil"); // Tilføjer "Afslut spil" til listen

        // Test actions ArrayList
        System.out.println(actions.get(2)); // Forventet output: "Pause spil"

        // 4.g Instantiér GameMenu klassen med actions listen
        GameMenu gameMenu = new GameMenu(actions); // Opretter en ny instans af GameMenu klassen og giver actions listen som argument


        // 4.i Test displayMenu() metoden
        gameMenu.displayMenu();// 

        // 5.d Kald getAction() metoden og gem returværdien i en variabel
        String userChoice = gameMenu.getAction();

        // 5.g Konverter værdien til en int og kald doAction() metoden
        // Konverterer brugerens valg til en integer og kalder doAction() metoden
        int action = Integer.parseInt(userChoice);
        doAction(action);
    }
    
}