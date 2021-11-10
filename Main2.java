/**
* Clase que ejecutará el main de nuestra clase Rectángulo.
* @author Fernanda Osorio
* @version 1.0
 */
public class Main2{
    /**
    * Método principal en donde usaremos objetos y métodos de la clase Rectangulo.
    *@param args Los argumentos del programa
     */
    public static void main (String []args){

            //Imprimimos nuestros datos y presentamos el programa al usuario.
        System.out.println("Introducción a Ciencias de la Computación");
        System.out.println("             ");
        System.out.println("               Práctica 4 ");
        System.out.println("             ");
        System.out.println("              Ejercicio 2");
        System.out.println("             ");
        System.out.println("    Osorio Morales Fernanda Ameyalli");
        System.out.println("             ");
        System.out.println("     ***Creación de la clase Rectángulo***");
        System.out.println("             ");
            //Usamos el constructor sin argumentos y creamos un nuevo rectangulo que se llamará azul 
        Rectangulo azul = new Rectangulo();
            //Imprimimos su base, su perímetro y su área.
        System.out.println("La base del rectángulo azul" + azul);
        System.out.println("El Perímetro del rectángulo azul es: " + azul.getPerimetro());
        System.out.println("El Área del rectángulo azul es: "+ azul.getArea());
            //Usamos el constructor con argumentos y creamos un nuevo rectángulo cuyo nombre será rosa y damos 65 como
            // el valor de su base y 10 como su altura.
        Rectangulo rosa = new Rectangulo(65,10);
            //Imprimimos su base, su perímetro y su área.
        System.out.println("La base del rectángulo rosa"+ rosa);
        System.out.println("El Perímetro del rectángulo rosa es: " + rosa.getPerimetro());
        System.out.println("El Área del rectángulo rosa es: " + rosa.getArea());

            //modificamos el valor de la base del rectángulo azul por 4.6
        azul.setBase(4.6);
            //modificamos el valor de la altura del rectángulo azul por 2.3
        azul.setAltura(2.3);
            //Imprimimos la base, el perímetro y el área del rectángulo azul.
        System.out.println("La base del rectángulo azul"+ azul);
        System.out.println("El Perímetro del rectángulo azul es: " + azul.getPerimetro());
        System.out.println("El Área del rectángulo azul es: "+ azul.getArea());
            //modificamos el valor de la base del rectangulo rosa por 4
        rosa.setBase(4);
            //modificamos el valor de la base del rectángulo rosa de nuevo por 3.
        rosa.setBase(3);
            //imprimimos la base, el perímetro y el área del rectángulo rosa.
        System.out.println("La base del rectángulo rosa"+ rosa);
        System.out.println("El Perímetro del rectángulo rosa es: " + rosa.getPerimetro());
        System.out.println("El Área del rectángulo rosa es: " + rosa.getArea());

            //Usamos el constructor con argumentos para generar un nuevo rectángulo cuyo nombre será verde,
            //con base 8 y altura 10.
        Rectangulo verde = new Rectangulo(8,10);
            //Imprimimos la base, el perímetro y el área del rectangulo verde.
        System.out.println("La base del rectángulo verde" + verde);
        System.out.println("El Perímetro del rectángulo verde es: " + verde.getPerimetro());
        System.out.println("El Área del rectángulo verde es: " + verde.getArea());



        

    }
}