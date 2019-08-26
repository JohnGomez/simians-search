package com.teste.becommerce.services;

import com.teste.becommerce.seekers.*;
import com.teste.becommerce.util.DnaUtil;
import org.springframework.stereotype.Service;

@Service
public class SimianService {

    public boolean isSimian(String[] dna) {
        char [][] matriz = DnaUtil.vectorToMatriz(dna);

        SimianSearch simianSearch = new HorizontalSearch(new VerticalSearch(
                new DiagonalMain(new DiagonalReverse(null))));

        return simianSearch.isSimian(matriz);
    }
}
