package com.teste.becommerce.util;

public class DnaUtil {

    public static char[][] vectorToMatriz(String [] dna) {
        char [][] matriz = new char[dna.length][];
        for (int i = 0; i < dna.length; i++) {
            matriz[i] = dna[i].toCharArray();
        }
        return matriz;
    }
}
