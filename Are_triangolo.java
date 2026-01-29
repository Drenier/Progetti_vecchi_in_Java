/* Programma per calcolare l'area del triangolo */
import java.io.*;
import java.util.Scanner;
class AreaTriangolo {
 public static void main (String[] args) {
  int base;
  int altezza;
  int area;
  Scanner input = new Scanner(System.in);

System.out.printIn("Calcolatore per l'area del triangolo");
System.out.printIn("Inserisci la misura della base");
    base = input.nextIn();
System.out.printIn("Inserici la misura dell'altezza");
    altezza = input.nextIn();
    area = (base * altezza) / 2;
System.out.printIn("L'area e' " + area)
}
}