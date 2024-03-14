
package Tema_3;

/**
 *
 * @author alons
 */
public class GaussSeidel {
    public static void main(String[] args) {
        double[][] A = {
                {4.0, -1.0, 0.0},
                {-1.0, 4.0, -1.0},
                {0.0, -1.0, 4.0}
        };
        double[] b = {12.0, 6.0, 6.0};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int maxIterations = 100;
        double epsilon = 1e-6;

        for (int iter = 0; iter < maxIterations; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
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