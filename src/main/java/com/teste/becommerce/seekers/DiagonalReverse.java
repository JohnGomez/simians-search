package com.teste.becommerce.seekers;

public class DiagonalReverse extends SimianSearch {

    public DiagonalReverse(SimianSearch next) {
        super(next);
    }

    @Override
    public int  searhSimian(char[][] matriz) {
        int x = 0, y = 0, count = 0;
        StringBuffer line;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length; j > -1; j--) {
                x = i;
                line = new StringBuffer();

                for (y = j - 1; y > -1; y--) {
                    if (x < matriz.length) {
                        line.append(matriz[y][x]);
                    }
                    x++;
                }
                if (containsSequenceInLine(line.toString().toUpperCase())) {
                    count++;

                    if (count > 1) {
                        return count;
                    }
                }
            }
        }
        return count;
    }
}
