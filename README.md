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

##  Análisis
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

---

# 3. Calculadora con menú repetitivo

##  Enunciado
Construir un programa que muestre un menú con las opciones: 1) Sumar, 2) Restar, 3) Multiplicar, 4) Dividir y 5) Salir. El menú debe repetirse hasta que el usuario seleccione la opción Salir. En la división se debe controlar que el divisor no sea cero para evitar un error.

---

##  Análisis
Para resolver el problema planteado, se requiere un menú que se repita y que ejecute una operación según la opción elegida:
* **Estructura repetitiva:** Se utilizará un bucle `Repetir ... Hasta Que` para mostrar el menú al menos una vez y repetirlo hasta que la opción sea `5`.
* **Selección de operación:** Se utilizará una estructura `Segun` para ejecutar la operación que corresponda a cada opción.
* **Lectura de datos:** Para las opciones 1 a 4 se solicitan dos números reales, `a` y `b`.
* **Control de división:** Antes de dividir se comprueba que `b` sea distinto de `0`. Si `b = 0`, se muestra un mensaje de error y no se realiza la operación.
* **Validación del menú:** Si la opción no está entre 1 y 5, se muestra un mensaje de opción inválida y el menú se vuelve a mostrar.

---

##  Entradas / Procesos / Salidas

* **Entradas:**
  * `opcion`: Opción elegida del menú (1 a 5).
  * `a`, `b`: Los dos números con los que se opera.

* **Procesos:**
  * Mostrar el menú.
  * Leer `opcion`.
  * Si `opcion` es 1 a 4, leer `a` y `b`.
  * Según la opción:
    * `1`: `resultado = a + b`.
    * `2`: `resultado = a - b`.
    * `3`: `resultado = a * b`.
    * `4`: si `b <> 0` entonces `resultado = a / b`, si no mostrar error.
    * `5`: finalizar el programa.
    * Otro valor: mostrar "Opción inválida".
  * Repetir hasta que `opcion = 5`.

* **Salidas:**
  * El menú de opciones.
  * El resultado de la operación.
  * Mensaje de error por división entre cero.
  * Mensaje de opción inválida.
  * Mensaje de despedida al salir.

---

##  Pseudocódigo

```text
Algoritmo CalculadoraMenu
    Definir opcion Como Entero
    Definir a, b, resultado Como Real

    Repetir
        Escribir "===== CALCULADORA ====="
        Escribir "1) Sumar"
        Escribir "2) Restar"
        Escribir "3) Multiplicar"
        Escribir "4) Dividir"
        Escribir "5) Salir"
        Escribir "Elija una opción:"
        Leer opcion

        Si opcion >= 1 Y opcion <= 4 Entonces
            Escribir "Ingrese el primer número:"
            Leer a
            Escribir "Ingrese el segundo número:"
            Leer b
        FinSi

        Segun opcion Hacer
            1:
                resultado <- a + b
                Escribir "Resultado: ", resultado
            2:
                resultado <- a - b
                Escribir "Resultado: ", resultado
            3:
                resultado <- a * b
                Escribir "Resultado: ", resultado
            4:
                Si b <> 0 Entonces
                    resultado <- a / b
                    Escribir "Resultado: ", resultado
                Sino
                    Escribir "Error: no se puede dividir entre cero."
                FinSi
            5:
                Escribir "Programa finalizado."
            De Otro Modo:
                Escribir "Opción inválida. Intente de nuevo."
        FinSegun
    Hasta Que opcion = 5
FinAlgoritmo
```

---

## Diagrama de flujo
<img width="1701" height="1788" alt="image" src="https://github.com/user-attachments/assets/40ede740-e325-4c04-ad74-51219eb3d3f0" />


---

## Prueba de escritorio

| Paso | opcion | a | b | resultado | Observación |
| :---: | :---: | :---: | :---: | :---: | :--- |
| **1** | 1 | 8 | 2 | 10 | Suma correcta |
| **2** | 2 | 9 | 4 | 5 | Resta correcta |
| **3** | 3 | 3 | 6 | 18 | Multiplicación correcta |
| **4** | 4 | 10 | 4 | 2.5 | División correcta |
| **5** | 4 | 10 | 0 | - | Error: división entre cero |
| **6** | 7 | - | - | - | Opción inválida, se repite el menú |
| **7** | 5 | - | - | - | Salir, termina el programa |

---

