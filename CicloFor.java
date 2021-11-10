/**
* Clase que nos permitirá conocer el funcionamiento y aplicación del ciclo For
*@author Fernanda Osorio
*@version 1.0
 */
public class CicloFor{
    /**
    * Método principal donde ejecutaremos el ciclo For para conocer los números primos del 1 al 1000
    * @param args Los argumentos del programa
     */
    public static void main (String[]args){
            //Imprimimos nuestros datos y presentamos el funcionamiento del programa al usuario.

        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 1 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 3");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("            ***CicloFor***");
        System.out.println("             ");
        System.out.println("Bienvenido al programa CicloFor, donde podrás ver los número primos del 1 al 1000");

                //Comienza el ciclo For, en donde declaramos la variable i que iniciará en 2 e irá hasta <= 1000,
                //dando saltos de uno en uno.
        for (int i = 2; i <= 1000 ; i++){
                    //declaramos la variable esPrimo como true
            boolean esPrimo = true;
            //Iniciamos un nuevo ciclo For en donde la variable j irá desde el 2 hasta <= i/2, dando saltos de uno 
            //en uno.
           for (int j = 2; j <= i/2; j++){
               //Iniciamos un condicional if else en donde si la división entre ambas variables da como residuo 0
               if (i % j == 0){
                   //entonces la variable esPrimo cambiará a False
                   esPrimo = false ;
               } //se termina el if
           } // se termina el segundo ciclo for en este caso pero continua con los demás.
           //Se inicia un nuevo condicional if else en donde si la variable esPrimo llega a ese punto
           if (esPrimo){
               //entonces se imprimirá que el número i es primo.
               System.out.println("El número: " + i + " es primo");
           }

            }//se termina el primero ciclo for para este caso y continúa para el siguiente.
        }
            
            
        

    }
