package Ejercicio2;

public class Estudiante {
    // 1. Atributos de la clase
    private String nombre;
    private int edad;

    // 2. Constructor por defecto (sin parámetros) que llama al otro constructor
    public Estudiante() {
        this("Sin nombre", 0); // Llama al constructor de abajo usando valores iniciales
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. Método para imprimir los detalles
    public void imprimirDetalles() {
        System.out.println("Estudiante: " + this.nombre + " | Edad: " + this.edad + " años");
    }
}
