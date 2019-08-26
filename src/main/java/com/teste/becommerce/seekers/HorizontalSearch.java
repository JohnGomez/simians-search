package com.teste.becommerce.seekers;

public class HorizontalSearch extends SimianSearch {

    public HorizontalSearch(SimianSearch next) {
        super(next);
    }

    @Override
    public int searhSimian(char[][] matriz) {
        StringBuffer line;
        int count = 0;

        for (int y = 0; y < matriz.length; y++) {
            line = new StringBuffer();

            for (int x =0 ; x < matriz.length; x++) {
                line.append(matriz[y][x]);
            }
            if (containsSequenceInLine(line.toString().toUpperCase())) {
                count++;

                if(count >1) {
                    return count;
                }
            }
        }
        return count;
    }
}
