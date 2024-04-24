/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Villa
 */
/**
 * @param args the command line arguments
 */

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main1 {

        private static ArrayList<String> libros = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int cantidadLibros = 0;

            // Pedir al usuario el número de libros a registrar
            System.out.println("Ingrese el numero de libros a registrar: ");
            cantidadLibros = scan.nextInt();
            scan.nextLine(); 
            
            // Ingresar los títulos de los libros
            ingresarLibros(cantidadLibros);

            // Ordenar los libros alfabéticamente
            ordenarLibros();

            // Mostrar los libros ordenados alfabéticamente
            mostrarLibros();
            
            int option = 0;
        do {
            System.out.println("1. ordenar por seleccion");
            System.out.println("2. ordenar por insercion");
            System.out.println("3. ordenar Burbuja");
            System.out.println("4. salir");
            System.out.println("ingrese la opcion");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    //ordenarPorSeleccion();
                    mostrarLibros();
                    break;
                case 2:
                    //ordenarPorInsercion();
                    mostrarLibros();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opción no valida");
                    break;

            }
        } while (option != 4);
        }
        
        
        //GUARDAR LOS LIBROS
        public static void ingresarLibros(int cantidadLibros) {
            for (int i = 0; i < cantidadLibros; i++) {
                System.out.print("Ingrese el titulo del Libro" + (i + 1) + ": ");
                String tituloLibro = scan.nextLine();
                libros.add(tituloLibro);
            }
        }

        public static void ordenarLibros() {
            libros.sort(String::compareToIgnoreCase);
        }

        public static void mostrarLibros() {
            System.out.println("Mostrar los libros ordenados alfabeticamente:");
            for (String libro : libros) {
                System.out.println(libro);
            }
        }
    }
