package com.java.gauss;

import java.util.Arrays;

/**
 * Created by User on 2017-03-17.
 */
public class TrianglularMatrix {
    private int k = 1;
    private double[][] traMatrix;

    public void transformMatrix(double[][] matrixA) {
        this.traMatrix = Arrays.copyOf(matrixA, matrixA.length);

        while (k < traMatrix.length) {
            for (int i = k; i < traMatrix.length; i++) {
                for (int j = traMatrix[i].length - 1; j >= k - 1; j--) {
                    double l = traMatrix[i][k - 1] / traMatrix[k - 1][k - 1];
                    traMatrix[i][j] = traMatrix[i][j] - (l * traMatrix[k - 1][j]);
                }
            }
            k++;
        }
    }

    public void showInputMatrix(double[][] matrixA){
        System.out.println("Input matrix: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.format("%1.2f%s", matrixA[i][j], "  ");
            }
            System.out.println();
        }
    }

    public void showTriangularMatrix(){
        System.out.println("Triangular matrix: ");
        for (int i = 0; i < traMatrix.length; i++) {
            for (int j = 0; j < traMatrix[i].length; j++) {
                System.out.format("%1.2f%s", traMatrix[i][j], "  ");
            }
            System.out.println();
        }
    }

    public void result(){
        int m = 0;
        int n = 0;
        for (int i = 0; i < traMatrix.length; i++) {
            m++;
        } m--;
        for (int j = 0; j < traMatrix[0].length; j++) {
            n++;
        } n--;
        System.out.println("Results: ");
        double z = traMatrix[m][n]/ traMatrix[m][n-1];
        double y = (traMatrix[m-1][n]- traMatrix[m-1][n-1] * z)/ traMatrix[m-1][n-2];
        double k = traMatrix[m-2][n-1]*z + ( traMatrix[m-2][n-2]*y);
        double x = (traMatrix[m-2][n] - k) / traMatrix[m-2][n-3];
        System.out.println("x = " + x +"\ny = " + y + "\nz = " + z);
    }
}

