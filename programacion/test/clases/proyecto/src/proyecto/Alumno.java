package proyecto;


public class Alumno {
	private String nombre, apellidos;
	private int edad, faltasAsistencias;
	private double nota1,nota2,nota3;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getInasistencias() {
		return faltasAsistencias;
	}
//	public void setInasistencias(int inasistencias) {
//		this.faltasAsistencias = inasistencias;
//	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public Alumno(){
		faltasAsistencias = 0;
	}
	public void  faltar() {
		faltasAsistencias++;
	}
	public void faltar(int faltas) {
		faltasAsistencias+=faltas;
	}
	public double calcularNotaMedia() {
		return ((nota1+nota2+nota3)/3);
	}
}
