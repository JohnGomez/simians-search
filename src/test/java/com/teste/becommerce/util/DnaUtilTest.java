package com.teste.becommerce.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DnaUtilTest {

    private String [] dna = {
            "CTGAGA",
            "CTGAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    @Test
    public void vectorToMatriz() {
        char[][] matriz = DnaUtil.vectorToMatriz(dna);

        Assert.assertEquals(6, matriz.length);
        Assert.assertEquals(6, matriz[0].length);
    }
}