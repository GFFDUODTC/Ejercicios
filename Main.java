import java.util.*;
class Concesionaria {
    String nombre;
    String marca;
    int  modelo;
    int id;
    int stock;

    public void mostrar(){





            System.out.println(" El nombre del auto es "+ nombre);
            System.out.println(" La marca del auto es "+ marca);
            System.out.println(" El modelo del auto es "+ modelo);
            System.out.println(" El id del auto es "+ id);
            System.out.println(" El stock del auto es "+ stock);




        }


    }





class Main {
    public static void main(String[] args) {


        System.out.println(" Bienvenido a Concesionaria UCES");


        Scanner sc = new Scanner(System.in);

        System.out.println(" Desea ver nuestra lista de autos actual? presione SI o NO");
     String Respuesta1 = "SI";
    String Respuesta2 = "NO";
        Respuesta1 = sc.nextLine();

        if(Respuesta1.equals("SI")){


        Concesionaria Auto1 = new Concesionaria ();
        Auto1.nombre = "Polo";
        Auto1.marca = "Vw";
        Auto1.modelo = 2018;
        Auto1.id = 1;
        Auto1.stock = 12;
        Auto1.mostrar();


        Concesionaria Auto2 = new Concesionaria ();
        Auto2.nombre = "Cruze";
        Auto2.marca = "Chevrolet";
        Auto2.modelo = 2016;
        Auto2.id = 2;
        Auto2.stock = 5;
        Auto2.mostrar();

        Concesionaria Auto3 = new Concesionaria ();
        Auto3.nombre = "Argo";
        Auto3.marca = "Fiat";
        Auto3.modelo = 2018;
        Auto3.id = 3;
        Auto3.stock = 20;
        Auto3.mostrar();

        Concesionaria Auto4 = new Concesionaria ();
        Auto4.nombre = "308";
        Auto4.marca = "Peugeot";
        Auto4.modelo = 2014;
        Auto4.id = 4;
        Auto4.stock = 10;
        Auto4.mostrar();

        Concesionaria Auto5 = new Concesionaria ();
        Auto5.nombre = "Civic";
        Auto5.marca = "Honda";
        Auto5.modelo = 2017;
        Auto5.id = 5;
        Auto5.stock = 15;
        Auto5.mostrar();

        }else{

        System.out.println(" Gracias por visitarnos :)");
    }
}
}
