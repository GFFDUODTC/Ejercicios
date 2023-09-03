
/* Crea una clase llamada "Producto" con  los atributos: nombre, precio y cantidad. Luego,
crea un array de objetos "Producto" y muestra el nombre y el valor total de cada producto (precio *
 cantidad)




import java.util.ArrayList;
import java.util.List;
import javax.swing.*;



public class Producto {


    String nombre;
    Double precio;
    int cantidad;
    int id;
    Double valor1,valor2,valor3;

    valor1 = (precio*cantidad);
    valor2 = (precio*cantidad);
    valor3 = (precio*cantidad);



    public static void main (String [] args ){

        double arreglo[] = new double[3];


    Producto p1 = new Producto();
    p1.nombre = "Galletitas";
    p1.precio = 420.5;
    p1.cantidad = 120;
    p1.id = 1;

    Producto p2 = new Producto();
    p1.nombre = "Chupetines";
    p1.precio = 50.0;
    p1.cantidad = 60;
    p1.id = 2;

    Producto p3 = new Producto();
    p1.nombre = "Jugo";
    p1.precio = 250.50;
    p1.cantidad = 10;
    p1.id = 3;


        List<String> producto = new ArrayList<String>();
        producto.add(p1);
        producto.add(p2);
        producto.add(p3);

        arreglo[0] = p1;
        arreglo[1] = p2;
        arreglo[2] = p3;




       switch (producto)  {



           p1 = JOptionPane.showMessageDialog(null,"Su nombre es: " + p1.nombre + " Y su valor es de: " + valor1);
           p2 = JOptionPane.showMessageDialog(null,"Su nombre es: " + p2.nombre + " Y su valor es de: " + valor2);
           p3 = JOptionPane.showMessageDialog(null,"Su nombre es: " + p3.nombre + " Y su valor es de: " + valor3);

       }


}
}
 */

