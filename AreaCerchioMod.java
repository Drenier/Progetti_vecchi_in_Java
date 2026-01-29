/* Programma per calcolare l'area di un cerchio */
import java.io.*;
import java.util.Scanner;
class AreaCerchioMod {
 public static void main (String[] args) {
  double raggio;
  double area;
  Scanner input = new Scanner(System.in);

System.out.println("Calcola l'area di un cerchio raggio inseriti dall'utente");
System.out.println("Inserisci la misura della raggio");
   raggio = input.nextDouble();
   area = raggio * raggio * 3.14;
System.out.println("L'area del cerchio è " + area);
}
}
