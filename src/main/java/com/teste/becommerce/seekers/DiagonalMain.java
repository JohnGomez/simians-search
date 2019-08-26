package com.teste.becommerce.seekers;

public class DiagonalMain extends SimianSearch {


    public DiagonalMain(SimianSearch next) {
        super(next);
    }

    @Override
    public int searhSimian(char[][] matriz) {
        int x =0, y= 0, count = 0;
        StringBuffer line;

        for (int i =0; i < matriz.length; i++ ) {
            for (int j =0; j < matriz.length; j++) {
                x = i;
                line = new StringBuffer();
                for (y = j; y < matriz.length; y++) {
                    if(x < matriz.length) {
                        line.append(matriz[y][x]);
                    }
                    x++;
                }
                if (containsSequenceInLine(line.toString().toUpperCase())) {
                    count++;

                    if(count > 1) {
                        return count;
                    }
                }
            }
        }
        return count;
    }
}
