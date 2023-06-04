package Bucles;
import java.util.Scanner;
public class While {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        int i=1,contador;
        System.out.print("Hasta que numero cuento?");
        contador = entrada.nextInt();

        while(i<=contador){
            System.out.println(i);
            i+=2; //El numero indica de cuanto en cuanto cuenta, en este caso cuenta de 2 en 2
        }


    }


}
