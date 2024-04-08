package Ej_9_Palindromo;

public class Palindromo {

    //Atributo
    String cadena;

    //Constructor
    public Palindromo(String cadena){
        this.cadena=cadena;
    }

    //Getter and setters
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    //Palindromo
    public boolean isPalindromo(String cadena){
        if(cadena.length()<=1){
            return true; //Preguntar si tiene sentido
        }

        return cadena.charAt(0)==cadena.charAt(cadena.length()-1) && isPalindromo(cadena.substring(1, cadena.length()-1));
    }
}
