/**
*Clase que muestra la cantidad de bytes que ocupa cada tipo primitivo
*@author Fernanda Osorio
*@version 1.0
 */

public class Primitivo {
    /**
    *Método principal donde vemos la cantidad de bytes que ocupa cada tipo primitivo
    *@param args Argumentos del programa
     */
    
    public static void main (String[]args){
        
        //Imprimimos la presentación de nuestro programa al usuario, mostrando nuestros datos y el número de ejercicio que es.
    

System.out.println("  Introducción a Ciencias de la Computación");
System.out.println("        ");
System.out.println("                 PRACTICA 0   ");
System.out.println("        ");
System.out.println(" Alumna: Osorio Morales Fernanda Ameyalli");
System.out.println("        ");
System.out.println("            ***Tipos primitivos***");
System.out.println("        ");
System.out.println("                -Ejercicio 1-");
System.out.println("        ");
            
            //Imprimimos todos los tipos de datos usando BYTES.
            
System.out.println("El tipo primitivo byte ocupa: " + Byte.BYTES + " bytes");
System.out.println("EL tipo primitivo short ocupa: " + Short.BYTES + " bytes");
System.out.println("El tipo primitivo int ocupa: " + Integer.BYTES + " bytes");
System.out.println("El tipo primitivo long ocupa: " + Long.BYTES + " bytes");
System.out.println("El tipo primitivo float ocupa: " + Float.BYTES + " bytes");
System.out.println("El tipo primitivo double ocupa: " + Double.BYTES + " bytes");
System.out.println("EL tipo primitivo Boolean ocupa: 1 byte");
System.out.println("El tipo primitivo char ocupa: "+ Character.BYTES + " bytes");

    }
}

