package NAVIOS;

public class PortaAviones implements Barcos {
    private int numeroAviones;
    private int numeroMarinos;

    public PortaAviones(int numeroAviones, int numeroMarinos) {
        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
    }

    public int getNumeroAviones() {
        return numeroAviones;
    }

    public void setNumeroAviones(int numeroAviones) {
        this.numeroAviones = numeroAviones;
    }

    public int getNumeroMarinos() {
        return numeroMarinos;
    }

    public void setNumeroMarinos(int numeroMarinos) {
        this.numeroMarinos = numeroMarinos;
    }

    public void alarma(){
        System.out.println("Tipo de Barco: PortaAviones");
    }
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }

    @Override
    public String toString() {
        return "PortaAviones [numeroAviones=" + numeroAviones + ", numeroMarinos=" + numeroMarinos + "]";
    }

    
}
