/* Implementare in Java una applicazione (che chiameremo Conteggio) che, dati 30 numeri in input, conta quanti sono pari e quanti sono dispari e, terminato l'inserimento, mostra i due valori in output. Se i pari sono più dei dispari viene mostrato in output il messaggio "Pari maggiori dei dispari", altrimenti l'applicazione genera un numero casuale tra 1 e 10 e lo mostra in output. */
import java.io.*;
import java.util.Scanner;
class Conteggio {
 public static void main (String[] args) {
  int num; // numeri inseriti dall'utente
  int pari = 0; // numeri pari
  int dispari = 0; // numeri dispari
  int numcasual; // numero generato casualmente tra uno e dieci se i numeri dipari sono maggiori dei pari
  Scanner input = new Scanner(System.in);

    System.out.println("Inserisci 30 numeri");
   for(int i=1; i<=30; i++){
    System.out.println("Inserisci un numero");
     num = input.nextInt();
     if (num%2==0){
       pari++;
     } else {
       dispari++;}
   }
  System.out.println("I numeri pari sono " + pari);
  System.out.println("I numeri dispari sono " + dispari);

     if (pari>dispari){
  System.out.println("I numeri pari sono maggiori dei numeri dispari");
      } else {
  numcasual = (int)(Math.random() * 10 + 1);
   System.out.println("Il numero casuale tra uno e dieci e' " + numcasual);}
 }
}
