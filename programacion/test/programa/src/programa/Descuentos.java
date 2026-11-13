package programa;

import java.util.Scanner;
public class Descuentos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir el primer numero");
		int div1=sc.nextInt();
		System.out.println("Introducir el segundo numero");
		int div2=sc.nextInt();
		System.out.printf("cociente: "+div1/div2+", resto: "+div1%div2);
		sc.close();
	}
}