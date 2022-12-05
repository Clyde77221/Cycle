package ru.netology.sqr;

public class SQRService {
    public int SqrtRange(int rangemin, int rangemax) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= rangemin) & (i * i <= rangemax)) {
                count++;
            }
        }
        return count;
    }
}