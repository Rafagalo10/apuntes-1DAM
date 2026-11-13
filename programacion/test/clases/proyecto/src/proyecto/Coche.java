package proyecto;

public class Coche {
	private String marca, modelo, matricula;
	private int potencia, velocidad;
	private boolean arrancando;
	

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public boolean isArrancando() {
		return arrancando;
	}
	public void setArrancando(boolean arrancando) {
		this.arrancando = arrancando;
	}
	
	
}
