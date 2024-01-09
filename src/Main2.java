import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa o :q per uscire:");
        while (!(input = scanner.nextLine()).equals(":q")) {
            // Suddivide la stringa in caratteri separati da virgola
            String[] caratteri = input.split("");

            // Stampa i caratteri separati da virgola
            System.out.println("Caratteri separati da virgola: " + String.join(",", caratteri));

            System.out.println("Inserisci una stringa o :q per uscire:");
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }


    }



