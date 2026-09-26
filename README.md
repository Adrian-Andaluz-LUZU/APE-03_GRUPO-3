#  APE 3 - Estructuras de Repetición en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

---

##  Información General

* **Carrera:** Ingeniería en Software  
* **Asignatura:** Algoritmos y Lógica de Programación  
* **Nivel / Parallelo:** Primer Semestre — Paralelo B  
* **Actividad:** APE 3 – Estructuras de Repetición  
* **Modalidad:** Presencial  

---

##  Objetivo General

Desarrollar soluciones algorítmicas utilizando estructuras repetitivas (`for`, `while` y `do-while`), seleccionando el ciclo apropiado según la naturaleza de cada problema, aplicando validaciones de datos, contadores, acumuladores, valores centinela y ciclos anidados; evidenciando el diseño de algoritmos, la implementación orientada a código limpio en Java y el trabajo colaborativo mediante la gestión de ramas, Pull Requests y revisiones de código en GitHub.

---

##  Integrantes y Matriz de Contribuciones

| Integrante | Ejercicios Asignados | Responsabilidades en GitHub / Proyecto | Aporte (%) |
| :--- | :--- | :--- | :---: |
| **Adrián Andaluz** | Ejercicio 01<br>Ejercicio 02 | - Creación y estructura base del repositorio.<br>- Revisión de Pull Request (Code Review) del Ejercicio 03/04.<br>- Elaboración y formato final del informe PDF/Moodle. | 25% |
| **Pulo Escobar** | Ejercicio 03<br>Ejercicio 04 | - Configuración de la documentación y diagramas de flujo.<br>- Revisión de Pull Request (Code Review) del Ejercicio 05/06.<br>- Apoyo en pruebas de escritorio. | 25% |
| **Mateo Salazar** | Ejercicio 08<br>Ejercicio 09<br>Ejercicio 10 | - Implementación de lógica de ciclos y validaciones.<br>- Revisión de Pull Request (Code Review) del Ejercicio 08/09/10.<br>- Verificación de normas de código limpio e indentación. | 25% |
| **Ariel Chanatasig** | Ejercicio 05<br>Ejercicio 06<br>Ejercicio 07 | - Diseño de menú interactivo e integración de ejercicios.<br>- Revisión de Pull Request (Code Review) de ejercicios base.<br>- Control de calidad y lista de verificación final. | 25% |

---
# 1. Promedio de calificaciones

##  Enunciado
Desarrollar un programa que solicite la cantidad $N$ de estudiantes y luego registre sus calificaciones, las cuales deben ser válidas en el rango de 0 a 10. El sistema debe mostrar el promedio general, la calificación mayor, la menor, el número de aprobados y el número de reprobados.

---

## 2. Análisis
Para resolver el problema planteado, se requiere implementar una secuencia de pasos lógicos basada en la lectura e iteración de datos:
* **Validación inicial:** Solicitar la cantidad $N$ de estudiantes asegurando que sea un número entero mayor a 0.
* **Procesamiento repetitivo:** Utilizar un bucle `for` para iterar desde 1 hasta $N$.
* **Validación de entradas:** Dentro del bucle, solicitar la nota de cada estudiante y utilizar una estructura condicional o bucle de validación para asegurar que la calificación esté dentro del intervalo $[0, 10]$.
* **Acumulación y Conteo:** 
  * Sumar las notas en una variable acumuladora para calcular posteriormente el promedio general.
  * Comparar cada nota con las variables de calificación máxima y mínima para actualizarlas progresivamente.
  * Contar cuántos estudiantes aprueban (nota $\ge 7.0$) y cuántos reprueban (nota $< 7.0$) mediante una estructura condicional.
* **Cálculo final:** Calcular el promedio dividiendo la suma total de notas entre $N$.

---

##  Entradas / Procesos / Salidas

* **Entradas:**
  * `N`: Cantidad de estudiantes a registrar ($N > 0$).
  * `nota`: Calificación de cada estudiante ($0 \le \text{nota} \le 10$).

* **Procesos:**
  * Solicitar y validar $N$.
  * Inicializar variables: `sumaNotas = 0`, `aprobados = 0`, `reprobados = 0`, `notaMayor = 0`, `notaMenor = 10`.
  * Para $i = 1$ hasta $N$:
    * Leer y validar `nota`.
    * `sumaNotas = sumaNotas + nota`.
    * Si $i == 1$ o `nota > notaMayor` entonces `notaMayor = nota`.
    * Si $i == 1$ o `nota < notaMenor` entonces `notaMenor = nota`.
    * Si `nota >= 7.0` entonces `aprobados = aprobados + 1`, si no `reprobados = reprobados + 1`.
  * `promedio = sumaNotas / N`.

