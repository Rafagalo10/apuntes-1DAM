package programa;

import java.util.Random;
import java.util.Scanner;

public class EjerWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int num = 1;
//		while (num <= 100) {
//			System.out.println(num);
//			num++;
//		}
	
//		System.out.println("Introducir un numero");
//		int num1 = sc.nextInt();
//		int i = 0;
//		
//		while (i <= num1) {
//		System.out.print("*");	
//		i++;
//		}

//		System.out.println("Introducir un numero");
//		int num = sc.nextInt();
//		while (num != 0) {
//			System.out.println(num);
//			System.out.println("Introducir otro numero");
//			num = sc.nextInt();
//		}
		
//		System.out.println("introducir un numero");
//		int num1 =sc.nextInt();
//		while (num1 != 0) {
//			if (num1 > 0) {
//				System.out.println("es positivo");
//			}else {
//				System.out.println("Es negativo");
//			}
//			System.out.println("introducir otro numero");
//			num1 = sc.nextInt();
//		}
		
//		System.out.println("Introducir un nombre de usuario");
//		String user = sc.nextLine();
//		while (!user.equals("profesor")) {
//			System.out.println("Introducir un nombre de usuario");
//			user = sc.nextLine();
//		}
//		System.out.println("Acceso Concedido");
	
		
		
//		System.out.println("Introducir un nombre de usuario");
//		String user = sc.nextLine();
//		while (!user.equals("profesor") && !user.equals("alumno") && !user.equals("invitado")) {
//			System.out.println("Introducir un nombre de usuario");
//			user = sc.nextLine();
//		}
//		System.out.println("Acceso Concedido");
		
//		Random r = new Random();		
//		int num1 = r.nextInt(20);
//		System.out.println("introducir un numero");
//		int num2 =sc.nextInt();
//		while (num2 != num1) {
//			if (num2 > num1) {
//				System.out.println("Tu numero es mayor");
//			} else if (num2 < num1){
//				System.out.println("tu numero es menor");
//			}
//			System.out.println("introduce otro numero");
//			num2 = sc.nextInt();
//		}
//				System.out.println("ACERTASTE!!!");

		
		
		
//		
//		System.out.println("Introduce el usuario");
//		String user = sc.nextLine();
//		System.out.println("Introduce la contraseña");
//		String pass = sc.nextLine();
//		
//		while (!user.equals("admin") || !pass.equals("123456") ) {
//			System.out.println("Introduce el usuario");
//			 user = sc.nextLine();
//			System.out.println("Introduce la contraseña");
//			pass = sc.nextLine();
//		}
//		System.out.println("Acceso concedido");
		
		
//		Ejercicios while 
//		2
		System.out.println("introducir un numero");
		int num = sc.nextInt();
		int contador = 0 ;
		while (num > 0) {
			contador ++;
			System.out.println("introducir otro numero");
			num=sc.nextInt();
			}
		System.out.println("Se han introducido positivos: " + contador);
	sc.close();	
	}
}
		
