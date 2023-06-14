/* Crea una clase llamada "Empleado" con los atributos: nombre, salario y antigüedad.
Luego, crea un array de objetos "Empleado" y muestra el nombre y el salario actualizado de cada
empleado después de aplicar un aumento del 10% a aquellos que tienen una antigüedad superior a 5
años.*/




import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Empleado {

    public static void main(String args[]){


        String nom1,nom2,nom3;
        double sal1,sal2,sal3;
        int anti1,anti2,anti3;
        double salario_aumento;



        nom1 = JOptionPane.showInputDialog("Escriba su nombre");
        anti1 = Integer.parseInt(JOptionPane.showInputDialog("Digite su antiguedad: "));
        sal1 = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario: "));

        nom2 = JOptionPane.showInputDialog("Escriba su nombre");
        anti2 = Integer.parseInt(JOptionPane.showInputDialog("Digite su antiguedad: "));
        sal2 = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario: "));

        nom3 = JOptionPane.showInputDialog("Escriba su nombre");
        anti3 = Integer.parseInt(JOptionPane.showInputDialog("Digite su antiguedad: "));
        sal3 = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario: "));

        List<String> Empleado = new ArrayList<String>();
        Empleado.add(nom1);
        Empleado.add(nom2);
        Empleado.add(nom3);

        salario_aumento = sal1*0.1;

        if(anti1>5) {

            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom1 + " Y su sueldo es: " + salario_aumento);
            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom2 + " Y su sueldo es: " + salario_aumento);
            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom3 + " Y su sueldo es: " + salario_aumento);


        }else {

            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom1 + " Y su sueldo es: " + sal1);
            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom2 + " Y su sueldo es: " + sal2);
            JOptionPane.showMessageDialog(null, "Su nombre es: " + nom3 + " Y su sueldo es: " + sal3);
        }

    }
}