package programa;

import java.util.Scanner;

public class PruebasIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1.
//		1.1
//		System.out.println("Introducir dos numeros");									
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if(num1 == num2) {
//			System.out.println("los numeros introducidos son iguales");
//		}
//		else {
//		System.out.println("No son iguales");
//		}		
//		1.2
//		if (num1 != num2) {
//			System.out.println("Los numeros son diferentes");
//		}
//		else {
//		System.out.println("Los numeros introducidos son iguales");
//		}
//		
//		2
//		System.out.println("Introducir un numero");									
//		int num1 = sc.nextInt();
//		if (num1 > 0) {
//			System.out.println("el numero es positivo");
//		}
//		else {
//			System.out.println("El numero es negativo");
//		}
//		
//		3
//		System.out.println("Introducir un numero");									
//		int num1 = sc.nextInt();
//		if (num1 > 0) {
//			System.out.println("el numero es positivo");
//		} else if (num1 < 0){
//			System.out.println("El numero es negativo");
//		} else {
//			System.out.println("El numero es cero");
//		}
//		4
//		System.out.println("Introducir un numero");
//		int num1 = sc.nextInt();
//		if (num1 % 10 == 0) {
//			System.out.println("El numero es multiplo de 10");
//		} else {
//			System.out.println("El numero no multiplo 10");
//		}
//		
//		5
//		System.out.println("Introducir dos numero");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if (num1 > num2) {
//			System.out.println("num1 es mayor que num2");
//		} else if (num2 > num1) {
//			System.out.println("num2 es mayor que num1");
//		} else {
//			System.out.println("los numeros son iguales");
//		}
//		6
//		System.out.println("Introduce uno por uno DD MM AAAA en formato numerico");
//		int dia = sc.nextInt();
//		int mes = sc.nextInt();
//		int año = sc.nextInt();
//		if (dia>0 && dia<=30 && mes>0 && mes<=12  && año > 0) {
//			 System.out.println("La fecha introducida: " + dia + "/" + mes + "/" + año + " Es correcta" );
//		} else {
//			System.out.println("La fecha introducida no es correcta");
//		}
// 		8
//		System.out.println("Introducir la velocidad actual del coche");
//		int vel = sc.nextInt();
//		System.out.println("El coche esta arrancado?true/false");
//		boolean arrancado = sc.nextBoolean();
//		System.out.println("Cual es la aceleracion del coche?");
//		int acel = sc.nextInt();
//		sc.close();
//		
//		int velocidad =vel + acel;
//		
//		if (arrancado) {
//			if(velocidad <120) {
//				System.out.println("La velocidad del coche es: " + velocidad + " km/h");
//			} else if (velocidad >120) {
//				System.out.println("el coche supera el limite permitido");
//			}
//		} else {
//			System.out.println("no fue posible acelerar");
//		
//		Actividades bloque 2 
//		1.
		System.out.println("Calculadora de jubilacion: ");
		System.out.println("Introducir NSS");
		long nss = sc.nextLong();
		sc.nextLine();
		System.out.println("Introducir su numbre y apellidos");
		String name = sc.nextLine();
		System.out.println("Introducir su edad");
		int edad = sc.nextInt();
		System.out.println("Introducir años trabajados");
		int anios = sc.nextInt();
		sc.nextLine();
		System.out.println("Introducir el nombre de la empresa");
		String empresa = sc.nextLine();
		
		if (edad > 65 || (edad > 60 && anios > 33)) {
			System.out.println("El trabajador: "+ name + edad);
		}
	}

}
