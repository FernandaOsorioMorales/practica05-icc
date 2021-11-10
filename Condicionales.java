/**
*Clase que permite conocer el funcionamiento del condicional "If else" mediante un ejemplo.
* @author Fernanda Osorio
* @version 1.0
 */
import java.util.Scanner;
public class Condicionales{
    /**
    * Método principal donde ejecutaremos el condicional para descubrir cual número es el que tiene
    *mayor valor
    *@param args Los argumentos del programa
     */
    public static void main (String []args){

        // Imprimimos nuestros datos al usuario y le informamos como funcionará el programa.
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 1 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 1");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("            ***Condicionales***");
        System.out.println("             ");
        System.out.println("Bienvenido al programa Condicionales, en este programa deberás insertar dos números y el programa te devolverá el que tenga mayor valor.");
        
            // Mediante el scanner le solicitaremos al usuario dos números.
        Scanner in = new Scanner (System.in);
        System.out.println("Dame el número 1: ");

        //El primero se guardará en la variable double x
        double x = in.nextDouble();
        System.out.println("Dame el número 2: ");

        //EL segundo se guardará en la variable double y
        double y = in.nextDouble();

        //Comienza nuestro condicional que nos dice que si x es mayor que y
        if (x>y){
            //entonces se imprimirá que el número con mayor valor es x
            System.out.println("El número con mayor valor es: "+ x);
        } else {
            //en caso contrario, se imprimirá que el número con mayor valor es y. 
            System.out.println("El número con mayor valor es: "+ y);
        }

    }
}