* **Salidas:**
  * Promedio general.
  * Calificación mayor.
  * Calificación menor.
  * Cantidad de aprobados.
  * Cantidad de reprobados.

---

##  Pseudocódigo

```text
Algoritmo PromedioCalificaciones
    Definir n, i, aprobados, reprobados Como Entero
    Definir nota, sumaNotas, promedio, notaMayor, notaMenor Como Real
    
    Repetir
        Escribir "Ingrese la cantidad de estudiantes:"
        Leer n
        Si n <= 0 Entonces
            Escribir "Error: La cantidad de estudiantes debe ser mayor a 0."
        FinSi
    Hasta Que n > 0
    
    sumaNotas <- 0
    aprobados <- 0
    reprobados <- 0
    
    Para i <- 1 Hasta n Con Paso 1 Hacer
        Repetir
            Escribir "Ingrese la nota del estudiante ", i, " (0 - 10):"
            Leer nota
            Si nota < 0 O nota > 10 Entonces
                Escribir "Error: La nota debe estar entre 0 y 10."
            FinSi
        Hasta Que nota >= 0 Y nota <= 10
        
        sumaNotas <- sumaNotas + nota
        
        Si i = 1 Entonces
            notaMayor <- nota
            notaMenor <- nota
        Sino
            Si nota > notaMayor Entonces
                notaMayor <- nota
            FinSi
            Si nota < notaMenor Entonces
                notaMenor <- nota
            FinSi
        FinSi
        
        Si nota >= 7.0 Entonces
            aprobados <- aprobados + 1
        Sino
            reprobados <- reprobados + 1
        FinSi
    FinPara
    
    promedio <- sumaNotas / n
    
    Escribir "--- RESULTADOS ---"
    Escribir "Promedio general: ", promedio
    Escribir "Calificación mayor: ", notaMayor
    Escribir "Calificación menor: ", notaMenor
    Escribir "Cantidad de aprobados: ", aprobados
    Escribir "Cantidad de reprobados: ", reprobados
FinAlgoritmo
```
---
## Diagrama de flujo
<img width="5156" height="9868" alt="image" src="https://github.com/user-attachments/assets/0ffd30a7-01d3-4c6a-9447-b3c685df6a49" />

---

## Prueba de escritorio

| Paso | N | i | nota | Válida | Suma | Mayor | Menor | Apr/Rep | Obs. |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| **1** | 3 | - | - | - | 0.0 | - | - | 0/0 | Inicio. N=3 |
| **2** | 3 | 1 | 8.5 | Sí | 8.5 | 8.5 | 8.5 | 1/0 | Est. 1 (Aprobado) |
| **3** | 3 | 2 | 4.0 | Sí | 12.5 | 8.5 | 4.0 | 1/1 | Est. 2 (Reprobado) |
| **4** | 3 | 3 | 9.0 | Sí | 21.5 | 9.0 | 4.0 | 2/1 | Est. 3 (Aprobado) |
| **5** | 3 | - | - | - | 21.5 | 9.0 | 4.0 | 2/1 | Promedio = 7.17 |

---

# Evidencias de ejecucion
<img width="886" height="269" alt="image" src="https://github.com/user-attachments/assets/d9862744-78ae-40bf-bde1-b36074103e33" />

---

# 2. Control de edades con centinela

##  Enunciado
Desarrollar un programa que permita el ingreso continuo de edades válidas de personas hasta que se ingrese el valor centinela `-1`. El sistema debe clasificar y contabilizar a las personas en tres grupos: menores de edad ($<18$ años), adultos ($18$ a $65$ años) y mayores de 65 años. Asimismo, debe calcular y mostrar el promedio general de las edades ingresadas. Si se ingresa una edad negativa distinta de `-1`, debe solicitarse nuevamente por ser un dato no válido.

---

