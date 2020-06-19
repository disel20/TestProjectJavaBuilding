package main.one;

import java.util.Random;

public class Summa {
    public static void main(String[] args) {
        //program generate random 3 digit and summary
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        int a = random1.nextInt(999);
        int b = random2.nextInt(999);
        int c = random3.nextInt(999);

        int a1 = (a/100)%10;
        int b1 = (b/100)%10;
        int c1 = (c/100)%10;
        int summa = a1+b1+c1;

        System.out.println("Случайные числа: " + a + "/" + b + "/" + c + "/" + " сумма первых цифр = " + summa);

    }
}
