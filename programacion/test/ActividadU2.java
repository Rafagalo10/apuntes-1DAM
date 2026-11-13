
import java.util.Scanner;

public class ActividadU2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //    1
        // System.out.println("Introduzca el año actual");
        // int añoActual = sc.nextInt();
        // System.out.println("Introduzca el año de nacimiento");
        // int añoNacimiento = sc.nextInt();
        // int edad = añoActual - añoNacimiento;
        // System.out.println("La edad es: " + edad);
// 2
        // System.out.println("Esta Lloviendo? (true/false)");
        // boolean lloviendo = sc.nextBoolean();
        // System.out.println("Hiciste la tarea? (true/false)");
        // boolean tareaHecha = sc.nextBoolean();
        // System.out.println("Tienes que ir a la biblioteca? (true/false)");
        // boolean irBiblioteca = sc.nextBoolean();
        // boolean salirCalle = (!lloviendo && tareaHecha) || irBiblioteca;
        // System.out.println("¿Puedes salir a la calle? " + salirCalle);
        // 3
        // System.out.println("Introducir nota del primer trimestre");
        // int trimestre1 = sc.nextInt();
        // System.out.println("Introducir nota del segundo trimestre");
        // int trimestre2 = sc.nextInt();
        // System.out.println("Introducir nota del tercer trimestre");
        // int trimestre3 = sc.nextInt();
        // int media = (trimestre1 + trimestre2 + trimestre3) / 3;
        // double mediadecimal = (trimestre1 + trimestre2 + trimestre3) / 3.0;
        // System.out.println("La media es: " + media);
        // System.out.println("La media decimal es: " + mediadecimal);
        // 4
        // System.out.println("introducir una distancia en milimetros");
        // double mm = sc.nextDouble();
        // System.out.println("introducir una distancia en centimetros");
        // double cm = sc.nextDouble();
        // System.out.println("introducir una distancia en metros");
        // double m = sc.nextDouble();
        // double mmToCm = mm / 10;
        // double mToCm = m * 100;
        // double totalCm = mmToCm + cm + mToCm;
        // System.out.println("La distancia total en centimetros es: " + totalCm);
// 5
        System.out.println("numero de hormigas capturadas");
        int hormigas = sc.nextInt();
        System.out.println("numero de arañas capturadas");
        int arañas = sc.nextInt();
        System.out.println("numero de cochinillas capturadas");
        int cochinillas = sc.nextInt();
        int patas = hormigas * 6;
        patas += arañas * 8;
        patas += cochinillas * 14;
        System.out.println("El numero total de patas es: " + patas);

        sc.close();
    }
}
