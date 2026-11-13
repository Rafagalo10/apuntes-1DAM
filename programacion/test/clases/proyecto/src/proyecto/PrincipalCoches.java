package proyecto;

import java.util.Scanner;

public class PrincipalCoches {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Coche coche=new Coche();
//		Coche coche2=new Coche();
		System.out.println("-".repeat(10)+"Datos de primer coche"+"-".repeat(10));
		System.out.println("Introducir marca del primer coche ");
		coche.setMarca(sc.nextLine());
		System.out.println("Introducir modelo del primer coche ");
		coche.setModelo(sc.nextLine());
		System.out.println("Introducir matricula del primer coche ");
		coche.setMatricula(sc.nextLine());
		System.out.println("Introducir potencia del primer coche ");
		coche.setPotencia(sc.nextInt());
		System.out.println("Introducir velocidad del primer coche ");
		coche.setVelocidad(sc.nextInt());
		System.out.println("Introducir si esta arrancando del primer coche ");
		coche.setArrancando(sc.nextBoolean());
		
		System.out.println();
		sc.nextLine();
		
		/*
		System.out.println("----------Datos del segundo coche----------");
		System.out.println("Introducir marca del segundo coche ");
		coche2.setMarca(sc.nextLine());
		System.out.println("Introducir modelo del segundo coche ");
		coche2.setModelo(sc.nextLine());
		System.out.println("Introducir matricula del segundo coche ");
		coche2.setMatricula(sc.nextLine());
		System.out.println("Introducir potencia del segundo coche ");
		coche2.setPotencia(sc.nextInt());
		System.out.println("Introducir velocidad del segundo coche ");
		coche2.setVelocidad(sc.nextInt());
		System.out.println("Introducir si esta arrancando del segundo coche (true/false)");
		coche2.setArrancando(sc.nextBoolean());
		*/
//		Datos del primer coche
		System.out.println("1º coche: ");
		System.out.println("Marca: "+ coche.getMarca());
		System.out.println("Modelo: "+coche.getModelo());
		System.out.println("Matricula: "+ coche.getMatricula());
		System.out.println("Potencia "+coche.getPotencia());
		System.out.println("Velocidad "+coche.getVelocidad());
		
		if (coche.isArrancando()==true) {
			System.out.println("Esta arrancando: Si ");
		} else {
			System.out.println("Esta arrancando: No");
		}
		
		
		System.out.println();
		
//		Datos del segundo coche 
		System.out.println("2º coche: ");
	
	sc.close();
	}
	
}
