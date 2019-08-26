package com.teste.becommerce.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DnaValidate {

    public static final String REGEX = "[^A,T,G,C]";

    public static boolean isValid(String[] dna) {

        if(dna == null) {
            return false;
        }

        for (int i = 0; i < dna.length ; i++) {
            if (!charactersIsValid(dna[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean charactersIsValid(String sequence) {
        Pattern pattern = Pattern.compile(DnaValidate.REGEX);
        Matcher matcher = pattern.matcher(sequence);

        return !matcher.find();
    }
}
