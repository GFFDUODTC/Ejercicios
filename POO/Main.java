
 // En un restaurant, el sueldo de un mozo se calcula teniendo en cuenta las

      //   propinas recibidas sumadas a su sueldo básico, mientras que el del cajero es

      //   un monto fijo mensual. Ambos objetos, mozo y cajero, saben responder al

      //   mensaje "¿cuál es tu sueldo?", la diferencia estará en la respuesta al mismo,

       //  es decir, en el método asociado al mensaje: el primero a su sueldo básico le

      //   sumará las propinas obtenidas, mientras que el segundo sólo responderá

      //   informando su monto fijo mensua









public class Main {


public static void main (String[]args){

    Cajero c1 = new Cajero();
    c1.averiguaSueldo();

    c1.setNombre("Lucas");
    c1.setSueldobase(1000);


    System.out.println("El nombre del cajero es: " +  c1.getNombre() + " Y su sueldo es: " + c1.getSueldobase() );


    Mozo m1 = new Mozo();
    m1.averiguaSueldo();
    m1.setNombre("Sebastian");
    m1.setPropinas(500);
    m1.setSueldobase(1000);
    m1.setSueldototal(m1.getSueldototal());

    



    System.out.println("El nombre del mozo es: " + m1.getNombre() + " Y su sueldo es: " + m1.getSueldototal());




}


}

class Empleado{



private String nombre;
private int propinas;
private int sueldobase;
private int sueldototal = sueldobase + propinas;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPropinas(int propinas) {
        this.propinas = propinas;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    public void setSueldototal(int sueldototal) {
        this.sueldototal = sueldototal;
    }


    public String getNombre() {
        return nombre;
    }

    public int getPropinas() {
        return propinas;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public int getSueldototal() {
        return sueldototal;
    }

    public void averiguaSueldo(){


    System.out.println("Cual es tu sueldo?");
}

}


class Cajero extends Empleado {


}


class Mozo extends Empleado {



}