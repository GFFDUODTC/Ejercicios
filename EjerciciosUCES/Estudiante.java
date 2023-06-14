

//Crea una clase llamada "Estudiante" con los atributos: nombre, edad y calificaciones (un array de tipo double).
//Luego, crea un array de objetos "Estudiante" y  muestra el promedio de calificaciones de cada estudiante


import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class Estudiante{


    public static void main(String args[]){

        String nombre;
        int edad;
      double num1,num2,num3;
       double promedio=0;
        double arreglo[] = new double[3];
 int i = 2;

if(i <5){

    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la calificacion de su primer parcial : "));
    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la calificacion de su segundo parcial : "));
    num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite la calificacion de su parcial final : "));
    nombre = JOptionPane.showInputDialog("Escriba su nombre");
    edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));

    List<Double> calificaciones = new ArrayList<Double>();
    calificaciones.add(num1);
    calificaciones.add(num2);
    calificaciones.add(num3);


    arreglo[0] = num1;
    arreglo[1] = num2;
    arreglo[2] = num3;

    promedio = (num1+num2+num3)/3;


    JOptionPane.showMessageDialog(null, "Hola " + nombre + " Su edad es: "+ edad + " Y su  calificacion es: " + promedio);
}
}

}






