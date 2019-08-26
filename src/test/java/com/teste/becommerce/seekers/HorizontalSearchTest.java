package com.teste.becommerce.seekers;

import com.teste.becommerce.util.DnaUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorizontalSearchTest {

    private HorizontalSearch horizontalSearch;

    private String [] dna = {
            "CTGAGA",
            "CTGAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    private String [] dna2 = {
            "CTGAGA",
            "CTGAGC",
            "CATTGT",
            "CGGGGA",
            "CCCCTA",
            "TCACTG"};

    private char[][] matriz;
    private char[][] matriz2;


    @Before
    public void init() {
        horizontalSearch = new HorizontalSearch(null);
        matriz = DnaUtil.vectorToMatriz(dna);
        matriz2 = DnaUtil.vectorToMatriz(dna2);
    }

    @Test
    public void searchSimianNotSimian() {
        Assert.assertEquals(1, horizontalSearch.searhSimian(matriz));
    }

    @Test
    public void searchSimianIsSimian() {
        Assert.assertEquals(2, horizontalSearch.searhSimian(matriz2));
    }

}