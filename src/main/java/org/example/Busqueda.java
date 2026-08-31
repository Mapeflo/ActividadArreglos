package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo generado:");
        System.out.println(Arrays.toString(arreglo));
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor que desea buscar: ");
        int valorBuscado = scanner.nextInt();

        int posicion = busquedaLineal(arreglo, valorBuscado);

        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " se encontró en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorBuscado + " NO se encuentra en el arreglo.");
        }

        scanner.close();
    }

    public static int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}

