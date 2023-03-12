package NAVIOS;

public class Pesquero implements Barcos {
    private double metrosEslora;
    private int potencia;
    private int numeroPescadores;


    public Pesquero(double metrosEslora, int potencia, int numeroPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numeroPescadores = numeroPescadores;
    }


    public double getMetrosEslora() {
        return metrosEslora;
    }


    public void setMetrosEslora(double metrosEslora) {
        this.metrosEslora = metrosEslora;
    }


    public int getPotencia() {
        return potencia;
    }

    public void alarma(){
        System.out.println("Tipo de Barco: Pesquero");
    }
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }


    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    public int getNumeroPescadores() {
        return numeroPescadores;
    }


    public void setNumeroPescadores(int numeroPescadores) {
        this.numeroPescadores = numeroPescadores;
    }


    @Override
    public String toString() {
        return "Pesquero [metrosEslora=" + metrosEslora + ", potencia=" + potencia + ", numeroPescadores="
                + numeroPescadores + "]";
    }

    

    
}
