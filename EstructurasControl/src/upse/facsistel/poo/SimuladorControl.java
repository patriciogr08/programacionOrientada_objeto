package upse.facsistel.poo;
import java.util.Random;

import upse.facsistel.academico.Estudiante;
import upse.facsistel.academico.curso;

public class SimuladorControl {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		curso poo=new curso(4001, "Programacion Orientada a Objeto");
		Estudiante kerly= new Estudiante("Kerly ABC");
		poo.inscribirEstudiantes(kerly);
		double promedioCurso=0;
		try{
	    promedioCurso = 5320/poo.getNumeroEstudiantes();
		}catch(ArithmeticException ae)
		{
			System.out.println("No se puede calcular un promedio para curso sin estudiantes");
			System.out.println("Por favor ingrese estudiantes e intente de nuevo");
		}
		System.out.println("El promedio es: "+promedioCurso+"....");
		
	}

}
