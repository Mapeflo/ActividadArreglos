package org.example;

public class RecorridoMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz impresa en forma de tabla:");
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        // 2. Recorrer la matriz por columnas
        System.out.println("Recorrido por columnas:");
        System.out.println();

        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("Columna " + j + ": ");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}