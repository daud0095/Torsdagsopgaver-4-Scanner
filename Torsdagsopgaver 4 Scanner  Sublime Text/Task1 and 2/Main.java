import java.util.Scanner;

public class Main {
    // Opgave 2.a: Main-metoden hvor programmet starter
    public static void main(String[] args) {
        // Opgave 2.c: Opret et Scanner-objekt til at læse fra kommandolinjen
        Scanner scanner = new Scanner(System.in);

        // Opgave 2.b: Bed brugeren om at skrive deres navn
        System.out.println("Please type your name");
        // Opgave 2.d: Deklarer en String-variabel til at gemme brugerens navn
        String name = scanner.nextLine();

        // Opgave 2.e: Hils brugeren og spørg efter deres alder
        System.out.println("Hello " + name + ", Please type your age");
        // Opgave 2.f: Deklarer en int-variabel til at gemme brugerens alder
        int age = scanner.nextInt();

        // Opgave 2.g: Udskriv brugerens alder
        System.out.println("You are " + age + " years old.");

        // Opgave 2.h: Beregn og udskriv antallet af år til pensionering, antag pensionsalder 67
        int yearsToRetirement = 67 - age;
        System.out.println("You have " + yearsToRetirement + " years until retirement.");

        // Luk Scanner-objektet
        scanner.close();
    }
}