/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // Declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        double promedio;
        int anioNacimiento;
        String nombreEstudiante;
        String ciudaddenacimiento;
        int edad;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();
        
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        
        System.out.println("Ingrese nombre de asignatura 2");
        entrada.nextLine(); // limpieza de buffer
        nombreAsignatura2 = entrada.nextLine();
        
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = entrada.nextDouble();
        entrada.nextLine(); // limpieza de buffer
        
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();
        
        // Se necesita ingresar la ciudad de nacimiento
        System.out.println("Ingrese ciudad de nacimiento");
        ciudaddenacimiento = entrada.nextLine();
        
        // Se necesita ingresar el año de nacimiento
        System.out.println("Ingrese año de nacimiento");
        anioNacimiento = entrada.nextInt();
        
        // Cálculo de la edad
        edad = 2026 - anioNacimiento;
        
        promedio = (notaAsignatura1 + notaAsignatura2) / 2;
        
        // Impresión final incluyendo la edad (%d para enteros)
        System.out.printf("Asignatura 1: %s\nNota 1: %.2f\nAsignatura 2: %s\n"
                + "Nota 2: %.2f\nNombre de estudiante: %s\nAño de nacimiento: %d\nCiudad de nacimiento: %s\nEdad: %d\nPromedio: %.2f\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante,
                anioNacimiento,
                ciudaddenacimiento,
                edad,
                promedio);
    }
    
}
