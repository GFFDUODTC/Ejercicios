/* 3-	Realizar un programa en java que pida 10 números menores a 100, guardarlos en un array,
 luego indicar si todos los números ingresados son mayores a 30 ( 3 puntos + 1 puntos si se utiliza acumuladores booleanos vistos en clase ) */


import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio8 {

    public static void main (String [] args){

int num1,num2,num3;
int Lista  [] = new int [3];



        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero menor a 100: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero menor a 100: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero menor a 100: "));


        if (num1  > 30){

            System.out.println("El primer numero es mayor a 30");


        } else {
            System.out.println("El primero numero es menor a 30");
        } if (num2  > 30){

            System.out.println("El segundo numero es mayor a 30");

        } else {
            System.out.println("El segundo numero es menor a 30");
        } if (num3  > 30){
            System.out.println("El tercer numero es mayor a 30");
        } else {
            System.out.println("El tercer numero es menor a 30");
        }


    }


}





