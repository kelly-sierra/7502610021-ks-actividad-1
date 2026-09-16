package ejercicio2_CuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n DATOS DE LA CUENTA ");

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

        System.out.println("\n INFORMACIÓN DE LA CUENTA ");
        System.out.println(cuenta.toString());

        entrada.close();
    }
}