 /* 1-	Realizar un programa en java, que pida dos números por pantalla, luego imprimir si el primer número solicitado es mayor al segundo  */



import javax.swing.*;

public class Ejercicio6 {



    public static void main (String [] args){

        int num1;
        int num2;

        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        if (num1  >  num2){


            System.out.println("El numero 1 es mayor al numero 2 ingresado");
        } if (num1 == num2){

            System.out.println("El numero ingresado es igual");

        }


        else {

            System.out.println("El numero 1 es menor al numero 2 ingresado");
        }



    }


}
