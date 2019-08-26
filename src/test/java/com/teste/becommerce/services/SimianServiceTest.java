package com.teste.becommerce.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimianServiceTest {

    private SimianService simianService;

    private String [] dna = {
            "CTGAGA",
            "CTAAGC",
            "CATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    private String [] dna2 ={
            "CTGAGA",
            "CTGAGC",
            "TATTGT",
            "AGAGAG",
            "CACCTA",
            "TCACTG"};

    @Before
    public void init () {
        simianService = new SimianService();
    }

    @Test
    public void isSimian() {
        Assert.assertTrue(simianService.isSimian(dna));
    }

    @Test
    public void NotSimian() {
        Assert.assertFalse(simianService.isSimian(dna2));
    }
}