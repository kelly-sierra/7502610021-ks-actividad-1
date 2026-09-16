package ejercicio1_libro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" DATOS DEL LIBRO ");

        System.out.print("Ingrese el título: ");
        String titulo = entrada.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = entrada.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        int numeroPaginas = entrada.nextInt();

        entrada.nextLine();

        Libro libro = new Libro(titulo, autor, numeroPaginas);

        System.out.println("\nDatos del libro:");
        System.out.println(libro);
    }
}