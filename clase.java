import java.util.Scanner;

public class Desafio {
  public static void main(String[] args){

      Scanner in = new Scanner();
      int[] ar = int[3];
      int resultado = 0;

      for (int i = 0; i < ar.length; i++){
        System.out.print("Ingrese valor de posicion " + i + " :");
        int[i] = in.nextInt();
        resultado = resultado + int[i];
      }

      System.out.println("El resultado es: " + resultado);
  }
}
