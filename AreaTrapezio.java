/* Programma per calcolare l'area del trapezio */
import java.io.*;
import java.util.Scanner;
class AreaTrapezio {
 public static void main (String[] args) {
  double BaseMaggiore;
  double BaseMinore;
  double Altezza;
  double AreaTrapezio;
  Scanner input = new Scanner(System.in);

System.out.println("Calcolatore per l'area del trapezio");
System.out.println("Inserisci la misura della base maggiore");
    BaseMaggiore = input.nextDouble();
System.out.println("Inserici la misura della base minore");
    BaseMinore = input.nextDouble();
System.out.println("Inserici la misura dell'altezza");
    Altezza = input.nextDouble();
if ((BaseMaggiore>0) && (BaseMinore>0) && (Altezza>0)) {
    AreaTrapezio = ((BaseMaggiore + BaseMinore)*Altezza) / 2;
        System.out.println("L'area del trapezio e'" + AreaTrapezio);
    } else {
        System.out.println("ERRORE");
  }
 }
}