# Evidencias de ejecución
<img width="1359" height="841" alt="image" src="https://github.com/user-attachments/assets/33da25ad-d009-4351-bdc6-1a07c655eb66" />

---

# 4. Tabla de multiplicar validada

##  Enunciado
Desarrollar un programa que solicite un número entre 1 y 12. Si el dato ingresado es incorrecto, el programa debe volver a solicitarlo. Una vez validado el número, se debe generar su tabla de multiplicar desde 1 hasta 12.

---

##  Análisis
Para resolver el problema planteado, se requiere validar el dato de entrada y luego generar la tabla mediante una repetición:
* **Validación previa:** Se leerá el número `n` y se utilizará un bucle `Mientras` que lo vuelva a solicitar mientras no esté dentro del intervalo `[1, 12]`.
* **Mensaje de error:** Si el número no es válido, se mostrará un mensaje indicando que debe ingresar un valor entre 1 y 12.
* **Ciclo controlado:** Una vez validado `n`, se utilizará un bucle `Para` con el multiplicador `i` desde 1 hasta 12.
* **Cálculo:** En cada repetición se calcula `resultado = n * i` y se muestra la operación completa.

---

##  Entradas / Procesos / Salidas

* **Entradas:**
  * `n`: Número al que se le generará la tabla (`1 <= n <= 12`).

* **Procesos:**
  * Solicitar `n`.
  * Mientras `n < 1` o `n > 12`, mostrar error y volver a solicitarlo.
  * Para `i = 1` hasta `12`:
    * `resultado = n * i`.
    * Mostrar `n x i = resultado`.

* **Salidas:**
  * Mensaje de error si el número no es válido.
  * Las 12 líneas de la tabla de multiplicar de `n`.

---

##  Pseudocódigo

```text
Algoritmo TablaMultiplicarValidada
    Definir n, i, resultado Como Entero

    Escribir "Ingrese un número entre 1 y 12:"
    Leer n

    Mientras n < 1 O n > 12 Hacer
        Escribir "Dato incorrecto. Debe estar entre 1 y 12."
        Escribir "Ingrese un número entre 1 y 12:"
        Leer n
    FinMientras

    Escribir "--- TABLA DEL ", n, " ---"
    Para i <- 1 Hasta 12 Con Paso 1 Hacer
        resultado <- n * i
        Escribir n, " x ", i, " = ", resultado
    FinPara
FinAlgoritmo
```

---

## Diagrama de flujo
<img width="542" height="1159" alt="image" src="https://github.com/user-attachments/assets/77fbdd3c-f2d6-4e48-b4e7-ed50ac92ea37" />


---

## Prueba de escritorio

| Paso | n | Válido | i | resultado | Observación |
| :---: | :---: | :---: | :---: | :---: | :--- |
| **1** | 15 | No | - | - | Error, se vuelve a pedir |
| **2** | 0 | No | - | - | Error, se vuelve a pedir |
| **3** | 7 | Sí | - | - | Número válido, inicia la tabla |
| **4** | 7 | Sí | 1 | 7 | 7 x 1 = 7 |
| **5** | 7 | Sí | 2 | 14 | 7 x 2 = 14 |
| **6** | 7 | Sí | 3 | 21 | 7 x 3 = 21 |
| **...** | 7 | Sí | ... | ... | Continúa hasta i = 12 |
| **7** | 7 | Sí | 12 | 84 | 7 x 12 = 84, fin del bucle |

---

# Evidencias de ejecución
<img width="1359" height="805" alt="image" src="https://github.com/user-attachments/assets/c9974c62-0ddf-42e4-8e15-911f5dff93dc" />


---

# EJERCICIO 5: CAJERO UNIVERSITARIO

##  Problema

Realizar un programa que simule el funcionamiento de un cajero universitario. El programa debe permitir consultar el saldo, realizar depósitos, realizar retiros, consultar el número de transacciones realizadas y salir del sistema.

---

##  Análisis

El programa comienza solicitando al usuario el saldo inicial de su cuenta.

Después presenta un menú con las siguientes opciones:

1. Consultar saldo.
2. Depositar dinero.
3. Retirar dinero.
4. Consultar número de transacciones.
5. Salir.

Cada depósito o retiro válido aumenta el contador de transacciones.

Para realizar un retiro, el valor debe ser positivo y no puede superar el saldo disponible.

El programa continúa funcionando hasta que el usuario seleccione la opción 5.

