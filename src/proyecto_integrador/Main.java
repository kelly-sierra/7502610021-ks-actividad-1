package proyecto_integrador;

import ejercicio1_libro.Libro;
import ejercicio2_CuentaBancaria.CuentaBancaria;
import ejercicio3_Estudiante.Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("       PROYECTO INTEGRADOR");
        System.out.println("----------------------------------");

        // Crear un objeto Libro
        System.out.println("\n--- LIBRO ---");

        System.out.print("Ingrese el título: ");
        String titulo = entrada.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = entrada.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = entrada.nextInt();
        entrada.nextLine();

        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Crear un objeto CuentaBancaria
        System.out.println("\n--- CUENTA BANCARIA ---");

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = entrada.nextLine();

        System.out.print("Ingrese el saldo: ");
        double saldo = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = entrada.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(
                numeroCuenta,
                saldo,
                tipoCuenta
        );

        // Crear un objeto Estudiante
        System.out.println("\n--- ESTUDIANTE ---");

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el curso: ");
        String curso = entrada.nextLine();

        Estudiante estudiante = new Estudiante(
                nombre,
                edad,
                curso
        );

        // Mostrar información
        System.out.println("\n---------------------------------");
        System.out.println("       INFORMACIÓN REGISTRADA");
        System.out.println("-----------------------------------");

        System.out.println("\nLibro:");
        System.out.println(libro);

        System.out.println("\nCuenta bancaria:");
        System.out.println(cuenta);

        System.out.println("\nEstudiante:");
        System.out.println(estudiante);

        entrada.close();
    }
}
