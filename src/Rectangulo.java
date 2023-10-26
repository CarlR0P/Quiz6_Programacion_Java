/**
 * La clase Rectangulo que hereda de FiguraGeometrica
 */
public class Rectangulo extends FiguraGeometrica {
    /**************************************/
    /************* Atributos **************/
    /**************************************/
    private double lado1;
    private double lado2;
    /**
     * Constructor de la clase.
     *
     * @param nombre el nombre que le asigna el usuario a la figura geometrica.
     * @param color el color que le asigna el usuario a la figura geometrica.
     * @param lado1 el lado 1 que le asigna el usuario al rectangulo.
     * @param lado2 el lado 2 que le asigna el usuario al rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Setter del atributo Lado1
     *
     * @param lado1 para modificar el valor del lado 1 del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado1(double lado1) {
        this.lado1 = this.lado1;
    }
    /**
     * Setter del atributo Lado2
     *
     * @param lado2 para modificar el valor del lado 2 del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado2(double lado2) {
        this.lado2 = this.lado2;
    }
    /**
     * Metodo especifico para obtener el area del rectangulo.
     *
     * @return el area del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea () {
        return lado1 * lado2;
    }
    /**
     * Metodo especifico para obtener el perimetro del rectangulo.
     *
     * @return el perimetro del rectangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro () {
        return 2 * (lado1 + lado2);
    }
}