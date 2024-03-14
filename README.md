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

<h3> <font font face = "arial"> Descripción:: </h3>

El método de eliminación gaussiana es un algoritmo utilizado para resolver sistemas de ecuaciones lineales. Consiste en realizar una serie de operaciones elementales sobre las filas de una matriz aumentada que representa el sistema de ecuaciones, con el objetivo de convertirla en una forma escalonada o triangular superior. Una vez que la matriz está en esta forma, se puede resolver fácilmente el sistema mediante sustitución hacia atrás.

<h3> <font font face = "arial">Pseudocódigo del Método de Bisección:</h3>
  
Input: Una matriz aumentada A de tamaño (n x n+1)
Output: Las soluciones del sistema de ecuaciones

Para k desde 1 hasta n-1:
    Para i desde k+1 hasta n:
        factor = A[i][k] / A[k][k]  
        Para j desde k hasta n+1:
            A[i][j] = A[i][j] - factor * A[k][j]  # Realiza la eliminación

Para i desde n hasta 1:
    x[i] = A[i][n+1] / A[i][i]  
    Para j desde i+1 hasta n:
        x[i] = x[i] - A[i][j] * x[j] / A[i][i]

Return x  # Devuelve las soluciones



<h3 align = "center"> <font font face = "forte">  1.2 Método de Gauss Jordania. </h3>


<h3 align = "center"> <font font face = "forte">  1.3 Método de Gauss Seidel. </h3>


<h3 align = "center"> <font font face = "forte">  1.4 Método de Jacobi. </h3>


