package Programacion1.EjerciciosUCES.Condicionales;//Se calcula el promedio entre esos 3 numeros



public class Promedio {

    public static void main(String args[]){

    int num1 =5;
    int num2 =6;
    int num3 =7;
    int promedio =0;

    promedio = (num1+num2+num3)/3;

    if(promedio >=4){

       System.out.println("El alumno aprobo: "+promedio);

    } else {

        System.out.println("El alumno desaprobo: "+promedio);
    }
   }
}
