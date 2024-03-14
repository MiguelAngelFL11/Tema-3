<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> Tema 3: Métodos de solución de Sistemas de Ecuaciones </i> </b> </font> </h1>

<h4 aling = "center"> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> Integrantes </i> </b> </font> </h4>

  <li>Diego Alonso Fernández Delagadillo</li>
  <li> Antonio Guerrero Lazcano</li>
  <li>Miguel Angel Flores Lopez</li>
  <li>Xavier Valle Dorantes</li>
  
<h3 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  Indice </font> </h3>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#Descripción"> Descripción</a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#TEMARIO"> TEMARIO. </a> </li>  
                            </ul>
                      <li> <a href="#Métodos de solución de Sistemas de Ecuaciones"> Métodos de solución de Sistemas de Ecuaciones. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Método de Eliminacion Gaussiana"> Método de Eliminacion Gaussiana. </a> </li>
                                <li> <a href="#Método de Gauss Jordania"> Método de Gauss Jordania. </a> </li>
                                <li> <a href="#Método de Gauss Seidel"> Método de de Gauss Seidel. </a> </li> 
                                <li> <a href="#Método Jacobi"> Método de Jacobi. </a> </li> 
                            </ul>
                    </ul>
                </nav>
            </font> </header>


<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción"> Descripción</a> </font> </h3>

En este documento vamos a ver sobre los distintos metodos los cuales son:
                                <li>Método de Eliminacion Gaussiana. </a> </li>
                                <li>Método de Gauss Jordania. </a> </li>
                                <li>Método de Gauss Seidel. </a> </li> 
                                <li>Método de Jacobi. </a> </li> 


<h3 align = "center"> <font font face = "forte"> <a name="Métodos de solución de Sistemas de Ecuaciones"> Métodos de solución de Sistemas de Ecuaciones  </front> </h3>

   
  1.1 Método de Eliminacion Gaussiana.
   
  1.2 Método de Gauss Jordania.  
  
  1.3 Método de Gauss Seidel.   

  1.4 Método de Jacobi.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font font face = "forte"> <a name="Métodos de solución de Sistemas de Ecuaciones"> Métodos de solución de Sistemas de Ecuaciones  </front> </h2>

<h3 align = "center"> <font font face = "forte">  1.1 Método de Eliminacion Gaussiana. </h3>

<h3> <font font face = "arial"> Descripción </h2>

El método de eliminación gaussiana es un algoritmo utilizado para resolver sistemas de ecuaciones lineales. Consiste en realizar una serie de operaciones elementales sobre las filas de una matriz aumentada que representa el sistema de ecuaciones, con el objetivo de convertirla en una forma escalonada o triangular superior. Una vez que la matriz está en esta forma, se puede resolver fácilmente el sistema mediante sustitución hacia atrás.

<h3> <font font face = "arial">Pseudocódigo del Método de Eliminacion Gaussiana.</h3>
  
Input: Una matriz aumentada A de tamaño (n x n+1) -
Output: Las soluciones del sistema de ecuaciones

Para k desde 1 hasta n-1:
    Para i desde k+1 hasta n:
        factor = A[i][k] / A[k][k]  
        Para j desde k hasta n+1:
            A[i][j] = A[i][j] - factor * A[k][j] 

Para i desde n hasta 1:
    x[i] = A[i][n+1] / A[i][i]  
    Para j desde i+1 hasta n:
        x[i] = x[i] - A[i][j] * x[j] / A[i][i]

Return x  

<h3> <font font face = "arial">Ejemplo del Método de Eliminacion Gaussiana en código.</h3>

public class GaussianElimination {
    
    public static double[] solve(double[][] A) {
        int n = A.length;
        double[] x = new double[n]; // Vector para almacenar las soluciones
        
        // Eliminación gaussiana
        for (int k = 0; k < n - 1; k++) {
            for (int i = k + 1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n + 1; j++) {
                    A[i][j] -= factor * A[k][j];
                }
            }
        }
        
        // Resolución del sistema triangular superior
        for (int i = n - 1; i >= 0; i--) {
            x[i] = A[i][n] / A[i][i];
            for (int j = i + 1; j < n; j++) {
                x[i] -= A[i][j] * x[j] / A[i][i];
            }
        }
        
        return x;
    }

    public static void main(String[] args) {
        double[][] A = {
            {2, 3, -1, 1},
            {4, 4, -3, 5},
            {2, -1, 2, 7}
        };

        double[] soluciones = solve(A);

        System.out.println("Soluciones:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x[" + i + "] = " + soluciones[i]);
        }
    }
}

<h3 align = "center"> <font font face = "forte">  1.2 Método de Gauss Jordania. </h3>
  
<h3> <font font face = "arial"> Descripción </h2>

El método de Gauss-Jordan es una variante del método de eliminación gaussiana que busca obtener una matriz en forma escalonada reducida por filas, también conocida como forma escalonada reducida. Esta forma simplificada facilita la resolución de sistemas de ecuaciones lineales y la obtención de la inversa de una matriz.

<h3> <font font face = "arial">Pseudocódigo del Método de Gauss Jordania.</h3>
Input: Una matriz aumentada A de tamaño (n x n+1) -
Output: Las soluciones del sistema de ecuaciones

Para k desde 0 hasta n-1:
    Para i desde 0 hasta n-1:
        Si i ≠ k:
            factor = A[i][k] / A[k][k]
            Para j desde k hasta n+1:
                A[i][j] = A[i][j] - factor * A[k][j]
    factor = A[k][k]
    Para j desde k hasta n+1:
        A[k][j] = A[k][j] / factor

