package org.example.AnagramasyPalindromos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1. Problema Fácil: Verificar Palíndromo
//        Descripción:
//        Dada una cadena s, determina si es un palíndromo (se lee igual al derecho y al revés).
//        Ignora mayúsculas/minúsculas y caracteres no alfanuméricos.

//        Ejemplo:
//
//        Entrada: "A man, a plan, a canal: Panama"
//
//        Salida: True (porque al limpiarla queda "amanaplanacanalpanama").7
        System.out.println(  isPalindromo("ana"));
    }

    public static boolean isPalindromo(String s){
        //primero lo vamos a quitar o mas que nada limpiar
        if(s ==  null){return false;}
       String cleaned =  s.replaceAll("[^a-zA-Z]","").toLowerCase();
        String reverse = new StringBuilder(cleaned).reverse().toString();

       return cleaned.equals(reverse);
    }
}
