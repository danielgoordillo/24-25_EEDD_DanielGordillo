package com.gordillo.daniel.analizadorDatos;

import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            AnalizadorNumerico analizadorNumerico = new AnalizadorNumerico();
            AnalizadorTexto analizadorTexto = new AnalizadorTexto();

            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1 - Análisis Numérico");
                System.out.println("2 - Análisis de Texto");
                System.out.println("3 - Salir");
                System.out.print("Opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1) {
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\n🔢 Análisis del número: " + numero);
                    System.out.println("¿Es par? " + (analizadorNumerico.esPar(numero) ? "✅ Sí" : "❌ No"));
                    System.out.println("¿Es impar? " + (analizadorNumerico.esImpar(numero) ? "✅ Sí" : "❌ No"));
                    System.out.println("¿Es primo? " + (analizadorNumerico.esPrimo(numero) ? "✅ Sí" : "❌ No"));
                    System.out.println("Factorial: " + analizadorNumerico.factorial(numero));
                    System.out.println("Divisores: " + analizadorNumerico.devolverDivisores(numero));
                    System.out.println("¿Es perfecto? " + (analizadorNumerico.esPerfecto(numero) ? "✅ Sí" : "❌ No"));
                } else if (opcion == 2) {
                    System.out.print("Ingrese una cadena de texto: ");
                    String texto = scanner.nextLine();

                    System.out.println("\n📝 Análisis del texto: \"" + texto + "\"");
                    System.out.println("¿Es palíndromo? " + (analizadorTexto.esPalindromo(texto) ? "✅ Sí" : "❌ No"));
                    System.out.println("Número de vocales: " + analizadorTexto.contarVocales(texto));
                    System.out.println("Número de consonantes: " + analizadorTexto.contarConsonantes(texto));
                    System.out.println("Número de palabras: " + analizadorTexto.contarPalabras(texto));
                    System.out.println("Número de caracteres (sin espacios): " + analizadorTexto.contarCaracteres(texto));
                } else if (opcion == 3) {
                    System.out.println("\n👋 ¡Gracias por usar el Analizador de Datos! Hasta pronto.");
                    break;
                } else {
                    System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                }
            }
            scanner.close();
        }
    }

