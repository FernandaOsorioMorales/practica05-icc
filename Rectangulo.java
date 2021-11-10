/**
* Clase que permitirá construir rectángulos y calcular su área y perímetro.
* @author Fernanda Osorio
*@version 1.0
 */ 
 public class Rectangulo{

     //Representa el valor de la base del rectangulo
     private double base;
     //Representa el valor de la altura del rectangulo
     private double altura;
    

    /**
    * Constructor sin argumentos que crea un rectangulo con base 34 y altura 10.
     */
    public Rectangulo(){
        this.base = 34;
        this.altura = 10;
    }

    /**
    * Constructor que crea un rectángulo insertando la base y la altura.
    * @param base y altura
     */
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    /**
    * Método getAltura que devuelve el valor de la altura del rectangulo.
    * @return valor de la altura del rectangulo.
     */

    public double getAltura(){
        return this.altura;
    }
    /**
    * Método público setAltura que cambia el valor de la altura
    * @param altura
     */
    public void setAltura(double altura){
        this.altura = altura;
    }
    /**
    * Método público getBase que devuelve el valor de la base del rectangulo
    * @return valor de la base del rectangulo.
     */
    public double getBase(){
        return this.base;
    }
    /**
    *Método público setBase que cambia el valor de la base del rectángulo.
    * @param base
     */
    public void setBase(double base){
        this.base = base;
    }

    /**
    *Método público getArea que devuelve el valor del área del rectangulo
    * @return la multiplicación de base por altura.
     */
    public double getArea(){
        return (this.base * this.altura);
    }
    
    /**
    * Método público getPerimetro que devuelve el valor del perímetro del rectángulo.
    *@return suma dos veces la altura y dos veces la base.
     */
    public double getPerimetro(){
        return ((2* this.base)+(2* this.altura));
    }
    
    /**
    * Método público toString que vuelve nuestra clase a un String
    * @return devolverá la base y la altura de cada triangulo.
    */
    public String toString(){
        return " es "+ base + " y su área es " + altura;
    }
 }