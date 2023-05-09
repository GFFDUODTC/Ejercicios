//En Agilent se hace un 30% de descuento a los clientes cuya compra supere los $300
//lo que dice es que Agilent te dará un descuento de 30% si tu compra supera $300
//¿Cuál será la cantidad que pagará una persona por su compra?

import java.util.*;


public class Prueba{


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double Numero;
            System.out.println("Introduzca su monto total: ");
            Numero = sc.nextInt();




          double compra, descuento, total = 0;
            compra = Numero;

            descuento = compra*0.3;
            total = compra;

            if(compra>300)  {
                total = compra - descuento;
                System.out.println("El descuento es de: "+descuento);
                System.out.println("El total a pagar es: "+total);

            }else {
                System.out.println("Sin descuentos el total es: "+total);
            }

}
        }