/**
* Clase que permitirá conocer el funcionamiento y la aplicación del Ciclo While
*@author Fernanda Osorio
*@version 1.0
 */
public class CicloWhile{
    /**
    * Método principal donde ejecutaremos el ciclo While para ver los números primos del 1 al 1000.
    * @param args Los argumentos del programa.
     */
    public static void main(String[]args){
        //Imprimimos nuestros datos y le explicamos el funcionamiento del programa al usuario.
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 2 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 1");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("            ***Ciclo While***");
        System.out.println("             ");
        System.out.println("Bienvenido al programa Ciclo While, donde podrás ver los número primos del 1 al 1000");
       
       //declaramos variables i e j cada una con valor de 2.
       int i = 2;
       int j = 2;
       //inicia el ciclo While donde se va a llevar a cabo mientras i sea <= 1000
       while (i<= 1000){
           //se inicializa la variable esPrimo en true 
           boolean esPrimo = true;
           //se trae la variable j con valor de 2
           j = 2;
           //inicia el segundo ciclo While que se llevará a cabo mientras j sea menor que i/2
           while (j <= i/2){
               //inicia el condicional que nos dice que si la división de i/j da como residuo 0
               if (i % j == 0)
               {
                   //entonces la variable esPrimo se vuelve falsa
                   esPrimo= false;
                   //se sale del ciclo
                   break;
               } 
               //la variable j aumenta para continuar.
               j ++; 
           } // se termina el segundo ciclo While en este caso, pero continúa con los demás.
           //inicia un nuevo condicional que si la variable esPrimo llega hasta este punto como true
           if (esPrimo){
               //Entonces imprimirá que el número i es primo
               System.out.println("El número: " + i + " es primo");
           }


           
        i ++;
       } //termina el ciclo While para este caso y continúa con los demás. 
    }
}