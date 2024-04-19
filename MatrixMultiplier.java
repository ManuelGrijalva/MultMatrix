package edu.ejercicios;

import java.util.Scanner;

public class MatrixMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones de la primera matriz
        System.out.println("Ingrese el número de filas de la primera matriz:");
        int rowsA = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz:");
        int colsA = scanner.nextInt();

        // Solicitar las dimensiones de la segunda matriz
        System.out.println("Ingrese el número de filas de la segunda matriz:");
        int rowsB = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la segunda matriz:");
        int colsB = scanner.nextInt();

        // Verificar si las matrices se pueden multiplicar
        if (colsA != rowsB) {
            System.out.println("Las matrices no se pueden multiplicar. El número de columnas de la primera matriz " +
                    "debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        // Inicializar las matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Solicitar los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.printf("Ingrese el elemento [%d][%d]: ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Solicitar los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.printf("Ingrese el elemento [%d][%d]: ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Realizar la multiplicación de matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Mostrar la matriz resultante
        System.out.println("La matriz resultante es:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

