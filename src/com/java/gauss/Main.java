package com.java.gauss;

public class Main {

    public static void main(String[] args) {
        double[][] matrixA = {{3, 1, 0, -3}, {1, 2, -1, 0}, {0, -1, 3, 0}};
        TrianglularMatrix gaussElimination = new TrianglularMatrix();

        gaussElimination.showInputMatrix(matrixA);
        gaussElimination.transformMatrix(matrixA);
        gaussElimination.showTriangularMatrix();
        gaussElimination.result();

    }
}
