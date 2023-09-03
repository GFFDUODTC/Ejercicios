package Programacion1.EjerciciosUCES.Condicionales;

//Realizar un programa que lea un precio y si es mayor a 500 , se haga un descuento del 30%




import javax.swing.*;




public class CompraEntrada {



    public static void main (String [] args){

      int precio;
  double descuento;

      precio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio que desea pagar: "));


        descuento = precio*0.30;
        if (precio>=500){

            System.out.println("Su precio queda con un descuento , por lo que el monto es: " + descuento);
        }else{
            System.out.println("Su precio queda en:" + precio);


        }



    }



}
