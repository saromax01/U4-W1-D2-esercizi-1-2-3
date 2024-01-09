public class MainIfElse {
    public static void main(String[] args) {
        String inputString = "developer";

        System.out.println("la lunghezza della stringa è pari?" + pariDispari(inputString));

        int inputAnno = 2024;
        System.out.println("l'anno" + inputAnno + "è bisestile?" + annoBisestile(inputAnno));
    }

    // Funzione che verifica se la lunghezza di una stringa è pari o dispari
    public static boolean pariDispari(String str) {
        int lunghezza = str.length();
        return lunghezza % 2 == 0;
    }


    // Funzione che verifica se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        return ((anno % 4 == 0 & anno % 100 != 0) || (anno % 100 == 0 && anno % 400 == 0));
        // L'anno è bisestile se è divisibile per 4 e non è divisibile per 100, o se è divisibile per 100 e anche per 400

    }
}
