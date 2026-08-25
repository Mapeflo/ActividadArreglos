package org.example;

import java.util.Arrays;
import java.util.Random;


    public class Declaracion {

        public static void main(String[] args) {

            int[] arreglo = new int[10];

            Random random = new Random();
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = random.nextInt(100) + 1;
            }
            System.out.println("Arreglo de 10 enteros aleatorios:");
            System.out.println(Arrays.toString(arreglo));
        }
    }

