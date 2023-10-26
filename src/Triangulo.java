/**
 * La clase Triangulo que hereda de FiguraGeometrica
 */
public class Triangulo extends FiguraGeometrica {
    /**************************************/
    /************* Atributos **************/
    /**************************************/
    private double base;
    private  double altura;

    /**
     * Constructor de la clase.
     *
     * @param nombre el nombre que le asigna el usuario a la figura geometrica.
     * @param color el color que le asigna el usuario a la figura geometrica.
     * @param base la base que le asigna el usuario al triangulo.
     * @param altura la altura que le asigna el usuario al triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo (String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Setter del atributo base
     *
     * @param base para modificar el valor de la base del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setBase(double base) {
        this.base = this.base;
    }

    /**
     * Setter del atributo altura
     *
     * @param altura para modificar el valor de la altura del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setAltura(double altura) {
        this.altura = this.altura;
    }

    /**
     * Metodo especifico para obtener el area del triangulo.
     *
     * @return el area del triangulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea () {
        return (base * altura) / 2;
    }

    /**
     * Metodo especifico para obtener el perimetro del triangulo.
     *
     * @return no retorna, ya que no se le pide los valores de los lados al usuario.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro () {
        return -1;
    }
}