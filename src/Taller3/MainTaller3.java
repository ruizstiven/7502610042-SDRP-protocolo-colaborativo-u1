package Taller3;

public class MainTaller3 {
    public static void main(String[] args) {

        System.out.println("PRUEBA EJERCICIO 1");
        Coche.mostrarContadorCoches(); // Imprime 0
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Mazda", "3");
        Coche.mostrarContadorCoches(); // Imprime 2

        System.out.println("\nPRUEBA EJERCICIO 2");
        // Usamos los métodos matemáticos directamente desde la clase
        double suma = Matematicas.sumar(15.5, 4.5);
        double division = Matematicas.dividir(10, 0);
        System.out.println("Resultado suma: " + suma); // Imprime 20.0

        System.out.println("\nPRUEBA EJERCICIO 3");
        Producto miProducto = new Producto();
        System.out.println("Precio inicial: " + miProducto.getPrecio());
        miProducto.modificarPrecio(120.50); // Requiere el objeto para funcionar
        System.out.println("Precio modificado: " + miProducto.getPrecio());
    }
}
