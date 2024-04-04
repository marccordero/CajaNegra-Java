package main;

public class Operaciones {
    public static double realizarOperacion(double num1, double num2, char operador) {
        switch(operador) {
            case '+':
                return suma(num1, num2);
            case '-':
                return resta(num1, num2);
            case '*':
                return multiplicacion(num1, num2);
            case '/':
                return division(num1, num2);
            default:
                System.out.println("Operador no válido.");
                return 0;
        }
    }
    
    private static double suma(double num1, double num2) {
        return num1 + num2;
    }
    
    private static double resta(double num1, double num2) {
        return num1 - num2;
    }
    
    private static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    private static double division(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
        return num1 / num2;
    }
}
