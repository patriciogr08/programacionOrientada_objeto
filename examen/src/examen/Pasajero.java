package examen;

public class Pasajero {
	private ClaseCabina clase;
	private String pasaporte;
	private int numeroViajeroFrecuente;
	private String nombre;
	private genero genero;
	private String nacionalidad;
	private int edad;
	private boolean checkln = false;
	
	public Pasajero(){
		
	}
	
	public Pasajero(ClaseCabina clase, String pasaporte, int numeroViajeroFrecuente, String nombre,
			examen.genero genero, String nacionalidad, int edad, boolean checkln) {
		super();
		this.clase = clase;
		this.pasaporte = pasaporte;
		this.numeroViajeroFrecuente = numeroViajeroFrecuente;
		this.nombre = nombre;
		this.setGenero(genero);
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.checkln = checkln;
	}
	public ClaseCabina getClase() {
		return clase;
	}
	public void setClase(ClaseCabina clase) {
		this.clase = clase;
	}
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	public int getNumeroViajeroFrecuente() {
		return numeroViajeroFrecuente;
	}
	public void setNumeroViajeroFrecuente(int numeroViajeroFrecuente) {
		this.numeroViajeroFrecuente = numeroViajeroFrecuente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCheckln() {
		return checkln;
	}
	public void setCheckln(boolean checkln) {
		this.checkln = checkln;
	}
	public genero getGenero() {
		return genero;
	}
	public void setGenero(genero genero) {
		this.genero = genero;
	}  

}
 