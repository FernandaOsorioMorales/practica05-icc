/** 
* Clase que calcula el área y el volumen de un cilindro dado un radio de 10 y altura de 20.
* @author Fernanda Osorio
* @version 1.0
*/

public class Cilindro {
    /**
    *Método principal donde se ejecutarán las operaciones para conocer el área
    * y volumen de un cilindro.
    *@param args Los argumentos del programa
    */
    
    public static void main (String[]args){
        //Tenemos que el radio será un valor entero 10
        int radio = 10;
        //La altura será un valor entero 20
        int altura = 20;
        //Pi será un valor double con los cuatro primeros decimales.
        double pi = 3.1416;
        //Declaramos las variables volumen y área.
        double volumen;
        double area;
        
        //Traemos las variables volumen y area antes declaradas y efectuamos las operaciones necesarias para 
        //resolverlas.
        volumen = pi*(radio*radio)*altura;
        area = (((2*pi)*radio*altura)+((2*pi)*(radio*radio)));
        
        //Imprimimos nuestros datos así como el área y volumen del cilindro trayendo las variables.
        System.out.println("    Introducción a Ciencias de la Computación");
        System.out.println("        ");
        System.out.println("                 Práctica 00");
        System.out.println("         ");
        System.out.println("     Alumna:Osorio Morales Fernanda Ameyalli");
        System.out.println("        ");
        System.out.println("       ***Área y Volumen de un cilindro***");
        System.out.println("        ");
        System.out.println("                -Ejercicio 2-");
        System.out.println("        ");
        System.out.println("El área del cilindro es: " + area + " cm²");
        System.out.println("El volumen del cilindro es: " + volumen + " cm³");

    }
}