##  Análisis
Para resolver este problema con control de centinela, se aplicará el siguiente análisis lógico:
* **Estructura de control:** Se utilizará un bucle `while` controlado por el valor centinela `-1`.
* **Validación de datos:** Cada edad ingresada debe validarse para asegurar que sea mayor o igual a $0$, o igual a `-1` para finalizar. Si la edad es menor a `-1`, se mostrará un mensaje de error.
* **Acumulación y Conteo:**
  * Se mantendrá un contador total de personas válidas registradas y un acumulador para la suma de las edades.
  * Menores de edad: $\text{edad} < 18$.
  * Adultos: $\text{edad} \ge 18$ y $\text{edad} \le 65$.
  * Mayores de 65 años: $\text{edad} > 65$.
* **Cálculo de promedio:** Al salir del bucle, se evaluará que el contador de personas sea mayor a $0$ para evitar una división para cero.

---

## Entradas / Procesos / Salidas

* **Entradas:**
  * `edad`: Edad de la persona ($\text{edad} \ge 0$ o $\text{edad} = -1$ para salir).

* **Procesos:**
  * Inicializar variables: `sumaEdades = 0`, `totalPersonas = 0`, `menores = 0`, `adultos = 0`, `mayores65 = 0`.
  * Leer `edad`.
  * Mientras `edad != -1` hacer:
    * Si `edad < -1`, solicitar nueva lectura por ser inválida.
    * Sino:
      * `sumaEdades = sumaEdades + edad`.
      * `totalPersonas = totalPersonas + 1`.
      * Si `edad < 18` entonces `menores = menores + 1`.
      * Sino si `edad <= 65` entonces `adultos = adultos + 1`.
      * Sino `mayores65 = mayores65 + 1`.
    * Leer siguiente `edad`.
  * Si `totalPersonas > 0` entonces `promedio = sumaEdades / totalPersonas`.

* **Salidas:**
  * Cantidad de menores de edad.
  * Cantidad de adultos.
  * Cantidad de mayores de 65 años.
  * Promedio de edades.

---

##  Pseudocódigo

```text
Algoritmo ControlEdadesCentinela
    Definir edad, sumaEdades, totalPersonas Como Entero
    Definir menores, adultos, mayores65 Como Entero
    Definir promedio Como Real
    
    sumaEdades <- 0
    totalPersonas <- 0
    menores <- 0
    adultos <- 0
    mayores65 <- 0
    
    Escribir "Ingrese una edad (-1 para terminar):"
    Leer edad
    
    Mientras edad <> -1 Hacer
        Si edad < -1 Entonces
            Escribir "Error: La edad no puede ser negativa."
        Sino
            sumaEdades <- sumaEdades + edad
            totalPersonas <- totalPersonas + 1
            
            Si edad < 18 Entonces
                menores <- menores + 1
            Sino
                Si edad <= 65 Entonces
                    adultos <- adultos + 1
                Sino
                    mayores65 <- mayores65 + 1
                FinSi
            FinSi
        FinSi
        
        Escribir "Ingrese la siguiente edad (-1 para terminar):"
        Leer edad
    FinMientras
    
    Si totalPersonas > 0 Entonces
        promedio <- sumaEdades / totalPersonas
        Escribir "--- RESULTADOS ---"
        Escribir "Cantidad de menores de edad (<18): ", menores
        Escribir "Cantidad de adultos (18-65): ", adultos
        Escribir "Cantidad de mayores de 65 años: ", mayores65
        Escribir "Promedio de edades: ", promedio
    Sino
        Escribir "No se ingresaron datos para procesar."
    FinSi
FinAlgoritmo
```

---

## Diagrama de flujo
<img width="7252" height="5992" alt="image" src="https://github.com/user-attachments/assets/e4fd96e4-4c6c-4e5d-9e94-8bf1e66dee72" />

---

## Prueba de escritorio
| Paso | edad | edad != -1 | Suma | Total | Menor | Adulto | May65 | Prom. | Obs. |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| **1** | 15 | Sí | 15 | 1 | 1 | 0 | 0 | - | Lectura 1 (Menor) |
| **2** | 30 | Sí | 45 | 2 | 1 | 1 | 0 | - | Lectura 2 (Adulto) |
| **3** | 70 | Sí | 115 | 3 | 1 | 1 | 1 | - | Lectura 3 (Mayor 65) |
| **4** | -1 | No | 115 | 3 | 1 | 1 | 1 | 38.33 | Fin centinela. Prom=115/3 |

---

## Evidencias de ejecucion
<img width="886" height="378" alt="image" src="https://github.com/user-attachments/assets/c1eb9d29-fccf-466d-83ed-a0008b60e641" />


