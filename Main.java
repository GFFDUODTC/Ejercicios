import java.util.*;
class Concesionaria {
    String nombre;
    String marca;
    int  modelo;
    int id;
    int stock;
    double  precio;

    public void mostrar(){





        System.out.println(" El nombre del auto es "+ nombre);
        System.out.println(" La marca del auto es "+ marca);
        System.out.println(" El modelo del auto es "+ modelo);
        System.out.println(" El precio del auto es "+ precio);
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
            Auto1.precio = 5500000.00;
            Auto1.id = 1;
            Auto1.stock = 12;
            Auto1.mostrar();


            Concesionaria Auto2 = new Concesionaria ();
            Auto2.nombre = "Cruze";
            Auto2.marca = "Chevrolet";
            Auto2.modelo = 2016;
            Auto2.precio = 6100150.00;
            Auto2.id = 2;
            Auto2.stock = 5;
            Auto2.mostrar();

            Concesionaria Auto3 = new Concesionaria ();
            Auto3.nombre = "Argo";
            Auto3.marca = "Fiat";
            Auto3.modelo = 2018;
            Auto3.precio = 4600000.00;
            Auto3.id = 3;
            Auto3.stock = 20;
            Auto3.mostrar();

            Concesionaria Auto4 = new Concesionaria ();
            Auto4.nombre = "308";
            Auto4.marca = "Peugeot";
            Auto4.modelo = 2014;
            Auto4.precio = 4250000.00;
            Auto4.id = 4;
            Auto4.stock = 10;
            Auto4.mostrar();

            Concesionaria Auto5 = new Concesionaria ();
            Auto5.nombre = "Civic";
            Auto5.marca = "Honda";
            Auto5.modelo = 2017;
            Auto5.precio = 9650000.00;
            Auto5.id = 5;
            Auto5.stock = 15;
            Auto5.mostrar();

        }else{

            System.out.println(" Gracias por visitarnos :)");


        }
    }
}

class Descuento {

    public static void main(String[] args) {

        System.out.println(" Introduzca el id del auto que desea comprar");


        Scanner sc = new Scanner(System.in);

        int Numero1 = 1;
        int Numero2 = 2;
        int Numero3 = 3;
        int Numero4 = 4;
        int Numero5 = 5;
        Numero1= sc.nextInt();
        if(Numero1==1){

            Concesionaria Auto1 = new Concesionaria ();
            Auto1.nombre = "Polo";
            Auto1.marca = "Vw";
            Auto1.modelo = 2018;
            Auto1.precio = 5500000.00;
            Auto1.id = 1;
            Auto1.stock = 12;
            Auto1.mostrar();

            double descuento= Auto1.precio * 100 / 20;

            System.out.println("\n Con su descuento del 20% quedo en : "+ descuento);
        }

        else if (Numero2==2){


            Concesionaria Auto2 = new Concesionaria ();
            Auto2.nombre = "Cruze";
            Auto2.marca = "Chevrolet";
            Auto2.modelo = 2016;
            Auto2.precio = 6100150.00;
            Auto2.id = 2;
            Auto2.stock = 5;
            Auto2.mostrar();


            double descuento= Auto2.precio * 100 / 20;

            System.out.println("\n Con su descuento del 20% quedo en : "+ descuento);

        }
    else if (Numero3==3){

                Concesionaria Auto3 = new Concesionaria ();
                Auto3.nombre = "Argo";
                Auto3.marca = "Fiat";
                Auto3.modelo = 2018;
                Auto3.precio = 4600000.00;
                Auto3.id = 3;
                Auto3.stock = 20;
                Auto3.mostrar();

                double descuento= Auto3.precio * 100 / 20;

                System.out.println("\n Con su descuento del 20% quedo en : "+ descuento);




            }

        }



    }
