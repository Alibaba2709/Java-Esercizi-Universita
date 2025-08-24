/* Scrivere un programma Java che:
1. Chieda in input all’utente il numero N di numeri che si vogliono inserire
2. Acquisisca da tastiera N numeri interi chiedendoli all’utente uno alla
volta
3. 4. Durante l’acquisizione dei numeri, usando la classe Math, memorizzare:
1. 2. 3. Il numero più grande inserito max
Il numero più piccolo inserito min
Il numero più grande in valore assoluto maxabs
Stampare a video il risultato dell’espressione (max-min)maxabs (maxabs è esponente) */

package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int N;
	
	//chiediamo all'utente quanti numeri vuole inserire
	 while (true) {
         System.out.print("Quanti numeri vuoi inserire?:  ");
         N = input.nextInt();
         if (N == 0) {
             System.out.println("Hai scelto di non inserire numeri. Ciao!");
             input.close();
             return;  
         } else if (N < 0) {
             System.out.println("Errore: il numero deve essere >= 0. Riprova.");
             // il ciclo ripete la domanda non chiudendo input e return
         } else {
             break; // valore valido (>0) → esci dal while
         }
     }
	
	//Variabili per memorizzare i risultati
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	int maxabs = 0;			//0 POICHè LO ANDREMO AD INCREMENTARE IN CICLO FOR
	
		for(int i=0; i<N; i++) {
	
			System.out.print("Inserisci il numero " + (i + 1) + ": ");
			int numero = input.nextInt();
		
			max = Math.max(max, numero);
			min = Math.min(min, numero);
				
			//calcolo del valore assoluto
			int absValue = Math.abs(numero);
			maxabs = Math.max (maxabs, absValue);
		}
	
	double risultato = Math.pow(max - min, maxabs);
	
	System.out.println("\n--- Risultati ---");
    System.out.println("Numero massimo inserito: " + max);
    System.out.println("Numero minimo inserito: " + min);
    System.out.println("Numero massimo in valore assoluto: " + maxabs);
    System.out.println("Risultato (max - min)^ maxabs = " + risultato);

    input.close();
	}
}
