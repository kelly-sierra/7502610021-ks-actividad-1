package ejercicio3_Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n DATOS DEL ESTUDIANTE ");

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

        System.out.println("\n INFORMACIÓN DEL ESTUDIANTE ");
        System.out.println(estudiante.toString());

        entrada.close();
    }
}