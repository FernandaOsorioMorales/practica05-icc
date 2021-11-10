
/**
* Clase que ejecutará el main para probar nuestra clase Cuenta.
*@author Fernanda Osorio
* @version 1.0
 */
public class Main{
    /**
    Método principal donde crearemos cuentas bancarias y se modificará su titular y su dinero disponible.
     */
    public static void main(String[] args){
                //Imprimimos nuestros datos y presentamos el programa.
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 4 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 1");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("     ***Creación de la clase Cuenta***");
        System.out.println("             ");

        //usamos el constructor sin argumentos para crear una nueva cuenta que se llamará "cuentita", la imprimimos
        //para ver su titular y el dinero disponible.
        Cuenta cuentita = new Cuenta();
        System.out.println(cuentita);

        //Usamos el constructor con argumentos para crear una cuenta llamada bancaria a nombre de Alfonso Camacho e 
        //imprimimos los datos mediante el toString.
        Cuenta bancaria = new Cuenta("Alfonso Camacho");
        System.out.println(bancaria);

        //Nuevamente usamos un constructor con argumentos para crear una cuenta llamada cuentota a nombre de Maribel 
        //Rodríguez e imprimimos los datos de la cuenta mediante el toString.
        Cuenta cuentota = new Cuenta("Maribel Rodríguez");
        System.out.println(cuentota);

        //Modificamos el titular de cuentita, lo cambiamos por Mariana Gutierrez y también modificamos el dinero disponible
        // en su cuenta mediante los setters. Finalmente imprimimos los nuevos datos
        cuentita.setTitular("Mariana Gutierrez");
        cuentita.setDineroDisponible(765585.43);
        System.out.println(cuentita);

        //Modificamos el dinero disponible en la cuentota mediante setDineroDisponible e imprimimos los datos.
        cuentota.setDineroDisponible(4373.54);
        System.out.println(cuentota);

        //Modificamos el dinero disponible en la bancaria mediante setDineroDisponible e imprimimos los
        bancaria.setDineroDisponible(89543.76);
        System.out.println(bancaria);

    }
}