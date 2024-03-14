/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema_3;

/**
 *
 * @author alons
 */
public class Jacobi {
    public static void main(String[] args) {
        double[][] A = {
                {4.0, -1.0, 0.0},
                {-1.0, 4.0, -1.0},
                {0.0, -1.0, 4.0}
        };
        double[] b = {12.0, 6.0, 6.0};
        double[] x = jacobi(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] jacobi(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        double[] bNew = new double[n];
        double[] maxError = new double[n];
        int maxIterations = 100;
        double epsilon = 1e-6;

        for (int iter = 0; iter < maxIterations; iter++) {
            for (int i = 0; i < n; i++) {
                bNew[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        bNew[i] -= A[i][j] * x[j];
                    }
                }
                bNew[i] /= A[i][i];
            }

            for (int i = 0; i < n; i++) {
                newX[i] = bNew[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
                maxError[i] = Math.abs(newX[i] - x[i]);
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (maxError[i] > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
        }

        return x;
    }
}
