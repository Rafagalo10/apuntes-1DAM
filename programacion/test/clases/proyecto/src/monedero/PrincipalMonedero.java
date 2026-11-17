package monedero;

import java.util.Scanner;

public class PrincipalMonedero {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar una cantidad inicial para el monedero creado");
		double dineroInicial = sc.nextDouble();
		Monedero monedero1 = new Monedero(dineroInicial);
		
		int opcion;
		do {
			System.out.println("Elegir una opcion");
			System.out.println("1. Pagar");
			System.out.println("2. Meter dinero");
			System.out.println("3. Contar dinero");
			System.out.println("4. Vaciar monedero");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
					System.out.println("Que articulo va a comprar?");
					String articulo = sc.nextLine();
					System.out.println("Cual es su precio?");
					double articuloPrecio = sc.nextDouble();
						if (articuloPrecio>0) {
							if (monedero1.getDineroInicial()>articuloPrecio) {
								monedero1.pagos(articuloPrecio);
								System.out.println("Has comprado "+ articulo + " por valor de "+articuloPrecio+"€");
							} else {
								System.out.println("Lo siento, no hay saldo disponible");
							}
						} else {
								System.out.println("El precio es invalido");
						}
				break;
			case 2:
					System.out.println("Cuanto desea ingresar?");
					double ingreso = sc.nextDouble();
					if (ingreso>0) {
						monedero1.meterdinero(ingreso);
						System.out.println("Dinero total: "+ monedero1.saldodis()+"€");
					} else {
						System.out.println("Cantidad Invalida");
					}
				break;
			case 3:
					System.out.println("Dinero disponible:"+monedero1.saldodis()+"€");
				break;
			case 4:
					monedero1.vaciar();
					System.out.println("MONEDERO VACIADO");
				break;
			case 5:
					System.out.println("Saliendo del menu....");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			

			
		} while (opcion > 0 && opcion <5);

		
		
		sc.close();
	}

}