---

##  Entradas

- Saldo inicial.
- Opción del menú.
- Valor del depósito.
- Valor del retiro.

---

##  Procesos

- Inicializar el saldo.
- Inicializar el número de transacciones en cero.
- Mostrar el menú.
- Consultar el saldo.
- Sumar depósitos al saldo.
- Restar retiros al saldo.
- Validar los retiros.
- Incrementar el número de transacciones.
- Repetir el menú hasta seleccionar salir.

---

##  Salidas

- Saldo disponible.
- Confirmación del depósito.
- Confirmación del retiro.
- Mensaje de retiro inválido.
- Número de transacciones.
- Mensaje de salida.

---

##  Algoritmo

1. Inicio.
2. Solicitar el saldo inicial.
3. Inicializar el contador de transacciones en cero.
4. Mostrar el menú.
5. Leer la opción seleccionada.
6. Si la opción es 1, mostrar el saldo.
7. Si la opción es 2, solicitar el depósito.
8. Validar que el depósito sea positivo.
9. Sumar el depósito al saldo y aumentar las transacciones.
10. Si la opción es 3, solicitar el retiro.
11. Validar que el retiro sea positivo y no supere el saldo.
12. Restar el retiro del saldo y aumentar las transacciones.
13. Si la opción es 4, mostrar el número de transacciones.
14. Si la opción es 5, finalizar el programa.
15. Si se selecciona otra opción, mostrar un mensaje de error.
16. Repetir desde el paso 4 hasta seleccionar la opción 5.
17. Fin.

---

##  Pseudocódigo

```text
Proceso CajeroUniversitario

    Definir saldo, deposito, retiro Como Real
    Definir opcion, transacciones Como Entero

    Escribir "Ingrese el saldo inicial:"
    Leer saldo

    transacciones <- 0

    Repetir

        Escribir "===== CAJERO UNIVERSITARIO ====="
        Escribir "1. Consultar saldo"
        Escribir "2. Depositar"
        Escribir "3. Retirar"
        Escribir "4. Numero de transacciones"
        Escribir "5. Salir"
        Escribir "Seleccione una opcion:"
        Leer opcion

        Segun opcion Hacer

            1:
                Escribir "Saldo disponible: $", saldo

            2:
                Escribir "Ingrese el valor a depositar:"
                Leer deposito

                Si deposito > 0 Entonces
                    saldo <- saldo + deposito
                    transacciones <- transacciones + 1
                    Escribir "Deposito realizado correctamente."
                SiNo
                    Escribir "El valor debe ser positivo."
                FinSi

            3:
                Escribir "Ingrese el valor a retirar:"
                Leer retiro

                Si retiro > 0 Y retiro <= saldo Entonces
                    saldo <- saldo - retiro
                    transacciones <- transacciones + 1
                    Escribir "Retiro realizado correctamente."
                SiNo
                    Escribir "Retiro no valido."
                FinSi

            4:
                Escribir "Numero de transacciones: ", transacciones

            5:
                Escribir "Gracias por utilizar el cajero."

            De Otro Modo:
                Escribir "Opcion no valida."

        FinSegun

    Hasta Que opcion = 5

FinProceso
```

---

##  Diagrama de flujo

<img width="1600" height="1065" alt="WhatsApp Image 2026-09-28 at 9 16 34 PM" src="https://github.com/user-attachments/assets/11813a70-f0df-4a0b-8a67-a705a4eb39c4" />


---


##  Prueba de escritorio

### Datos

- Saldo inicial: $500
- Depósito: $200
- Retiro: $150

| Paso | Opción | Operación | Saldo | Transacciones |
|---|---:|---|---:|---:|
| 1 | - | Saldo inicial | $500 | 0 |
| 2 | 1 | Consultar saldo | $500 | 0 |
| 3 | 2 | Depositar $200 | $700 | 1 |
| 4 | 3 | Retirar $150 | $550 | 2 |
| 5 | 4 | Consultar transacciones | $550 | 2 |
| 6 | 5 | Salir | $550 | 2 |

### Resultado

<img width="902" height="521" alt="image" src="https://github.com/user-attachments/assets/9ff96d87-8b0c-4f35-a7cb-534e63610292" />


# EJERCICIO 6: ESTADÍSTICAS DE UN CURSO

##  Problema

Realizar un programa que permita ingresar las calificaciones de un grupo de estudiantes y obtener estadísticas del curso.

