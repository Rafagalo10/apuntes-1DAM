package ventilador;

import java.util.Scanner;

public class PrincipalVentilador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir datos del ventilador");
		System.out.println("Marca");
		String marca = sc.nextLine();
		System.out.println("Modelo");
		String modelo = sc.nextLine();
		System.out.println("Tipo");
		String tipo = sc.nextLine();
			Ventilador ventilador1 = new Ventilador(marca,modelo,tipo);
		
		int opcion;
		do {
			System.out.println("-".repeat(5)+"Menu Opciones"+"-".repeat(5));
			System.out.println("1. Poner Velocidad");
			System.out.println("2. Parar");
			System.out.println("3. Mostrar Velocidad");
			System.out.println("4. Cambiar tipo de ventilador");
			System.out.println("5. Mostrar todos los datos");
			System.out.println("6. Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("introducir la velocidad deseada");
				int vel = sc.nextInt();
				sc.nextLine();
				if (vel >= 1 && vel <=3) {
					ventilador1.ponerVelocidad(vel);
				} else {
					System.out.println("Velocidad no permitida");
				}
				break;
			case 2:
				ventilador1.parar();
				break;
			case 3:
				System.out.println("Velocidad actual: "+ventilador1.getVelocidad());
				break;
			case 4:
				
				break;
			case 5:
				ventilador1.toString();
				break;
			case 6:
				System.out.println("Saliendo del menu....");
				break;

			default:
				break;
			}
			
			
		} while (opcion > 0 && opcion<6);
		
		
		
		sc.close();
	}
}
