package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number");
        int a = scan.nextInt();

        positiveNegativeZero(a);
    }
    public static double positiveNegativeZero(int liczba) {
        if (liczba < 0) {
            System.out.println("The value is negative");
        } else if (liczba == 0){
            System.out.println("The value is zero");
        }  else {
            System.out.println("The value is positive");
        }
        return liczba;

    }
}
