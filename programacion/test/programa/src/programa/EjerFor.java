package programa;

import java.util.Scanner;

public class EjerFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int suma = 0;
//		for (int i = 0; i < 10; i++) {
//			int aleatorios= (int) (Math.random()*20);
//			suma+=aleatorios;
//			System.out.println(aleatorios);
//		}
//		System.out.println("La suma de los numeros generados es: "+ suma);
//		
//	2. 
//		System.out.println("introducir un numero");
//		int num = sc.nextInt();
//		int producto=1;
//		
//		for (int i = 1; i <= num; i++) {
//			producto *=i ;
//
//		}
//		System.out.println(producto);
//
//	3.
		
//		int contador=0;
//		int suma=0;
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Introducir la edad y su altura en cm");
//		int edad=sc.nextInt();
//		int alturaCm= sc.nextInt();
//			suma+=edad;
//			if (alturaCm >= 180) {
//				contador++;
//			}
//		}
//		System.out.println("la media de las edades es " + suma/3 + " y mas de 180 son: " + contador );
//	4.
//		System.out.println("Introducir un numero");
//		int num=sc.nextInt();
//		int maximo = -1;
//		for (int i = 0; i < num; i++) {
//			System.out.println("introducir un sueldo");
//			int sueldo= sc.nextInt();
//			if (sueldo>maximo) {
//				maximo=sueldo;
//			}
//			
//		}
//		System.out.println("El sueldo mayor es:" + maximo);
//		
//	5.
		System.out.println("introducir un numero");
		int num=sc.nextInt();
		if (num>0 && num<=10) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(num + "*" + i + "=" + num*i);
			}
		}
		
		
		
		
		
		sc.close();
		}		
	}

