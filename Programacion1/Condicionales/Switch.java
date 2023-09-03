package Programacion1.EjerciciosUCES.Condicionales;

import javax.swing.*;

public class Switch {

    public static void main(String [] args ){

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 3: "));

        switch(dato){

            case 1:   JOptionPane.showMessageDialog(null,"Es el numero 1");
            break;
            //* El break, detiene el algoritmo , por lo que si no esta, sigue a la siguiente funcion
            case 2:   JOptionPane.showMessageDialog(null,"Es el numero 2");
                break;
            case 3:   JOptionPane.showMessageDialog(null,"Es el numero 3");
                break;
                //* El default, vendria a ser la condicion contraria, como el else en el if
            default: JOptionPane.showMessageDialog(null,"El numero no esta en el rango");
        }


    }


}
