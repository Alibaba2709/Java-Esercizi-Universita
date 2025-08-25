/*Scrivere un programma Java che: 
1. Acquisica  tramite  l’array  args  del  metodo  main  Nome  e  Cognome 
dell’utente e li stampi a video in un messaggio di benvenuto; 
2. Inizializzi  due  array  entrambi  contenenti  8  elementi  dove  ogni  indice 
corrisponde ad un piano del dib (0 è il Piano Terra): 
1. Il primo array contiene i valori di temperatura medi registrati in estate, acquisiti da 
tastiera uno alla volta. 
2. Il  secondo  contiene  il  numero  di  persone  che  abitualmente  frequenta  ogni  piano, 
rispettivamente:  400, 300, 200, 100, 60, 18, 18, 16. 
3. Trovare il piano che necessita con più urgenza della riparazione dell’aria 
condizionata  rispetto  ad  un  punteggio  (relativo  ad  ogni  piano)  definito 
come: numero di persone al piano * temperatura di quel piano; 
4. Stampare a video il numero del piano su cui intervenire con urgenza, la 
sua temperatura ed il numero di persone che lo frequentano. 
Realizzare il punto 3 utilizzando un metodo che prenda in input l’array delle 
temperature e l’array del numero di persone al piano e restituisca il numero 
del piano su cui intervenire con più urgenza. */

package ex4;

import java.util.Scanner;

public class Ex4 {

    // Metodo che trova il piano con urgenza maggiore del DIB.
    public static int trovaPianoUrgente(double[] temperature, int[] persone) {
        int pUrgente = 0;
        double punteggioMax = temperature[0] * persone[0];

        for (int i = 1; i < temperature.length; i++) {
            double punteggio = temperature[i] * persone[i]; // formula data
            if (punteggio > punteggioMax) {
                punteggioMax = punteggio;
                pUrgente = i;
            }
        }
        return pUrgente;
    }

    public static void main(String[] args) {
        // Nome e cognome da args
        if (args.length < 2) {
            System.out.println("Errore: Inserire Nome e Cognome negli argomenti.");
            return;
        }
        String nome = args[0];
        String cognome = args[1];
        System.out.println("Benvenuto " + nome + " " + cognome + "!");

        // 2) Array temperature (da tastiera)
        Scanner input = new Scanner(System.in);
        double[] temperature = new double[8];
        System.out.println("Inserisci le temperature medie per i piani (0 = Piano Terra, fino a 7):");
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Temperatura piano " + i + ": ");
            temperature[i] = input.nextDouble(); // usa la virgola per i decimali
        }

        // 2) Array persone (fisso)
        int[] persone = {400, 300, 200, 100, 60, 18, 18, 16};

        // 3) Trovo il piano urgente
        int piano = trovaPianoUrgente(temperature, persone);

        // 4) Stampo risultato
        System.out.println("\n--- Risultato ---");
        System.out.println("Piano urgente: " + piano );
        System.out.println("Temperatura: " + temperature[piano]);
        System.out.println("Persone: " + persone[piano]);

        input.close();
    }
}