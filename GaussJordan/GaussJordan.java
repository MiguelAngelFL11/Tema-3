/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author alons
 */
public class GaussJordan {
    public static void main(String[] args) {
        double[][] A = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        double[] b = {1.0, 2.0, 3.0};
        double[] x = gaussJordan(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussJordan(double[][] A, double[] b) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            double max = Math.abs(A[i][i]);
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(A[j][i]) > max) {
                    max = Math.abs(A[j][i]);
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                double[] temp = A[i];
                A[i] = A[maxIndex];
                A[maxIndex] = temp;
                double t = b[i];
                b[i] = b[maxIndex];
                b[maxIndex] = t;
            }
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k < n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
                b[j] -= factor * b[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                double factor = A[i][j];
                b[i] -= factor * b[j];
                A[i][j] = 0;
            }
            double factor = A[i][i];
            b[i] /= factor;
            A[i][i] = 1;
        }
        return b;
    }
}