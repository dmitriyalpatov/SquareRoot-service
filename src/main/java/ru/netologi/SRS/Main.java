package ru.netologi.SRS;

public class Main {

    public int calculateSRS() {

        int result = 0;
        int maxNumber = 400;
        int minNumber= 200;
        for (int i = 10; i <= 99; i++)
            if (i * i >= minNumber) {

                if (i * i <= maxNumber) {
                    result++;
                }



                }
System.out.println(result);

        return result;
    }}