/**
 * La clase FiguraGeometrica para Circulo, Rectangulo y Triangulo.
 */
public abstract class FiguraGeometrica {
    /**************************************/
    /************* Atributos **************/
    /**************************************/
    private String nombre;
    private String color;

    /**
     * Constructor de la clase.
     *
     * @param nombre el nombre que le asigna el usuario a la figura geometrica.
     * @param color el color que le asigna el usuario a la figura geometrica.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    /**
     *  Metodo para obtener el area de la figura geometrica
     *
     * @return un valor en 0
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea () {
        return 0;
    }
    /**
     *  Metodo para obtener el perimetro de la figura geometrica
     *
     * @return un valor en 0
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro () {
        return 0;
    }
}