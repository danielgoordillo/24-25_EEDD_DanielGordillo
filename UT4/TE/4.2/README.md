Tarea evaluable 4.2. Análisis de Algoritmos y Complejidad Ciclomática
Entrega
En tu repositorio de GitHub, crea una carpeta llamada UT4 y dentro de ella una subcarpeta llamada TE4.2. En esta última, añade un archivo llamado readme.md donde copiarás el contenido de este documento. Completa las partes del ejercicio que se indican y entrega el link a tu repositorio en Moodle.

Las imágenes guardalas en la carpeta UT4\TE4.1\_res\img.

Recursos
Concepto de Complejidad Ciclomática
Herramienta crear grafo de flujo: Figma con FigJam Igual que en el tema de los diagramas de flujo.
Ejemplo de grafo de flujo usar como ejemplo para crear el grafo de flujo de los ejercicios.
Práctica guiada con ejercicios de ejemplo resueltos
Enunciado
Para realizar cada uno de estos ejercicios, por un lado tienes que

Adjuntar una imagen del grafo de flujo asociado al fragmento de programa, con los caminos marcados. (Exportar imagen de Figma)
Indicar en el fragmento de programa a qué parte del grafo de flujo corresponde cada línea de código.
Calcular la complejidad ciclomática del grafo.
Indicar la tabla de pruebas necesaria para alcanzar la cobertura de caminos, indicando los caminos y las pruebas necesarias.
Ejercicio 1
Dado el siguiente fragmento de programa en Java: (Indicar el número de línea de cada parte del grafo de flujo)

static int visualizarMedia(int a, int b) {
1   float resultado = 0;
3      4
2   if (x<0 || y<0)) {
5         System.out.println("Error: los valores no pueden ser negativos");
} else {
6       resultado = (x+y)/2;
7       System.out.println("La media es: " + resultado);
}
}
Se pide:

