/**
* Clase que permitirá conocer el funcionamiento y la aplicación del Ciclo Do While
* @author Fernanda Osorio
* @version 1.0
 */
public class CicloDoWhile{
    /**
    * Método principal donde se ejecutará el ciclo Do While para ver los números del 1 al 1000
    * @param args Los argumentos del programa
    */
    public static void main(String[]args){
        //Se imprimen nuestros datos y la explicación del programa al usuario.
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 2 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 2");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("            ***Ciclo Do While***");
        System.out.println("             ");
        System.out.println("Bienvenido al programa Ciclo Do While, donde podrás ver los número primos del 1 al 1000");
      
      //Se declaran las variables i e j con valor de 2.
       int i = 2;
       int j = 2;

    //Comienza el ciclo Do While
    do{
        //lo que hará será tomar una variable esPrimo como true
        boolean esPrimo = true;  
            //se inicializa la variable j en dos
            j = 2; 
            //Comienza el segundo ciclo Do While 
           do{ 
               //Comenzamos un condicional if else que nos dice que si la división de i entre j da como residuo 0 e i 
               //es diferente a dos
               if (i % j == 0 && i != 2) 
               {
                   //entonces la variable esPrimo se cambia a True
                   esPrimo = false; 
                   //se rompe el ciclo
                   break;
               }
               //la variable pasa al valor siguiente.
            j ++; 
            //se realizará este segundo ciclo Do While mientras la variable j sea menor o igual a i/2
           }while (j <= i/2); 
           //termina el primer ciclo do while
                    //inicia un nuevo condicional en donde nos dice que si la variable esPrimo llega hasta este punto
                if (esPrimo)
                 {
                     //entonces se imprimirá qué el número i es primo.
            System.out.println("El número: " + i + " es primo.");
             }
             //se cambia la variable i al valor siguiente.
        i ++ ; 
        //todo esto se realiza mientras la variable i sea <= que 1000
    }while (i <= 1000); 
    //termina el segundo ciclo do while

}
}
