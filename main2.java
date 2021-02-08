package com.company;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double z = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * a), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * a), 2);
        System.out.print(z);
        in.close();
    }
}
