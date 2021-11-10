/**
* Clase que nos permite mostrar la cuenta de los clientes, mediante su nombre y su dinero disponible.
* @author Fernanda Osorio
* @version 1.0
 */
public class Cuenta{

    //Representa el nombre del titular.
    private String titular;
    //Representa el dinero disponible del titular.
    private double dineroDisponible;

    /**
    * Constructor sin argumentos que genera una cuenta a nombre de Fernanda Osorio con 3202.32 disponibles.
     */
    public Cuenta(){
        this.titular = "Fernanda Osorio";
        this.dineroDisponible = 3202.32;
    }

    /**
    * Constructor que genera una cuenta mediante el nombre del cliente.
    * @param titular
     */
    public Cuenta(String titular){
        this.titular = titular;
        this.dineroDisponible = dineroDisponible;

    }

    /**
    * Método publico que vuelve nuestra clase a un String
    *@return devuelve el nombre del titular con el dinero disponible en su cuenta.
    */
    public String toString(){
        return titular + " tiene esta cantidad de dinero disponible: $ " + dineroDisponible;
    }

    /**
    * Método público get Titular ayuda a que el programa traiga el String titular.
    * @return devuelve el nombre con el que se guardó el Titular.
     */
    public String getTitular(){
        return this.titular;
    }

    /**
    * Método público set Titular que nos ayuda a cambiar el nombre del titular con el que este registrado
    *@param titular
     */
    public void setTitular(String titular){
        this.titular = titular;
    }

    /**
    * Método público get Dinero Disponible que nos ayuda a que el programa traiga el double dineroDisponible.
     * @return Devuelve la cantidad de dinero que hay en la cuenta.
     */
    public double getDineroDisponible(){
        return this.dineroDisponible;
    }
    /**
    * Método público set Dinero Disponible que nos ayuda a que el usuario modofique la cantidad de dinero que hay en la cuenta
    * @param dinero
     */
    public void setDineroDisponible(double dineroDisponible){
        this.dineroDisponible = dineroDisponible;
    }
}