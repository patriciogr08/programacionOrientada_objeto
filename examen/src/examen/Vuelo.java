package examen;

import java.util.List;
import java.util.Scanner;

public class Vuelo {
	private static Scanner teclado = new Scanner(System.in);
	private Aerolinea cual;
	private String codigoVuelo ;;
	private String aeropuertoDeOrigen;
	private String aeropuertoDeDestino;
	private double kms;
	private String piloto;
	private String fecha;
	private double duracion ;
	private String horaPartida;
	private String horaArribo;
	private int numeroPasajero;
	public String getHoraPartida() {
		return horaPartida;
	}
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	public String getHoraArribo() {
		return horaArribo;
	}
	public void setHoraArribo(String horaArribo) {
		this.horaArribo = horaArribo;
	}
	private List<Pasajero> listaPasajeros;
	

	Aerolinea getCual() {
		return cual;
	}
	public void setCual(Aerolinea cual) {
		this.cual = cual;
	}
	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public String getAeropuertoDeOrigen() {
		return aeropuertoDeOrigen;
	}
	public void setAeropuertoDeOrigen(String aeropuertoDeOrigen) {
		this.aeropuertoDeOrigen = aeropuertoDeOrigen;
	}
	public String getAeropuertoDeDestino() {
		return aeropuertoDeDestino;
	}
	public void setAeropuertoDeDestino(String aeropuertoDeDestino) {
		this.aeropuertoDeDestino = aeropuertoDeDestino;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public int getNumeroPasajero() {
		return numeroPasajero;
	}
	public void setNumeroPasajero(int numeroPasajero) {
		this.numeroPasajero = numeroPasajero;
	}
	public List<Pasajero> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	
	public void agregarPasajeros(){ // agregar pasajer
		Pasajero p= new Pasajero();
		int op,op1;
		
		System.out.println("INgrese Numero de Pasaporte");
		p.setPasaporte(teclado.next());
		System.out.println("Ingrese numero de viajero Frecuente");
		p.setNumeroViajeroFrecuente(teclado.nextInt());
		System.out.println("Ingrese nombre del Pasajero");
		p.setNombre(teclado.next());
		System.out.println("Ingrese Genero de la Persona " + "(1)" + genero.MASCULINO + "(2)" + genero.FEMENINO);
		op=teclado.nextInt();
			if(op== 1){
				p.setGenero(genero.MASCULINO);
			}
			else if(op ==2)
			{
					p.setGenero(genero.FEMENINO);
			}
		
		System.out.println("Ingrese Nacionalidad");
		p.setNacionalidad(teclado.next());
		System.out.println("Seleccione la clase de cabina"  + "(1)" + ClaseCabina.ECONOMICA 
															+ "(2)" + ClaseCabina.NEGOCIOS
															+ "(3)" + ClaseCabina.VIP);
		op1=teclado.nextInt();
		if(op1== 1){
			p.setClase(ClaseCabina.ECONOMICA);
		}
		else if(op ==2)
		{
			p.setClase(ClaseCabina.NEGOCIOS);
		}
		else if(op ==3)
		{
			p.setClase(ClaseCabina.VIP);
		}
		System.out.println("Ingrese la edad del pasajero");
		p.setEdad(teclado.nextInt());
		
		getListaPasajeros().add(p);
	}
	
	public void borrarPasajero(String pasajero1){ // borrar pasajero
		for (Pasajero p : listaPasajeros) {
			if(p.getNombre().equals(pasajero1))
			{
				getListaPasajeros().remove(pasajero1);
			}
		}
	}
	public void retrasarVuelo(String retasoHora){ // retrasar el vuelo cambiar hora
		setHoraPartida(retasoHora);
	}	
	public void listaPasajeros(){ // presenta la lista de pasajero
		for (Pasajero p: listaPasajeros) {
			System.out.println("Numero de pasaporte"+p.getPasaporte() + "nombre" + p.getNombre() + "Genero" + p.getGenero()
			+ "CheckIn" +  p.isCheckln() + " Nacionalidad " + p.getNacionalidad() + "Clase Cabina " + p.getClase() );
		}
	}
	public void checkPasajero(String pasajero2){ // camniar el valor del pasajero 
		for (Pasajero p : listaPasajeros) {
			if(p.getNombre().equals(pasajero2))
			{
				p.setCheckln(true);
			}
		}
	}
}