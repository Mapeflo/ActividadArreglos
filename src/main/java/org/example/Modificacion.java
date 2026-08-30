package org.example;

import java.util.Arrays;
import java.util.Random;

public class Modificacion {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                arreglo[i] = 0;
            }
        }
        System.out.println("Después de cambiar los impares por 0:");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * i;
        }

        System.out.println("Después de multiplicar cada valor por su índice:");
        System.out.println(Arrays.toString(arreglo));
    }
}