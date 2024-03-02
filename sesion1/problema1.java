/**
* Problema 1. Producto
* 
* Dados dos números enteros a y b, siendo b >= 0, se puede definir recursivamente su producto a * b de manera
* similar al ejemplo de la potencia a^n del vídeo didáctico, es decir, en este caso la multiplicación se reduciría 
* a una secuencia de sumas.
* 
* Considerando que solo puedes usar operaciones aditivas (prohibido usar el * para multiplicar), escribe un 
* método de clase recursivo (static) que calcule la operación indicada.
*/

public static int producto(int a, int b) {
  if(b == 0) { return 0; }                      // Caso Base
  else {                                        // Caso General      
    return a + producto(a, b-1);                // Llamada recursiva
    // El producto de a * b es igual a la suma de "a" b veces
  }    
}
