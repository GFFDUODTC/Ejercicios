package Condicionales;
//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
//Si trabaja 40 horas o menos se le paga $16 por hora.
//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada
//hora extra.


public class Salario {

    public static void main (String[] args ){

        int horasTrabajadas, horasExtras, salarioSemanal;

        horasTrabajadas = 60;

        if (horasTrabajadas >40) {

            horasExtras = horasTrabajadas - 40;
            salarioSemanal = horasExtras * 20 + 40 * 16;

            System.out.println("El salario con horas extras es de: "+salarioSemanal);

        }else{

            salarioSemanal = horasTrabajadas *16;
            System.out.println("Su sueldo es de :"+salarioSemanal);
        }

    }


}
