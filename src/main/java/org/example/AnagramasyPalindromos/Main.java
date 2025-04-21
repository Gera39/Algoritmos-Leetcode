package org.example.AnagramasyPalindromos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(  isPalindromo("ana"));
        String [] angramas = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> resultado = agruparAnagrama(angramas);
        resultado.stream().forEach(System.out::println);


    }

    //        1. Problema Fácil: Verificar Palíndromo
//        Descripción:
//        Dada una cadena s, determina si es un palíndromo (se lee igual al derecho y al revés).
//        Ignora mayúsculas/minúsculas y caracteres no alfanuméricos.

    //        Ejemplo:
//
//        Entrada: "A man, a plan, a canal: Panama"
//
//        Salida: True (porque al limpiarla queda "amanaplanacanalpanama").7
    public static boolean isPalindromo(String s){
        //primero lo vamos a quitar o mas que nada limpiar
        if(s ==  null){return false;}
       String cleaned =  s.replaceAll("[^a-zA-Z]","").toLowerCase();
        String reverse = new StringBuilder(cleaned).reverse().toString();

       return cleaned.equals(reverse);
    }

    //        2. Problema Intermedio: Agrupar Anagramas
//        Descripción:
//        Dada una lista de palabras, agrupa las que son anagramas entre sí. Un anagrama es una palabra formada al reordenar las letras de otra.
//
//        Ejemplo:
//
//        Entrada: ["eat", "tea", "tan", "ate", "nat", "bat"]
//
//        Salida: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]].
    public static List<List<String>> agruparAnagrama(String palabras []){
        if(palabras.length < 2){
            return null;
        }
        Map<String,List<String>> anagramas = new HashMap<>();
        for(String word: palabras){
            char [] w = word.toCharArray();
            Arrays.sort(w);
            String complet = new String(w);
            if(!anagramas.containsKey(complet)){
                anagramas.put(complet,new ArrayList<>());
            }
            anagramas.get(complet).add(word);
        }
        return new ArrayList<>(anagramas.values());


    }
}