El programa debe calcular el promedio general, la nota mayor, la nota menor, la cantidad de estudiantes aprobados y reprobados y los porcentajes correspondientes.

Una nota mayor o igual a 7 se considera aprobada.

---

##  Análisis

Primero se solicita la cantidad de estudiantes.

Después se ingresa la nota de cada estudiante. Las notas deben estar entre 0 y 10.

Por cada nota válida se acumula la suma, se determina la nota mayor y menor y se cuenta si el estudiante aprobó o reprobó.

Finalmente se calcula el promedio y los porcentajes de aprobación y reprobación.

---

##  Entradas

- Número de estudiantes.
- Nota de cada estudiante.

---

##  Procesos

- Validar las notas.
- Sumar todas las notas.
- Determinar la nota mayor.
- Determinar la nota menor.
- Contar aprobados.
- Contar reprobados.
- Calcular el promedio.
- Calcular porcentaje de aprobados.
- Calcular porcentaje de reprobados.

---

##  Salidas

- Promedio general.
- Nota mayor.
- Nota menor.
- Cantidad de aprobados.
- Cantidad de reprobados.
- Porcentaje de aprobados.
- Porcentaje de reprobados.

---

##  Algoritmo

1. Inicio.
2. Solicitar el número de estudiantes.
3. Inicializar suma, aprobados y reprobados.
4. Inicializar nota mayor en 0.
5. Inicializar nota menor en 10.
6. Repetir para cada estudiante.
7. Solicitar la nota.
8. Validar que la nota esté entre 0 y 10.
9. Acumular la nota.
10. Determinar la nota mayor y menor.
11. Si la nota es mayor o igual a 7, contar como aprobado.
12. En caso contrario, contar como reprobado.
13. Calcular el promedio.
14. Calcular los porcentajes.
15. Mostrar los resultados.
16. Fin.

---

##  Pseudocódigo

```text
Proceso EstadisticasCurso

    Definir N, i, aprobados, reprobados Como Entero
    Definir nota, suma, mayor, menor Como Real
    Definir promedio Como Real
    Definir porcentajeAprobados Como Real
    Definir porcentajeReprobados Como Real

    Escribir "Ingrese el numero de estudiantes:"
    Leer N

    suma <- 0
    aprobados <- 0
    reprobados <- 0
    mayor <- 0
    menor <- 10

    Para i <- 1 Hasta N Hacer

        Repetir

            Escribir "Ingrese la nota del estudiante ", i
            Escribir "(0 a 10):"
            Leer nota

            Si nota < 0 O nota > 10 Entonces
                Escribir "Nota invalida."
                Escribir "Debe estar entre 0 y 10."
            FinSi

        Hasta Que nota >= 0 Y nota <= 10

        suma <- suma + nota

        Si nota > mayor Entonces
            mayor <- nota
        FinSi

        Si nota < menor Entonces
            menor <- nota
        FinSi

        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi

    FinPara

    promedio <- suma / N

    porcentajeAprobados <- aprobados * 100 / N

    porcentajeReprobados <- reprobados * 100 / N

    Escribir "===== ESTADISTICAS DEL CURSO ====="

    Escribir "Promedio general: ", promedio

    Escribir "Nota mayor: ", mayor

    Escribir "Nota menor: ", menor

    Escribir "Cantidad de aprobados: ", aprobados

    Escribir "Cantidad de reprobados: ", reprobados

    Escribir "Porcentaje de aprobados: ",
             porcentajeAprobados, "%"

    Escribir "Porcentaje de reprobados: ",
             porcentajeReprobados, "%"

FinProceso
```

---

##  Diagrama de flujo

<img width="778" height="1600" alt="WhatsApp Image 2026-09-28 at 9 23 05 PM" src="https://github.com/user-attachments/assets/9077aff7-472e-40b6-9174-9a327739b05f" />


---


##  Prueba de escritorio

### Datos

Número de estudiantes: **5**

Notas:

```text
8
6
10
5
7
```

| Estudiante | Nota | Suma | Mayor | Menor | Aprobados | Reprobados |
|---:|---:|---:|---:|---:|---:|---:|
| 1 | 8 | 8 | 8 | 8 | 1 | 0 |
| 2 | 6 | 14 | 8 | 6 | 1 | 1 |
| 3 | 10 | 24 | 10 | 6 | 2 | 1 |
| 4 | 5 | 29 | 10 | 5 | 2 | 2 |
| 5 | 7 | 36 | 10 | 5 | 3 | 2 |

