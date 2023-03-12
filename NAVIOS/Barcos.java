package NAVIOS;
//Creamos una interfaz, ya que no estamos definiendo ningún objeto.
//Una interfaz es una colección de métodos abstractos que no tienen una implementación definida y que deben ser implementados por cualquier
//clase que implemente la interfaz.
public interface Barcos {
     //Definimos métodos abstractos, ya que no tienen una implementación inicial, la implementación la haran cada una de las clases derivadas.
    public abstract void alarma();
    public abstract void mensajeSocorro(String cadena);
}
