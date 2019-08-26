package com.teste.becommerce.seekers;

import com.teste.becommerce.util.DnaUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiagonalReverseTest {

    private DiagonalReverse diagonalReverse;
    private String [] dna = {
            "CTGAGA",
            "CTAAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    private String [] dna2 = {
            "CTGAGA",
            "CTGCGC",
            "CAcTGA",
            "CcAGaG",
            "CCCATA",
            "TCACTG"};

    private char[][] matriz;
    private char[][] matriz2;


    @Before
    public void init() {
        diagonalReverse = new DiagonalReverse(null);
        matriz = DnaUtil.vectorToMatriz(dna);
        matriz2 = DnaUtil.vectorToMatriz(dna2);
    }

    @Test
    public void searhSimianNotSimian() {
        Assert.assertEquals(1, diagonalReverse.searhSimian(matriz));
    }

    @Test
    public void searhSimianIsSimian() {
        Assert.assertEquals(2, diagonalReverse.searhSimian(matriz2));
    }

}