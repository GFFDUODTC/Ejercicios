package Programacion1.EjerciciosUCES;

import java.util.Scanner;

public class Ejercicio3 {

public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);
    int lista[] = new int[10]; //creamos la lista para los 10 numeros enteros
    int conteo_pares=0;

    System.out.println("Elija 10 numeros");
    for(int i=0;i<10;i++){
        System.out.println((i+1)+"Digite un numero:");
        lista[i] = entrada.nextInt();

        if(lista[i]  %  2==0){ //Si el numero es par
            conteo_pares++;
    }
}
    int par [] = new int [conteo_pares]; //Creamos para guardar los numeros pares
    conteo_pares=0;

    for(int i=0;i<10;i++){
        if(lista[1]  % 2==0){
            par[conteo_pares] = lista[1];
            conteo_pares++;
        }
    }
    System.out.println("lista pares:");
    for(int i=0;i<conteo_pares;i++){
        System.out.println(par[i]+ ".");
    }
}
}
