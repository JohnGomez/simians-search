package com.teste.becommerce.validators;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class DnaValidateTest {

    private static final String VALID_SEQUENCE = "ATGC";
    private static final String INVALID_SEQUENCE = "ATGFC9";

    private String [] dna = {
            "CTGAGA",
            "CTGAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};

    private String [] invalidDna = {
            "CTGRGA",
            "CTGAGC",
            "TATTGT",
            "AGAGGG",
            "CCCCTA",
            "TCACTG"};


    @Test
    public void charactersNotValid() {
        Assert.assertFalse(DnaValidate.charactersIsValid(INVALID_SEQUENCE));
    }

    @Test
    public void charactersIsValid() {
        Assert.assertTrue(DnaValidate.charactersIsValid(VALID_SEQUENCE));
    }

    @Test
    public void isValid() {
        Assert.assertTrue(DnaValidate.isValid(dna));
    }

    @Test
    public void isNotValidNullVector() {
        Assert.assertFalse(DnaValidate.isValid(null));
    }

    @Test
    public void isNotValidCharactersInvalid() {
        Assert.assertFalse(DnaValidate.isValid(invalidDna));
    }




}