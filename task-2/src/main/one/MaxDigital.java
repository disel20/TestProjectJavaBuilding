package main.one;

import java.util.Random;

public class MaxDigital {
    public static void main(String[] args) {
        //program generate digit and take max
        Random random = new Random();
        int a = random.nextInt(999);
        int b = a%10;
        int c = (a/10)%10;
        int d = (a/100)%10;

        if (b >= c & b > d || b > c & b >= d) {
            System.out.println("В случайном числе " + a + " наибольшая цифра = " + b);
        }
        else {
            if (c > b & c >= d) {
                System.out.println("В случайном числе " + a + " наибольшая цифра = " + c);
            }
            else {
                System.out.println("В случайном числе " + a + " наибольшая цифра = " + d);
            }
        }
    }
}
