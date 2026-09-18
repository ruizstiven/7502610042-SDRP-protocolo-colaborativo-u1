package Ejercicio2;

public class MainEstudiante {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        //  Probamos el constructor por defecto (usa el atajo this())
        Estudiante estudianteNuevo = new Estudiante();
        System.out.print("Constructor por defecto -> ");
        estudianteNuevo.imprimirDetalles();

        //  Probamos el constructor normal con datos específicos
        Estudiante estudianteAsignado = new Estudiante("Carlos Ortega", 20);
        System.out.print("Constructor con parámetros -> ");
        estudianteAsignado.imprimirDetalles();
    }
}
//