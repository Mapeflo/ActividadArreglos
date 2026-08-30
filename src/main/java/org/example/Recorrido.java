package org.example;

import java.util.Arrays;
import java.util.Random;

public class Recorrido {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        System.out.println("1. Recorrido con for clásico:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + " → valor: " + arreglo[i]);
        }
        System.out.println();

        System.out.println("2. Recorrido con for-each:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}