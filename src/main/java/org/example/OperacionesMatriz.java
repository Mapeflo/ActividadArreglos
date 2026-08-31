package org.example;

public class OperacionesMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        System.out.println();

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma de todos los elementos: " + suma);
        System.out.println();

        int[] filaTemporal = matriz[0];
        matriz[0] = matriz[2];
        matriz[2] = filaTemporal;

        System.out.println("Matriz después de intercambiar la primera fila con la última:");
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}