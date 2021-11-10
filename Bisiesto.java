/**
*Clase que nos permitirá saber si el año que  se inserta es bisiesto o no
* @author Fernanda Osorio
* @version 1.0
 */
import java.util.Scanner;
    public class Bisiesto{
        /**
        * Método principal donde ejecutamos el condicional if else para ver si un año es
        * bisiesto o no
        * @param args Los argumentos del programa
         */
             public static void main (String[]args){
                 //Imprimimos nuestros datos y damos la bienvenida al programa al usuario
                 
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 1 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 2");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("            ***Bisiesto***");
        System.out.println("             ");
        System.out.println("Bienvenido al programa Bisiesto, en este programa te permitirá saber si el año que insertas es bisiesto o no");
                    // Usamos el scanner para que el usuario inserte el año que desea saber si es bisiesto o no.
        Scanner in = new Scanner (System.in);
        System.out.println("Ingresa el año del que desea saber si es bisiesto o no: ");
        int año = in.nextInt();

    
            /*Comenzamos nuestro if diciendo que si cuando dividimos la cifra del año entre 4 nos da residuo 0
            y cuando la cifra entre 100 nos da un residuo diferente a 0 o la cifra entre 400 nos da residuo 0
            */
        if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)){
            //entonces el programa imprimirá que el año es bisiesto.
            System.out.println("El año " + año + " es bisiesto");
        } else {
            //en cualquier otro caso, se imprimirá que el año no es bisiesto.
            System.out.println("El año " + año + " no es bisiesto");
        }
         }

    }
        