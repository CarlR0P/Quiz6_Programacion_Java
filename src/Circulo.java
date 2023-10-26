/**
 * La clase Circulo que hereda de FiguraGeometrica
 */
public class Circulo extends FiguraGeometrica {
    /**************************************/
    /************* Atributos **************/
    /**************************************/
    private double radio;

    /**
     * Constructor de la clase.
     *
     * @param nombre el nombre que le asigna el usuario a la figura geometrica.
     * @param color el color que le asigna el usuario a la figura geometrica.
     * @param radio el radio que le asigna el usuario al circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    /**
     * Setter del atributo radio
     *
     * Para modificar el valor del radio del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setRadio() {
        this.radio = radio;
    }
    /**
     * Metodo especifico para obtener el area del circulo.
     *
     * @return el area del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea () {
        return Math.PI * radio * radio;
    }
    /**
     * Metodo especifico para obtener el perimetro del circulo.
     *
     * @return el perimetro del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro () {

        return 2 * Math.PI * radio;
    }
}