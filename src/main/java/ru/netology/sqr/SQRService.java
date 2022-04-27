package ru.netology.sqr;

public class SQRService {

    public int calculateNumber(int low, int upper) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= low && i * i <= upper) {
                count++;
            }
        }
        return count;
    }
}