### Resultado

<img width="2499" height="1272" alt="image" src="https://github.com/user-attachments/assets/97c414b1-435f-437d-9b75-22054a50f0fd" />


---

# EJERCICIO 7: VENTA DE ENTRADAS CINECAMPUS

##  Problema

Realizar un programa para controlar la venta de entradas de un cine universitario denominado CineCampus.

El programa debe permitir ingresar el tipo de entrada, la cantidad y el precio de cada entrada.

Debe calcular el subtotal de cada venta y acumular el total de entradas vendidas y el total de dinero recaudado.

El programa debe permitir realizar varias ventas.

---

##  Análisis

El programa comienza inicializando el total de ventas y el total de entradas en cero.

En cada venta se solicita:

- Tipo de entrada.
- Cantidad.
- Precio unitario.

El subtotal se obtiene multiplicando la cantidad por el precio.

Después se acumula el subtotal al total general y la cantidad de entradas al total de entradas vendidas.

Finalmente se pregunta al usuario si desea realizar otra venta.

El proceso continúa hasta que el usuario responda N.

---

##  Entradas

- Tipo de entrada.
- Cantidad de entradas.
- Precio de cada entrada.
- Opción para continuar.

---

##  Procesos

- Leer tipo de entrada.
- Leer cantidad.
- Leer precio.
- Calcular subtotal.
- Acumular ventas.
- Acumular cantidad de entradas.
- Preguntar si desea realizar otra venta.

---

##  Salidas

- Tipo de entrada.
- Subtotal.
- Total acumulado.
- Total de entradas vendidas.
- Total de ventas.

---

##  Algoritmo

1. Inicio.
2. Inicializar total de ventas en cero.
3. Inicializar total de entradas en cero.
4. Solicitar el tipo de entrada.
5. Solicitar la cantidad.
6. Solicitar el precio.
7. Calcular el subtotal.
8. Acumular el subtotal al total.
9. Acumular la cantidad de entradas.
10. Mostrar el subtotal.
11. Mostrar el total acumulado.
12. Preguntar si desea realizar otra venta.
13. Si responde S, repetir el proceso.
14. Si responde N, mostrar el resumen final.
15. Fin.

---

##  Pseudocódigo

```text
Proceso VentaCineCampus

    Definir tipo, continuar Como Caracter
    Definir cantidad, totalEntradas Como Entero
    Definir precio, subtotal, total Como Real

    total <- 0
    totalEntradas <- 0

    Repetir

        Escribir "===== CINECAMPUS ====="

        Escribir "Ingrese el tipo de entrada:"
        Leer tipo

        Escribir "Ingrese la cantidad de entradas:"
        Leer cantidad

        Escribir "Ingrese el precio de cada entrada:"
        Leer precio

        subtotal <- cantidad * precio

        total <- total + subtotal

        totalEntradas <- totalEntradas + cantidad

        Escribir "Tipo de entrada: ", tipo

        Escribir "Subtotal: $", subtotal

        Escribir "Total acumulado: $", total

        Escribir "Desea realizar otra venta? (S/N):"
        Leer continuar

    Hasta Que continuar = "N" O continuar = "n"

    Escribir "===== RESUMEN FINAL ====="

    Escribir "Total de entradas vendidas: ",
             totalEntradas

    Escribir "Total de ventas: $", total

FinProceso
```

---

##  Diagrama de flujo

<img width="452" height="1600" alt="WhatsApp Image 2026-09-28 at 9 24 44 PM" src="https://github.com/user-attachments/assets/d9cb7a38-7d88-4001-bd7b-0f9d3aebd9ba" />


---

##  Prueba de escritorio

### Datos

Primera venta:

```text
Tipo: General
Cantidad: 3
Precio: $5
```

Segunda venta:

```text
Tipo: Estudiante
Cantidad: 2
Precio: $3
```

| Venta | Tipo | Cantidad | Precio | Subtotal | Total acumulado |
|---:|---|---:|---:|---:|---:|
| 1 | General | 3 | $5 | $15 | $15 |
| 2 | Estudiante | 2 | $3 | $6 | $21 |

### Resultado

<img width="1043" height="445" alt="image" src="https://github.com/user-attachments/assets/d596aa60-1dcf-4c93-b621-31dc3dfdb87b" />

