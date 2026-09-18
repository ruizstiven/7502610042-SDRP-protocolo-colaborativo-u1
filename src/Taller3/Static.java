package Taller3;

// 1. Definición de la clase Coche
class Coche {
    // Atributos de instancia (propios de cada coche)
    private String marca;
    private String modelo;

    // Atributo estático (compartido por todos los coches)
    private static int contadorCoches = 0;

    // 2. Constructor que incrementa el contador global
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        Coche.contadorCoches++; // Incrementa cada vez que nace un objeto
    }

    // 3. Método estático para mostrar el total de coches creados
    public static void mostrarContadorCoches() {
        System.out.println("Total de coches creados hasta ahora: " + contadorCoches);
    }
}

// 1. Clase con métodos estáticos para operaciones básicas
 class Matematicas {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
}

 class Producto {
    private static double precio = 100.0; // Atributo NO estático (de instancia)

    // Intento incorrecto de usar static
    public static void modificarPrecio(double nuevoPrecio) {
        // ERROR DE COMPILACIÓN: non-static variable precio cannot be referenced from a static context
        precio = nuevoPrecio;
    }

     public static double getPrecio() {
         return precio;
     }
 }

