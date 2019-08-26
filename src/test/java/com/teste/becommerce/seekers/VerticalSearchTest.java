package com.teste.becommerce.seekers;

import com.teste.becommerce.services.SimianService;
import com.teste.becommerce.util.DnaUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VerticalSearchTest {

    private VerticalSearch verticalSearch;
    private String [] dna = {"CTGAGA",
                             "CTGAGC",
                             "TATTGT",
                             "AGAGGG",
                             "CCCCTA",
                             "TCACTG"};

    private String [] dna2 = {"CTGAGA",
                              "CTGAGC",
                              "CATTGT",
                              "CGAGGG",
                              "CCCCTA",
                              "TCACTG"};
    private char[][] matriz;
    private char[][] matriz2;


    @Before
    public void init() {
        verticalSearch = new VerticalSearch(null);
        matriz = DnaUtil.vectorToMatriz(dna);
        matriz2 = DnaUtil.vectorToMatriz(dna2);
    }

    @Test
    public void searhSimianNotSimian() {
        Assert.assertEquals(1, verticalSearch.searhSimian(matriz));
    }

    @Test
    public void searhSimianIsSimian() {
        Assert.assertEquals(2, verticalSearch.searhSimian(matriz2));
    }

}