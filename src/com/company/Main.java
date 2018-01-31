package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek norite skaiciu ivesti");
        int a = sc.nextInt();
        int[] masyvas = new int[a];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite skaiciu");
            int skaicius = sc.nextInt();
            masyvas[i] = skaicius;
        }
        atvaizdavimas(masyvas);
    }

    public static void atvaizdavimas(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 100) {
                System.out.print(masyvas[i]+ " ");
            }
        }

    }
}

