/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_progra2;

/**
 *
 * @author Administrator
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar Item");
            System.out.println("2. Consultar Item");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            if (opcion == 1) {
                    System.out.print("Ingrese tipo si Movie o Juego");
                    String tipo = scanner.nextLine().toUpperCase();
                    System.out.print("Ingrese código del Item: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre del Item: ");
                    String nombre = scanner.nextLine();
            } else if (opcion == 2) {
                System.out.print("Consultar Item");
                
            } else if (opcion == 3) {
                System.out.print("Ingrese tipo si Movie o Juego");
            
            }
        }
    }
}
