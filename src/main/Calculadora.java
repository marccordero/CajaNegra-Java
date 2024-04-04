package main;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operador;
        
        System.out.println("Bienvenido a la Calculadora");
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);
        
        double resultado = Operaciones.realizarOperacion(num1, num2, operador);
        System.out.println("El resultado es: " + resultado);
        
        scanner.close();
    }
}
