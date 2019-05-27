package jv2_assignment03;

import java.util.Scanner;

public class Main {


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố: ");
        int number = sc.nextInt();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = number; i > 0; i++) {
                    if (isPrimeNumber(i)){
                        System.out.println(i);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception E) {
                    }
                }
            }
        };
        new Thread(run).start();
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            System.out.println("Chịu");
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

