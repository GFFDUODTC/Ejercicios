package Programacion1.EjerciciosUCES;

//Escribe un programa que verifique si  un array de enteros está ordenado de forma  ascendente.

import javax.swing.*;
import java.util.Scanner;
public class Ejercicio4 {

public static void main (String [] args){
    Scanner entrada=new Scanner(System.in);
    int lista[],nElementos,aux;

    nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de  numeros"));
    lista = new int[nElementos];

    for(int i=0;i<nElementos;i++){
        System.out.println((i+1)+"Digite un numero: ");
        lista[i] = entrada.nextInt();
    }
    for(int i=0;i<nElementos;i++){
        for(int n=0;n<(nElementos-1);n++){
            if(lista[n] > lista[n+1]){
                aux = lista[n];
                lista[n] = lista[n+1];
                lista[n+1]=aux;
            }
        }
    }
for(int i=0;i<nElementos;i++){
    System.out.println(lista[i]+"....");
}

}


}
