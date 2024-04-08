package Ej_9_Palindromo;

public class Main {

    public static void main (String []args){

        String cadena1 = "anilina";
        String cadena2 = "papa";

        Palindromo cadenaPalindroma = new Palindromo(cadena1);

        System.out.println("La palabra "+ cadena1+" es palindroma: "+cadenaPalindroma.isPalindromo(cadena1));
        System.out.println("La palabra "+ cadena2+" es palindroma: "+cadenaPalindroma.isPalindromo(cadena2));
    }
}
