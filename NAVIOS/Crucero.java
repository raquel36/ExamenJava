package NAVIOS;

public class Crucero implements Barcos {
    private double metros;
    private int contadorCamas;

    

    public Crucero(double metros, int contadorCamas) {
        this.metros = metros;
        this.contadorCamas = contadorCamas;
    }

    

    public double getMetros() {
        return metros;
    }



    public void setMetros(double metros) {
        this.metros = metros;
    }



    public int getContadorCamas() {
        return contadorCamas;
    }



    public void setContadorCamas(int contadorCamas) {
        this.contadorCamas = contadorCamas;
    }



    public void alarma(){
        System.out.println("Tipo de Barco: Crucero");
    }
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }



    @Override
    public String toString() {
        return "Crucero [metros=" + metros + ", contadorCamas=" + contadorCamas + "]";
    }

    
}
