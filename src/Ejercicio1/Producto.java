package Ejercicio1;

public class Producto {
    // 1. Atributos de la clase
    private String nombre;
    private double precio;

    // 2. Constructor que usa 'this' para evitar confusiones
    public Producto(String nombre, double precio) {
        this.nombre = nombre; // 'this.nombre' es el atributo, 'nombre' es el parámetro
        this.precio = precio; // 'this.precio' es el atributo, 'precio' es el parámetro
    }

    // 3. Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Ejercicio1.Producto: " + this.nombre + " | Precio: $" + this.precio);
    }
}
