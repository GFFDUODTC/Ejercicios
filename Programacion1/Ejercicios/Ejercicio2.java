/*Escribí un programa que encuentre el número máximo en un array de enteros */


package Programacion1.EjerciciosUCES;


public class Ejercicio2 {

public static void main (String [] args ){

 // CREAMOS EL ARRAY

int Lista [] = {10,20,30,40,50,60,70,80,90,100};

// CREAMOS UNA VARIABLE EN 0

    int NumMayor=0;

    System.out.println("Los numeros son: ");

    // CREAMOS EL BUCLE

    for(int i = 0; i< Lista.length;i++){

        System.out.println(Lista[i]);


     // CONDICION
     if (NumMayor<Lista[i]){
         NumMayor=Lista[i];
     }

    }
System.out.println("El numero mayor es: "+NumMayor);

}

}