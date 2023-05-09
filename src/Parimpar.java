//Calculamos si el numero es impar o impar, de acuerdo al numero que ponga el usuario


import java.util.*;

public class Parimpar{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero;
        System.out.println("Introduzca un numero entero: ");
        Numero = sc.nextInt();

        if(Numero%2==0){
            System.out.println("Su numero es par");

        }else{

            System.out.println("Su numero es impar");
        }

    }

}