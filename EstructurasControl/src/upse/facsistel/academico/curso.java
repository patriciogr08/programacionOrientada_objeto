package upse.facsistel.academico;

import java.util.ArrayList;

	public class curso{
		
	private int codigo;
	private int numeroEstudiantes;
	public static final int maxEstudiantes=40;
	private String nombreCurso="";
	private ArrayList<Estudiante> listaEstudiantes= new ArrayList<Estudiante>();
	public curso(int codigo, String nombreCurso) {
		this.codigo = codigo;
		this.nombreCurso = nombreCurso;
		this.numeroEstudiantes= 0;
	}
	
		
	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}


	public void setNumeroEstudiantes(int numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}


	public int getCodigo() {
		return codigo;
	}


	public static int getMaxestudiantes() {
		return maxEstudiantes;
	}


	public String getNombreCurso() {
		return nombreCurso;
	}


	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}


	public void inscribirEstudiantes(Estudiante e){
		listaEstudiantes.add(e);
		this.numeroEstudiantes= listaEstudiantes.size();
		
	}
	
}
