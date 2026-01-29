/* Esercizio del 25 novembre 2022 */
import java.io.*;
import java.util.Scanner;
public class Es25Novembre2022Erald {
 
  public static int numero=0; /*input*/
  public static int numdispari=0; /*output*/
  public static int numpari=0; /*output*/
  public static int num1=0; /*input*/
  public static int num2=0; /*input*/
  public static int risultato1=0; /*output*/
  public static int numX=0; /*input*/
  public static int numY=0; /*work*/
  public static int volte=0; /*output*/
  public static Scanner input = new Scanner(System.in);
 public static void main (String[] a) {
      InserimentoDieciNumeri();
      PossibilePari();
      PossibileDispari();
}
public static void InserimentoDieciNumeri() {
 for(int i=0;i<10;i++) {    
System.out.println("Inserisci uno alla volta 10 numeri");
 numero = input.nextInt();
  if (numero % 2==0) {
   numpari++;
    } else {
   numdispari++;
}
 numero = 0;
 System.out.println("I numeri pari sono " + numpari);
  System.out.println("I numeri dispari sono " + numdispari);
 }
}

public static void PossibilePari() {
 if (numpari>numdispari) {
  System.out.println("Inserisci un primo numero");
   num1 = input.nextInt();
  System.out.println("Inserisci un secondo numero");
   num2 = input.nextInt();
    risultato1 = num1 * num2 ;
  System.out.println("Il risultato della moltiplicazione dei due numeri inseriti e' " + risultato1);
 }
}
public static void PossibileDispari() {
 if (numdispari>numpari) {
 System.out.println("Inserisci un numero che verra moltiplicato a se stesso fino al ottenimento di numero maggiore di cento");
  numX = input.nextInt();
   numY = numY + numX;
    for(int f=0;numX<100;f++) {
     numX=numX*numY;
      volte++;
}
System.out.println("La moltiplicazione del numero ha superato cento dando come risultato " + numX);
 System.out.println("Il numero e' stato moltiplicato per " + volte);
  }  
 } 
}
 
 



     

  



