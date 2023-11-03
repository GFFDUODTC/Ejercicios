/* Integrantes: Martin Casillo y Sebastian Romero.
Sistema de Administración de Libros y Ejemplares
Deben desarrollar un sistema para gestionar libros y los ejemplares disponibles de cada libro. El sistema debe permitir la administración de hasta un máximo de 10 libros y debe incluir la siguiente información:
Nombre del Sistema y Fecha de Creación: El sistema debe tener un nombre y se debe registrar la fecha de creación del sistema.
Datos de los Libros: Para cada libro, se deben registrar los siguientes datos:
Título del Libro: El título del libro, que es obligatorio.
Autor: El autor del libro.
Género Literario: El género literario al que pertenece el libro, como novela, ensayo, ciencia ficción, etc.
Año de Publicación: El año en que se publicó el libro.
Ejemplares de los Libros: Cada libro tiene una cantidad de ejemplares disponibles. Si se intenta agregar un ejemplar a un libro inexistente, el sistema debe emitir un error. Cada ejemplar debe contener la siguiente información:
Número de Ejemplar: Un número de identificación único para cada ejemplar.
Estado del Ejemplar: Indica si el ejemplar está disponible para préstamo o si está en préstamo.
Condición del Ejemplar: La condición física del ejemplar, como nuevo, usado, desgastado, etc.
Límite de Ejemplares por Libro: Cada libro puede tener hasta 10 ejemplares disponibles. El sistema debe controlar este límite.
Cantidad de Ejemplares Disponibles: El sistema debe ser capaz de indicar la cantidad total de ejemplares disponibles para préstamo de todos los libros.

Deben diseñar un programa que permita a los usuarios agregar libros, registrar ejemplares disponibles de cada libro y calcular la cantidad total de ejemplares disponibles para préstamo.	*/


import java.util.*;
import javax.swing.*;



class Libreria {

    String Titulo, Autor, Genero, Estado, Condicion;
    int Anios, ID, CantidadEjemplar;

    public void Mostrar (){




    }

}





class Main {

    public static void main (String [] args){



        System.out.println("Bienvenidos al sistema UCES Libreria");



        String [] arreglo = {"Libros","Agregar","Salir"};


        JOptionPane.showOptionDialog(null,"Elija una opcion:","Libreria UCES",0,JOptionPane.QUESTION_MESSAGE,null,arreglo,"");




        Libreria l1 = new Libreria();
        l1.Titulo = "Harry Potter";
        l1.Autor = "J.K. Rowling";
        l1.Anios = 2001;
        l1.ID = 1;
        l1.CantidadEjemplar = 9;
        l1.Genero = "Fantasia";
        l1.Estado = "Disponible";
        l1.Mostrar();


        Libreria l2 = new Libreria();
        l2.Titulo = " El Señor de los Anillos";
        l2.Autor = "J.R.R. Tolkien";
        l2.Anios = 2003;
        l2.ID = 2;
        l2.CantidadEjemplar = 7;
        l2.Genero = "Fantasia";
        l2.Estado = "Disponible";
        l2.Condicion = "Bueno";
        l2.Mostrar();

        Libreria l3 = new Libreria();
        l3.Titulo = "El Alquimista";
        l3.Autor = "Paulo Coelho";
        l3.Anios = 1988;
        l3.ID = 3;
        l3.CantidadEjemplar = 4;
        l3.Genero = "Novela";
        l3.Estado = "No disponible";
        l3.Condicion = "Bueno";
        l3.Mostrar();

        Libreria l4 = new Libreria();
        l4.Titulo = "El Código da Vinci";
        l4.Autor = "Dan Brown";
        l4.Anios = 2003;
        l4.ID = 4;
        l4.CantidadEjemplar = 2;
        l4.Genero = "Novela";
        l4.Estado = "Disponible";
        l4.Condicion = "Malo";
        l4.Mostrar();

        Libreria l5 = new Libreria();
        l5.Titulo = "Crepúsculo";
        l5.Autor = "Stephenie Meyer";
        l5.Anios = 2005;
        l5.ID = 5;
        l5.CantidadEjemplar = 9;
        l5.Genero = "Fantasia";
        l5.Estado = "Disponible";
        l5.Condicion = "Muy bueno";
        l5.Mostrar();

        Libreria l6 = new Libreria();
        l6.Titulo = "Lo que el viento se llevó";
        l6.Autor = "Margaret Mitchell";
        l6.Anios = 1936;
        l6.ID = 6;
        l6.CantidadEjemplar = 1;
        l6.Genero = "Novela";
        l6.Estado = "No disponible";
        l6.Condicion = "Malo";
        l6.Mostrar();

        Libreria l7 = new Libreria();
        l7.Titulo = "El diario de Ana Frank";
        l7.Autor = "Anna Frank";
        l7.Anios = 1942;
        l7.ID = 7;
        l7.CantidadEjemplar = 3;
        l7.Genero = "Biografia";
        l7.Estado = "Disponible";
        l7.Condicion = "Malo";
        l7.Mostrar();

    }




}
