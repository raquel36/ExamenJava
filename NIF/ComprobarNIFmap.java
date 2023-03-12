package NIF;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


public class ComprobarNIFmap {

    public static void main (String[] args){
        HashMap<Integer, Character> codigo = new HashMap<Integer, Character>();
        codigo.put(0, 'T');
        codigo.put(1, 'R');
        codigo.put(2, 'W');
        codigo.put(3, 'A');
        codigo.put(4, 'G');
        codigo.put(5, 'M');
        codigo.put(6, 'Y');
        codigo.put(7, 'F');
        codigo.put(8, 'P');
        codigo.put(9, 'D');
        codigo.put(10, 'X');
        codigo.put(11, 'B');
        codigo.put(12, 'N');
        codigo.put(13, 'J');
        codigo.put(14, 'Z');
        codigo.put(15, 'S');
        codigo.put(16, 'Q');
        codigo.put(17, 'V');
        codigo.put(18, 'H');
        codigo.put(19, 'L');
        codigo.put(20, 'C');
        codigo.put(21, 'K');
        codigo.put(22, 'E');

        ArrayList<Character> nif = new ArrayList<>(Arrays.asList('4','3','1','1','3','1','2','4','S'));
        String numStr;
        int num=0;
        String numCon="";
        char letra = nif.get(nif.size()-1);
        for (int i = 0; i < nif.size()-1; i++) {
            //Creo una variable temporal para guarrdar cada uno de los digitos de la parte numeroa
            char temp = nif.get(i);
            //Convierte la variable temporar en un String para poder concatenarlo con el resto de números
            numStr = String.valueOf(temp);
            numCon=numCon+numStr;
            //Convierto la concatenación de números en un número entero
            num = Integer.parseInt(numCon);
        }
        System.out.println(numCon);
        int modulo = num%23;
        char letraCorrecta = letraNIF(modulo, codigo);
        boolean correcto = esNIFCorrecto(letraCorrecta, letra, numCon);
        System.out.println(correcto);
    
    }


public static Character letraNIF(int modulo, HashMap<Integer, Character> codigo){
    //Con este módulo extraigo la letra correcta del NIF
    char letra = codigo.get(modulo);
    return letra;

}

public static boolean esNIFCorrecto(char letraCorrecta, char caracter, String numeroStr ){
    // con este modulo compruebo que la parte de los números sea igual a 8 y la letra es la que corresponde
    int largo = numeroStr.length();
    //Al no poder comparar dos variables de tipo char, porque pueden estar en codificaciones diferentes, las he pasado a String
    String letra1 =  Character.toString(letraCorrecta);
    String letra2 = Character.toString(caracter);
    boolean letra = letra1.equals(letra2);
if (largo == 8 && letra) {
    return true;
} else {
    return false;
}
}
}



