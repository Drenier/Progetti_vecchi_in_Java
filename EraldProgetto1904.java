/* Programma per calcolare una somma maggiore di cento che se è pari richiedera il calcolo di una seconda somma in base a 10 numeri inseriti e la media della seconda somma*/
import java.io.*;
import java.util.Scanner;
class EraldProgetto1904  {
public static void main (String[] args)  {

double n1, somma, n2, somma2, media;
n1 = 0;
somma = 0;
n2 = 0;
somma2 = 0;
media = 0;
Scanner input = new Scanner(System.in);

while (somma <=100)  {
System.out.println("Inserisci un numero");
  n1 = input.nextDouble();
    somma = somma + n1;  
    }

System.out.println("La somma dei numeri e' " + somma);
  if (somma%2==0)  {
    for (int i=1; i<=10; i++)  {
System.out.println("Inserisci un numero");
 n2 = input.nextDouble();
  somma2 = somma2 + n2;
   media = somma2 / 10;  
 }
}
  if (somma2%2==0) {
System.out.println("La somma dei 10 numeri e' " + somma2);
   System.out.println("La media dei 10 numeri e' " + media);  
  } else {
   System.out.println("La somma e' dispari");  
 }
}
}
    
     


 