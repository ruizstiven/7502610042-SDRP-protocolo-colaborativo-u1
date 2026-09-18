package Ejercicio1;

public class MainProducto {
    public static void main(String[] args) {
        // Creamos un nuevo producto usando el constructor con parámetros
        Producto miProducto = new Producto("Computadora Portátil", 850.99);

        // Llamamos al método para ver los detalles en la consola
        System.out.println("Ejercicio 1");
        miProducto.mostrarProducto();
    }
}