Obtener el grafo de flujo asociado al fragmento de programa. adjuntar imagen del grafo de flujo
![image](https://github.com/user-attachments/assets/3f9a1abe-2f28-439b-9216-e1ef2bb375f9)

Calcular la complejidad ciclomática del grafo.

V(G) = (E - N + 2P)
En base a la complejidad calculada, indica la tabla de pruebas necesaria para alcanzar la cobertura de caminos.
Hay tres caminos posibles.
Indica las pruebas necesarias junto con los caminos que se deben recorrer para alcanzar la cobertura de caminos. (Rellena la siguiente tabla, (borra antes) donde se indica el nombre del caso de prueba, el camino, las condiciones de cada variable o condición, y el resultado esperado)

| Caso de prueba | Camino | Condiciones | Resultado esperado |
|----------------|--------|-------------|--------------------|
| CP1            | 1 → 2 → 3 → 4| 	x < 0, y >= 0  | Error: los valores no pueden ser negativos |
| CP2            |1 → 2 → 5 → 6 → 8 |x >= , y < 0  | Error: los valores no pueden ser negativos |
| CP3           | 	1 → 2 → 3 → 8   | 	x >= 0, y >= 0       | la media es : (x+y)/2
               |
Ejercicio 2
A partir del siguiente algoritmo en pseudocódigo, se pide:

Leer x,y
Si x < 0 o y < 0 entonces
Escribir "Error: los valores no pueden ser negativos"
retorna -1
FinSi

Si x ==1 y y == 1 entonces
retorna 1
FinSi

Mientras x != y hacer
Si x > y entonces
x = x - y
SiNo
y = y - x
FinSi
FinMientras

retorna x
Se pide:

Obtener el grafo de flujo asociado al fragmento de programa. adjuntar imagen del grafo de flujo
![image](https://github.com/user-attachments/assets/20a859d3-67cd-4b56-bdf1-34c90fc90c81)

Calcular la complejidad ciclomática del grafo.

V(G) = ( E - N + 2P = 12 - 10 + 2 = 4)
En base a la complejidad calculada, indica la tabla de pruebas necesaria para alcanzar la cobertura de caminos.

| Caso de prueba | Camino | Condiciones | Resultado esperado |
|----------------|--------|-------------|--------------------|
| CP1            |1→2→3→4 | 		x < 0, y < 0  | Error: los valores no pueden ser negativos |
| CP2            |1→2→6→7 |x = 1, y = 1 && x >= 0, y >= 0 | retorna 1 |
| CP3           | 	1→2→6→9→(10→11/13)*→16   | 	x >= 0, y >= 0  && x distinto de y && distinto de 1    | retorna mcd (en este caso, 3)|
| CP4              |   1→2→6→9→16                 |    x >= 0, y >= 0 && x==y && x distinto de 1                  |          retorna x                            |
Fragmento de Java, algoritmo (método completo):

Ejercicio 3
A partir del siguiente algoritmo en pseudocódigo, se pide:

Leer cantidad
costo1 = cantidad * 125

numcaja = rendondea(0.5 + cant/4)
flete = numcaj*50

Si cant > 1000 entonces
descuento = costo1 * 0.10
SiNo
Si cant > 100 entonces
descuento = costo1 * 0.05
SiNo
descuento = 0
FinSi
FinSi

costoTotal = costo1 + flete - descuento

Esribir "El costo total es: " + costoTotal
Se pide:

Obtener el grafo de flujo asociado al fragmento de programa. adjuntar imagen del grafo de flujo
![image](https://github.com/user-attachments/assets/8d19d75a-1437-4283-88b9-1ec174512567)

Calcular la complejidad ciclomática del grafo.

V(G) = (E - N + 2P = 12 - 11 + 2 = 3)
En base a la complejidad calculada, indica la tabla de pruebas necesaria para alcanzar la cobertura de caminos.

| Caso de prueba | Camino | Condiciones | Resultado esperado |
|----------------|--------|-------------|--------------------|
| CP1            |	1→2→3→4→5→6→14→15 | 		cantidad > 1000| 	costo con 10% de descuento |
| CP2            |1→2→3→4→5→7→8→9→14→15 |	100 < cantidad ≤ 1000| costo con 5% de descuento|
| CP3           | 		1→2→3→4→5→7→8→10→11→14→15   | cantidad ≤ 100    | 	costo sin descuento|
                            |
Ejericio 4
A partir del siguiente método de programa en Java (incluir condiciones && y retornos directos), se pide:

public static int calcular(int a, int b) {
if (a < 0 && b < 0) {
return -1;
} else if (a == 0 || b == 0) {
return 0;
} else if (a > b) {
return a + b;
} else {
return a * b;
}
}
Se pide:

Obtener el grafo de flujo asociado al fragmento de programa. adjuntar imagen del grafo de flujo
![image](https://github.com/user-attachments/assets/ffb51d44-2d5f-4e2a-a5f0-e632e27270f4)

Calcular la complejidad ciclomática del grafo.

V(G) = (Nª decisiones +1=3+1=4)
En base a la complejidad calculada, indica la tabla de pruebas necesaria para alcanzar la cobertura de caminos.

| Caso de prueba | Camino | Condiciones | Resultado esperado |
|----------------|--------|-------------|--------------------|
| CP1            |	if1→return -1 | 		a < 0 y b < 0| -1 |
| CP2            |else if1→return 0 | a == 0|0|
| CP3           | 		else if2→return a+b  | 	a y b > 0; a > b   | 	A+B|
| CP4               |  else→return a*b          |      	a y b > 0; a ≤ b                  |        A*B            |
Ejercicio 5 (Resuelto)
En este ejercicio se trabajan las clases de equivalencia y los valores límite. A partir del siguiente método de programa en Java, se pide:

(genera un método original, no copiar el de la práctica guiada)

public static String clasificarNumero(int numero) {
if (numero < 0) {
return "Negativo";
} else if (numero == 0) {
return "Cero";
} else if (numero > 0 && numero <= 10) {
return "Pequeño";
} else if (numero > 10 && numero <= 100) {
return "Mediano";
} else {
return "Grande";
}
}

En base a este método, las clases de equivalencia y los valores límite serían los siguientes:
public static String clasificarMultiplo(int numero) {
    if (numero % 3 == 0 && numero % 5 == 0) {
        return "Múltiplo de 3 y 5";
    } else if (numero % 3 == 0) {
        return "Múltiplo de 3";
    } else if (numero % 5 == 0) {
        return "Múltiplo de 5";
    } else {
        return "No es múltiplo de 3 ni de 5";
    }
}


| Clase de equivalencia | Valores límites |
|-----------------------|----------------|
| Múltiplo de 3 y 5         |numero % 3 == 0 && numero % 5 == 0      |
| Múltiplo de 3                | numero % 3 == 0 && numero % 5 != 0             |
| multiplo de 5              |numero % 3 != 0 && numero % 5 == 0     |
| No múltiplo de 3 ni de 5              | numero % 3 != 0 && numero % 5 != 0    |


Ejercicio 6
En base al siguiente método de programa en Java, se pide:

public static String clasificarEdad(int edad) {
if (edad < 0) {
return "Edad no válida";
} else if (edad >= 0 && edad <= 12) {
return "Niño";
} else if (edad > 12 && edad <= 19) {
return "Adolescente";
} else if (edad > 19 && edad <= 65) {
return "Adulto";
} else {
return "Anciano";
}
}
Se pide:

Obtener el grafo de flujo asociado al fragmento de programa. adjuntar imagen del grafo de flujo
![image](https://github.com/user-attachments/assets/6a592b6e-048e-4fa5-b50a-f676be4a9a41)

Calcular la complejidad ciclomática del grafo.
V(G) = (E - N + 2P = 11 - 10 + 2 = 3)
Indica las clases de equivalencia y los valores límite para el método clasificarEdad.
| Clase de equivalencia | Valores representativos |
|-----------------------|----------------|
|     edad no valida    |      -1, -100          |
|     niño             |     0, 6, 12           |
|     adolescente       |       13, 16, 19         |
|         adulto      |      20, 40, 65           |
|         anciano      |     	66, 80, 100            |