Para k desde n-1 hasta 0:
    Para i desde n-1 hasta 0:
        Si i ≠ k:
            factor = A[i][k] / A[k][k]
            Para j desde k hasta n+1:
                A[i][j] = A[i][j] - factor * A[k][j]


Para i desde 0 hasta n-1:
    soluciones[i] = A[i][n]

Return soluciones


<h3> <font font face = "arial">Ejemplo del Método de Gauss Jordania en código.</h3>
  
public class GaussJordan {

    public static double[] solve(double[][] A) {
        int n = A.length;
        double[] soluciones = new double[n];

        // Eliminación hacia adelante
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (i != k) {
                    double factor = A[i][k] / A[k][k];
                    for (int j = k; j < n + 1; j++) {
                        A[i][j] -= factor * A[k][j];
                    }
                }
            }
            // Normalización de la fila k
            double factor = A[k][k];
            for (int j = k; j < n + 1; j++) {
                A[k][j] /= factor;
            }
        }

        // Extracción de las soluciones
        for (int i = 0; i < n; i++) {
            soluciones[i] = A[i][n];
        }

        return soluciones;
    }

    public static void main(String[] args) {
        double[][] A = {
            {2, 3, -1, 1},
            {4, 4, -3, 5},
            {2, -1, 2, 7}
        };

        double[] soluciones = solve(A);

        System.out.println("Soluciones:");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x[" + i + "] = " + soluciones[i]);
        }
    }
}




<h3 align = "center"> <font font face = "forte">  1.3 Método de Gauss Seidel. </h3>

<h3> <font font face = "arial"> Descripción </h2>

El método de Gauss-Seidel es un algoritmo iterativo utilizado para resolver sistemas de ecuaciones lineales. A diferencia de los métodos directos como la eliminación gaussiana, el método de Gauss-Seidel es un método iterativo que mejora iterativamente una aproximación inicial a la solución hasta alcanzar una solución aceptable.

<h3> <font font face = "arial">Pseudocódigo del Método de Gauss Seidel.</h3>

Input: Una matriz A de tamaño (n x n), un vector b de tamaño n, una aproximación inicial x^(0), un número máximo de iteraciones max_iter, y un criterio de convergencia tol.
Output: La aproximación final x^(k) que resuelve el sistema Ax = b o un mensaje de error si no se alcanza la convergencia.

Inicializar un vector x de tamaño n para almacenar la aproximación actual.
Inicializar un vector x_prev de tamaño n para almacenar la aproximación anterior.
Inicializar la variable iter para contar el número de iteraciones realizadas.
Inicializar la variable error para almacenar el error relativo.

Mientras iter < max_iter:
    Para i desde 0 hasta n-1:
        x_prev[i] = x[i] 
        
        suma1 = 0
        Para j desde 0 hasta i-1:
            suma1 += A[i][j] * x[j] 

        suma2 = 0
        Para j desde i+1 hasta n-1:
            suma2 += A[i][j] * x_prev[j] 

        x[i] = (1 / A[i][i]) * (b[i] - suma1 - suma2)  

    error = |x[0] - x_prev[0]|
    Para i desde 1 hasta n-1:
        error = max(error, |x[i] - x_prev[i]|)

    Si error < tol:
        Return x  # Se alcanzó la convergencia

    iter += 1

Return "No se alcanzó la convergencia después de max_iter iteraciones."

<h3> <font font face = "arial">Ejemplo del Método de Gauss Seidel en código.</h3>
  public class GaussSeidel {

    public static double[] solve(double[][] A, double[] b, double[] x0, int maxIter, double tol) {
        int n = A.length;
        double[] x = new double[n];
        double[] xPrev = new double[n];
        double error = Double.MAX_VALUE;
        int iter = 0;

        while (iter < maxIter && error > tol) {
            // Almacenar la aproximación anterior
            System.arraycopy(x, 0, xPrev, 0, n);

            // Calcular la nueva aproximación para cada componente de x
            for (int i = 0; i < n; i++) {
                double sum1 = 0;
                for (int j = 0; j < i; j++) {
                    sum1 += A[i][j] * x[j];
                }

                double sum2 = 0;
                for (int j = i + 1; j < n; j++) {
                    sum2 += A[i][j] * xPrev[j];
                }

                x[i] = (1 / A[i][i]) * (b[i] - sum1 - sum2);
            }

            // Calcular el error relativo
            error = Math.abs(x[0] - xPrev[0]);
            for (int i = 1; i < n; i++) {
                error = Math.max(error, Math.abs(x[i] - xPrev[i]));
            }

            iter++;
        }

        if (error <= tol) {
            return x; // Se alcanzó la convergencia
        } else {
            System.out.println("No se alcanzó la convergencia después de " + maxIter + " iteraciones.");
            return null;
        }
    }

    public static void main(String[] args) {
        double[][] A = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] b = {6, 25, -11};
        double[] x0 = {0, 0, 0};
        int maxIter = 1000;
        double tol = 1e-6;

        double[] soluciones = solve(A, b, x0, maxIter, tol);

        if (soluciones != null) {
            System.out.println("Soluciones:");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.println("x[" + i + "] = " + soluciones[i]);
            }
        }
    }
}

<h3 align = "center"> <font font face = "forte">  1.4 Método de Jacobi. </h3>


