package com.teste.becommerce.seekers;

import com.teste.becommerce.util.DnaUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalMainTest {

    private DiagonalMain diagonalMain;

    private String [] dna = {
            "CTGAGA",
            "CTGAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    private String [] dna2 = {
            "CTGAGA",
            "CTAgGC",
            "CATTGT",
            "AGGtGG",
            "CCCCTA",
            "TCACTG"};

    private char[][] matriz;
    private char[][] matriz2;


    @Before
    public void init() {
        diagonalMain = new DiagonalMain(null);
        matriz = DnaUtil.vectorToMatriz(dna);
        matriz2 = DnaUtil.vectorToMatriz(dna2);
    }

    @Test
    public void searhSimianNotSimian() {
        Assert.assertEquals(0, diagonalMain.searhSimian(matriz));
    }

    @Test
    public void searhSimiaIsSimian() {
        Assert.assertEquals(2, diagonalMain.searhSimian(matriz2));
    }

}