//En Agilent se hace un 30% de descuento a los clientes cuya compra supere los $300
//lo que dice es que Agilent te dará un descuento de 30% si tu compra supera $300
//¿Cuál será la cantidad que pagará una persona por su compra? 



public class Compra {
    public static void main(String[] args) {

        double compra, descuento, total = 0;
        compra = 410;

        descuento = compra*0.3;
        total = compra;

        if(compra>300) {

            total = compra - descuento;
            System.out.println("El descuento es de: "+descuento);
            System.out.println("El total a pagar es: "+total);

        }else {
            System.out.println("Sin descuentos el total es: "+total);
        }
    }
}