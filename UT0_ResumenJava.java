/**
 * ! Resumen Completo de Java
 * ? Este archivo contiene una introducción completa a Java con teoría y ejemplos ejecutables.
 * * Incluye estructuras de control, POO, manejo de excepciones, colecciones y más.
 * * Usa los comentarios destacados para seguir el material.
 *
 * ! IMPORTANTE: Asegúrate de tener estas extensiones en VS Code:
 * - Java Extension Pack
 * - Better Comments
 *
 * Autor: Joaquín
 * Fecha: 25/01/2025
 */

// * Importación de clases necesarias
import java.util.*;

public class UT0_ResumenJava {

    public static void main(String[] args) {
        // Llamadas a métodos para ejecutar los ejemplos
        introduccionJava();
        estructurasDeControl();
        programacionOrientadaAObjetos();
        manejoExcepciones();
        coleccionesJava();
    }

    /**
     * ! Introducción a Java
     * ? Conceptos básicos sobre el lenguaje Java
     */
    public static void introduccionJava() {
        System.out.println("\n--- Introducción a Java ---");
        System.out.println("1. Java es un lenguaje multiplataforma y orientado a objetos.");
        System.out.println("2. Se compila en bytecode y se ejecuta en la JVM (Java Virtual Machine).");
        System.out.println("3. Usa clases y objetos para la programación modular.");
        System.out.println("4. Es fuertemente tipado y seguro.");
    }

    /**
     * ! Estructuras de Control en Java
     * ? Uso de if-else, switch y bucles.
     */
    public static void estructurasDeControl() {
        System.out.println("\n--- Estructuras de Control ---");

        // * Estructura condicional if-else
        int numero = 50;
        if (numero > 0) {
            System.out.println("Número positivo.");
        } else if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número es cero.");
        }

        // * Switch-case
        int dia = 27;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            default -> System.out.println("Día no válido");
        }

        // * Bucle for
        System.out.println("\nConteo del 1 al 5 con for:"); 
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // * Bucle while
        System.out.println("\nBucle while contando hasta 3:");
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    /**
     * ! Programación Orientada a Objetos en Java
     * ? Clases, objetos, herencia, encapsulamiento y polimorfismo.
     */
    public static void programacionOrientadaAObjetos() {
        System.out.println("\n--- Programación Orientada a Objetos ---");

        // * Creación de objetos y uso de getters y setters
        Persona persona1 = new Persona("Juan", 30);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
    }

    /**
     * ! Manejo de Excepciones en Java
     * ? Uso de try-catch-finally para evitar errores en tiempo de ejecución.
     */
    public static void manejoExcepciones() {
        System.out.println("\n--- Manejo de Excepciones ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Bloque finally ejecutado siempre.");
        }
    }

    /**
     * ! Colecciones en Java
     * ? List, Set y Map con ejemplos prácticos.
     */
    public static void coleccionesJava() {
        System.out.println("\n--- Colecciones en Java ---");
        
        // * Uso de ArrayList
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        System.out.println("ArrayList: " + lista);
        
        // * Uso de HashSet
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        System.out.println("HashSet: " + conjunto);
        
        // * Uso de HashMap
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        System.out.println("HashMap: " + mapa);
    }
}

// * Clase Persona con métodos get y set
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

/**
 * ! Prácticas recomendadas para el alumno:
 * 1. Modifica la clase Persona para agregar más atributos.
 * 2. Crea una clase Estudiante que herede de Persona y añádele una nota.
 * 3. Implementa una excepción personalizada para controlar valores negativos en la edad.
 * 4. Crea una lista de estudiantes y muestra la información de cada uno.
 */
