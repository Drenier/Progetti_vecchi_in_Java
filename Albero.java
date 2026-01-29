/*Questo programma stampa un albero di Natale*/

public class Albero {

public static void main(String[] a) { 
    int numPiani = 10;
for (int i = 0; i < numPiani; i++) { 
    stampaSpazi(numPiani - i); 
    stampaStelle(2*i - 1); 
    System.out.println();
}
// stampa il tronco:
for (int i = 0; i < 2; i++) { 
    stampaSpazi(numPiani - 2); 
    stampaStelle(3); 
    System.out.println();
}
System.out.println();
}

public static void stampaStelle(int numF) { 
    for (int i = 0; i < numF; i++)
System.out.print("*");
}

public static void stampaSpazi(int numSp) { 
    for (int i = 0; i < numSp; i++)
System.out.print(" ");
}
public static void proc1 (int identifier);
int numero;
int numdispari;
int numpari; {
  for(int i=1;i<10;i++) {    
System.out.println("Inserisci uno alla volta 10 numeri");
numero = input.nextInt();
}
if (numero % 2==0) {
numpari= numpari + 1;
   } else {
numdispari= numdispari + 1;
}
}
}
