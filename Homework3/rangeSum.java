/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

		int num1,num2;
	  System.out.println("limites: "+args[0]+" "+args[1]);
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1])-1;
        
        while(num1 < num2){
            num1++;
            System.out.println(num1);
        }
      
   }

}