/*Scrivere un programma Java che:
1. 2. Chieda in input all’utente il numero N di parole che si vogliono inserire
Acquisisca da tastiera N parole in sequenza, chiedendole all’utente una
alla volta
3. Per ogni parola acquisita, stampi a video la stringa:
1.“Parola corta” se la lunghezza della parola è minore di 3;
2.“Parola di media lunghezza” se la parola ha lunghezza tra 3 e 8;
3.“Parola lunga” se la lunghezza della parola è maggiore di 8;
Realizzare la stampa della stringa corretta attraverso un metodo che prende
in input la lunghezza di una parola acquisita*/

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

