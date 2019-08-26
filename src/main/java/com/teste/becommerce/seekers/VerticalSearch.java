package com.teste.becommerce.seekers;

public class VerticalSearch extends SimianSearch {

    public VerticalSearch(SimianSearch next) {
        super(next);
    }

    @Override
    public int searhSimian(char[][] matriz) {
        int count = 0;
        StringBuffer line;

        for (int x = 0; x < matriz.length; x++) {
            line = new StringBuffer();
            for (int y = 0; y < matriz.length; y++) {
				line.append(matriz[y][x]);
            }
            if (containsSequenceInLine(line.toString().toUpperCase())) {
                count++;

                if(count > 1) {
                    return count;
                }
            }
        }
        return count;
    }
}
