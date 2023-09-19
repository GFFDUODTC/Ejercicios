/*  2-	Realizar un programa en java para adivinar un número al azar (del 1 al 10), imprimir si acertó o no */

import javax.swing.*;
import java.util.Random;

public class Ejercicio7 {

    public static void main (String [] args){

        int num1;

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Adivine un numero del 1 al 10"));

        Random random = new Random();
        int numAleatorio = random.nextInt(10)+1;
        for (int i = 0; i < 1;i++){
            System.out.println("Ingrese un numero");
            if(numAleatorio==num1){
                System.out.println("acerto " + num1);
            } else {
                System.out.println("No acerto "+ num1);
            }
        }
    }
}