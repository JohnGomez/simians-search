package com.teste.becommerce.seekers;

public abstract class SimianSearch {

    public static int COUNT = 0;
    private static final String [] sequence = {"CCCC", "AAAA", "TTTT", "GGGG"};

    private SimianSearch next;

    public SimianSearch(SimianSearch next) {
        this.next = next;
    }

    public boolean isSimian (char[][] matriz) {

        COUNT += searhSimian(matriz);
        boolean simianFound = COUNT > 1;

        if((!simianFound) && next != null) {
            return next.isSimian(matriz);
        }

        COUNT = 0;
        return simianFound;
    }

    public boolean containsSequenceInLine(String line) {
        for (String s : sequence) {
            if(line.contains(s)) {
                return true;
            }
        }
        return false;
    }

    public abstract int searhSimian (char[][] matriz);
}
