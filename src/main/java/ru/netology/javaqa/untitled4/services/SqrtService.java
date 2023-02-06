
package ru.netology.javaqa.untitled4.services;

public class SqrtService {
    private final int bottomLine = 10;
    private final int upperLine = 99;

    public int calcSqrt(int bottomBorderOfSquares, int upperBorderOfSquares) {
        int count = 0;
        for (int i = bottomLine; i <= upperLine; i++) {
            if (i * i >= bottomBorderOfSquares && i * i <= upperBorderOfSquares) {
                count++;
            }
        }
        return count;
    }

}

