package NAVIOS;

public class Main {
    // Esta clase me permite acceder a los objetos de las clases creadas y definir sus atributos.
    // También me permite ejecutar los métodos de las clases
    public static void main(String[] args){
        // Creamos un objeto de cada clase y le indicamos los atributos correspondientes, es necesario indicar los tipos de atributos que se
        // han definido en el constructor. Tenemos la opción de crear constructores con menos atributos.
        Crucero miCrucero = new Crucero(5.5, 100);
        PortaAviones miPortaAviones = new PortaAviones(20, 500);
        Pesquero miPesquero = new Pesquero(40.5, 3000, 200);

        // Para poder mostrar los atributos de los objetos creados en las clases, es necesario que tengan sus respectivos getters y setters
        // y un método toString para mostrar por pantalla los atributos de cada objeto.
        miCrucero.mensajeSocorro("Todo bien");
        System.out.println(miCrucero.toString());
        miPortaAviones.mensajeSocorro("Estamos rodeados!!");
        System.out.println(miPortaAviones.toString());
        miPesquero.mensajeSocorro("Hay una ballena cerca");
        System.out.println(miPesquero.toString());
    }
}
