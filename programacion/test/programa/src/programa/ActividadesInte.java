package programa;

import java.util.Scanner;

public class ActividadesInte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	/*	1. 
	 	boolean VolverEmpezar=false;
		do {
			System.out.println("Introducir el primer numero");
			int num1 = sc.nextInt();
			System.out.println("Introducir el segundo numero");
			int num2 = sc.nextInt();
			System.out.println("Introducir el tercer numero");
			int num3 = sc.nextInt();
			int opcion;
			do {
				System.out.println("--------Opciones--------");
				System.out.println("1. Mostrar el menor");
				System.out.println("2.Son Impares?");
				System.out.println("3.Volver a pedir numeros");
				System.out.println("4. Salir");
				
				opcion = sc.nextInt();
				
				switch (opcion) {
				case 1:
					if (num1<num2&&num1<num3) {
						System.out.println(num1 + " es el menor");
					} else if(num2<num1&&num2<num3){
						System.out.println(num2+" es el menor");
					}else {
						System.out.println(num3 + " es el menor");
					}
					
					break;
		
				case 2:
						if (num1%2!=0 && num2%2!=0 && num3%2!=0 ) {
							System.out.println("Todos los numeros son impares");
						} else if (num1%2==0 || num2%2==0 || num3%2==0) {
							System.out.println("No todos los numeros son impares");
						}
					break;
					
				case 3:{
					VolverEmpezar = true;
				}
					break;
					
				case 4:
					
					break;
					
				default:
					System.out.println("la opcion no es correcta");
					break;
				}
			} while (opcion !=4 && !VolverEmpezar);
			if (opcion == 4) {
				break;
			}
		} while (VolverEmpezar);
	*/
		
		double precio;
		String color;
		double suma = 0;
		do {
		System.out.println("Introducir el precio del producto");
		precio = sc.nextDouble();
		sc.nextLine();
		if (precio>=0) {
			if (precio!=0 ) {
				System.out.println("Introducir el color del producto");
			color = sc.nextLine();
			color= color.toLowerCase();
				if (color == "rojo" ) {
					suma+=precio*(15/100);
				}else {
					suma+=precio;
				}
			}
		}else {
			System.out.println("Error, introducir un valor positivo");
		}
		} while (precio!=0);
		System.out.println(suma);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
