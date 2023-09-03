package Programacion1.EjerciciosUCES;
/* Escribe un programa que lea las calificaciones de un grupo de estudiantes y calcule el promedio.
 Utiliza un array para almacenar las calificaciones.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
class Ejercicio1{

public static void main (String [] args){

    int num1,num2,num3;
int promedio;
int Arreglo[] = new int[3];


num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero: "));

List<Integer> Calificaciones = new ArrayList<Integer>();

Calificaciones.add(num1);
Calificaciones.add(num2);
Calificaciones.add(num3);

Arreglo[0] = num1;
Arreglo[1] = num2;
Arreglo[2] = num3;

promedio = (num1 + num2 + num3 ) /3;

    System.out.println("El promedio es: "+ promedio);

}





        }