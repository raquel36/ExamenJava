package NIF;

import java.util.*;

public class FormatoNIF {
    public static void main(String[] args){

        ArrayList<Character> nif = new ArrayList<>(Arrays.asList('4','3','1','1','3','1','2','4','S'));
        boolean esNumero = false; 
        char numero = ' ';
        char letra = nif.get(nif.size()-1);
        //He tenido que crear la siguiente variable, ya que si no el programa fallaba, no detectaba correctamente las letras
        //en la parte del NIF donde solo debía haber números.
        boolean contieneLetra = false;
        for (int i = 0; i < nif.size()-1; i++) {
            numero = nif.get(i);
            esNumero = esDigito(numero);
            if (!esNumero) {
                contieneLetra = true;
            }
        }

        boolean letraMayuscula = esLetraMayuscula(letra);
        boolean FormatoNif = tieneFormatoNIF(esNumero,letraMayuscula,contieneLetra);
        System.out.println(FormatoNif);
    }

    public static boolean esLetraMayuscula(char letra){
        return 'A' <= letra && letra <= 'Z';
    }

    public static boolean esDigito(char caracter){
        return '0' <=caracter && caracter <='9';
    }

    public static boolean tieneFormatoNIF(boolean esNumero, boolean letraMayuscula, boolean contieneLetra){
        return esNumero && letraMayuscula && !contieneLetra;
    }
}
