/**
 * La clase Principal
 * Se importa la clase Scanner para leer datos por la consola.
 */

import java.util.Scanner;
public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre;
        String color;
        double area;
        double perimetro;
        double radio;
        double lado1 ;
        double lado2;
        double base;
        double altura;

        System.out.println("\nPrograma de calculo de area y perimetro ");
        System.out.println();
        System.out.print("Ingrese el nombre de la figura: ");
        nombre = lector.nextLine();
        System.out.print("Ingrese el color de la figura: ");
        color = lector.nextLine();
        /**
         * Ciclo para pedir los datos al usuario.
         * Complejidad temporal: O(1) Tiempo constante.
         */
        while (true) {
            System.out.println("\nIngrese el tipo de figura");
            System.out.println("1: Circulo, 2: Rectángulo, 3: Triángulo");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    radio = lector.nextDouble();
                    Circulo circulo = new Circulo(nombre, color, radio);
                    circulo.setRadio();
                    area = circulo.obtenerArea();
                    perimetro = circulo.obtenerPerimetro();
                    System.out.println("\nNombre: "+ nombre +". Area: "+ area +". Perimetro: "+ perimetro +". Color: " + color + "." );
                    return;
                case 2:
                    System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
                    lado1 = lector.nextDouble();
                    System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
                    lado2 = lector.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                    rectangulo.setLado1(lado1);
                    rectangulo.setLado2(lado2);
                    area = rectangulo.obtenerArea();
                    perimetro = rectangulo.obtenerPerimetro();
                    System.out.println("\nNombre: "+ nombre +". Area: "+ area +". Perimetro: "+ perimetro +". Color: " + color + "." );
                    return;
                case 3:
                    System.out.print("Ingrese el valor de la base del triángulo: ");
                    base = lector.nextDouble();
                    System.out.print("Ingrese el valor de la altura del triángulo: ");
                    altura = lector.nextDouble();
                    Triangulo triangulo = new Triangulo(nombre, color, base, altura);
                    triangulo.setBase(base);
                    triangulo.setAltura(altura);
                    area = triangulo.obtenerArea();
                    System.out.println("\nNombre: "+ nombre +". Area: "+ area +". Color: " + color + ". Para saber el perimetro es necesario conocer el valor de los tres lados.");
                    return;
                default:
                    System.out.println("Opción no válida. Seleccione 1, 2, o 3.");
            }
        }
    }
}