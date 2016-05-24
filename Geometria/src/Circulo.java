/**
 * Esta clase crea un circulo atravez de un punto
 * @author Enrique
 *
 */
public class Circulo {
	//Atributos/propiedades
	private double radio = 1;
	public static final double pi = 3.1415;
		private Punto p;
	
	//constructor
	public Circulo(double radio, Punto centro) {
		this.radio = radio;
		p = centro;
	}
	/**
	 * este metodo calcular el area de un circulo
	 * @return double area
	 */
	public double calcularArea()
	{
		return pi*Math.pow(radio, 2);
	}
	/**
	 * este metodo calcula el perimetro o circunferencia del circulo
	 * @return	double perimetro
	 */
	public double calcularCircunferencia()
	{
		return 2*pi*radio;
	}
	public void imprimirCirculo(){
		String salida= "El circulo tiene radio "+this.radio+" centrado en " + p.getX()+ "," + p.getY();
		 salida+="\nEl area del circulo es:  "+calcularArea()+" y su circunferencia es: "
		+calcularCircunferencia();
		System.out.println(salida);
	}
}
