package ex2;

import java.util.Scanner;

public class ex2 {

    public static String classificaParola(int lunghezzaparola) {
        if (lunghezzaparola < 3) {
            return "Parola corta";
        } else if (lunghezzaparola <= 8) {
            return "Parola di media lunghezza";
        } else {
            return "Parola lunga";
        }
    }

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Quante parole vuoi inserire? ");
        int N = tastiera.nextInt();

        tastiera.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la parola " + (i + 1) + ": ");
            String parola = tastiera.nextLine();

            String risultato = classificaParola(parola.length());
            System.out.println(risultato);
        }

        tastiera.close();
    }
}

