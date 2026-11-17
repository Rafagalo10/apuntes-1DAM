package proyecto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		
//		Datos alumno 1
		System.out.println("-".repeat(5)+"alumno1"+"-".repeat(5));
		System.out.println("Nombre: ");
		alumno1.setNombre(sc.nextLine());
		System.out.println("Apellidos: ");
		alumno1.setApellidos(sc.nextLine());
		System.out.println("Edad: ");
		alumno1.setEdad(sc.nextInt());
		System.out.println("Nota 1: ");
		alumno1.setNota1(sc.nextDouble());
		System.out.println("Nota 2: ");
		alumno1.setNota2(sc.nextDouble());
		System.out.println("Nota 3: ");
		alumno1.setNota3(sc.nextDouble());
		System.out.println("Faltas de asistencias: ");
//		alumno1.setInasistencias(sc.nextInt());
		
		sc.nextLine();
		
//		Datos alumno 2
		System.out.println("-".repeat(5)+"alumno2"+"-".repeat(5));
		System.out.println("Nombre: ");
		alumno2.setNombre(sc.nextLine());
		System.out.println("Apellidos: ");
		alumno2.setApellidos(sc.nextLine());
		System.out.println("Edad: ");
		alumno2.setEdad(sc.nextInt());

//		Igualar notas
		alumno2.setNota1(alumno1.getNota1());
		alumno2.setNota2(alumno1.getNota2());
		alumno2.setNota3(alumno1.getNota3());
		
//		Imprimir datos alumno1
		System.out.println("Datos del alumno 1: ");
		System.out.println("Nombre: " + alumno1.getNombre());
		System.out.println("Nombre: " + alumno1.getApellidos());
		System.out.println("Nombre: " + alumno1.getEdad());
		System.out.println("Nombre: " + alumno1.getNota1());
		System.out.println("Nombre: " + alumno1.getNota2());
		System.out.println("Nombre: " + alumno1.getNota3());
		System.out.println("Nombre: " + alumno1.getInasistencias());

		
//		Imprimir datos alumno2
		System.out.println("Datos del alumno 2: ");
		System.out.println("Nombre: " + alumno2.getNombre());
		System.out.println("Nombre: " + alumno2.getApellidos());
		System.out.println("Nombre: " + alumno2.getEdad());
		System.out.println("Nombre: " + alumno2.getNota1());
		System.out.println("Nombre: " + alumno2.getNota2());
		System.out.println("Nombre: " + alumno2.getNota3());
		System.out.println("Nombre: " + alumno2.getInasistencias());

//		Mas joven
		System.out.println("El alumno mas joven es: ");
		if(alumno1.getEdad()>alumno2.getEdad()) {
			System.out.println(alumno2.getNombre()+" "+alumno2.getApellidos());
		}else {
			System.out.println(alumno1.getNombre()+" "+alumno1.getApellidos());
		}
		
		sc.close();
	}
}
