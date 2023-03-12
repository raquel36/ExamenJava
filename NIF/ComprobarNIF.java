package NIF;
// Versión pidiendo al usuario el número de NIF y el código en un ArrayList
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Esta es la idea mejorada que tenia de como debía resolver el ejercicio del examen

public class ComprobarNIF{
    public static void main(String[] args){
        ArrayList<Character> codigo =new ArrayList<>(Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'));
        Scanner sc = new Scanner(System.in);
        String nif = "";

        System.out.println("Introduzca un número de NIF:");
        nif = sc.next();
        if (nif.length() == 9){
            String numeroStr = nif.substring(0,8);
            int numeros = Integer.valueOf(numeroStr);
            char caracter = nif.charAt(nif.length() - 1);
            char caracterMayus = Character.toUpperCase(caracter);

            int modulo = numeros%23;
            char letraCorrecta = letraNIF(modulo, codigo);
            boolean correcto = esNIFCorrecto(letraCorrecta, caracterMayus, numeroStr);
            System.out.println(correcto);
            sc.close();
        }
        else{
            boolean correcto = false;
            System.out.println(correcto);
        }
        sc.close();
    }

    public static Character letraNIF(int modulo, ArrayList<Character> codigo){
        char letra = codigo.get(modulo);
        return letra;

    }

    public static boolean esNIFCorrecto(char letraCorrecta, char caracterMayus, String numeroStr ){
        int largo = numeroStr.length();
        String letra1 =  Character.toString(letraCorrecta);
        String letra2 = Character.toString(caracterMayus);
        boolean letra = letra1.equals(letra2);
    if (largo == 8 && letra) {
        return true;
    } else {
        return false;
    }
    }


}





    

