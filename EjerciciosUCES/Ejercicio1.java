package EjerciciosUCES;
/* Escribe un programa que lea las calificaciones de un grupo de estudiantes y calcule el promedio.
 Utiliza un array para almacenar las calificaciones.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class Ejercicio1{


    public static void main(String args[]){

        int num1,num2,num3;
        int promedio=0;
        int arreglo[] = new int[3];



        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion de su primer parcial : "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion de su segundo parcial : "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion de su parcial final : "));

        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(num1);
        listaNumeros.add(num2);
        listaNumeros.add(num3);




        for (Integer Nota : listaNumeros){
            System.out.println(listaNumeros);

        }
        arreglo[0] = num1;
        arreglo[1] = num2;
        arreglo[2] = num3;

        promedio = (num1+num2+num3)/3;


        System.out.println("El alumno saco un promedio de: "+promedio);
}

}