
//Adivinar un numero al azar del 1 al 10 , que tenga 3 intentos



import java.util.Random;
import java.util.Scanner;










public class Ejercicio5 {



    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio = random.nextInt(10)+1;
        for (int i = 0; i < 3;i++){
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if(numAleatorio==numero){
            System.out.println("acerto " + numero);
            break;
        } else {
            System.out.println("No acerto "+ numero);
        }




    }





    }




}
