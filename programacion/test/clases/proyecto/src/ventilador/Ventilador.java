package ventilador;

public class Ventilador {
	String marca, modelo,tipo;
	boolean estado;
	int velocidad;
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isEstado() {
		return estado;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public Ventilador() {
		marca="Dyson";
		modelo="2350";
		tipo="techo";
		velocidad=0;
		estado=false;
	}
	public Ventilador(String marca, String modelo, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		velocidad=0;
		estado=false;
	}
	
	public String toString() {
		return "Ventilador\n" +
				"Marca=" + marca+ "\n"+
				"Modelo=" + modelo + "\n"+
				"Tipo=" + tipo + "\n"+
				"Estado=" + estado+"\n"
				+ "Velocidad=" + velocidad + "\n";
	}
	public void ponerVelocidad(int vel) {
		this.velocidad = vel;
	}
	public String parar() {
		if (estado=true) {
			estado=false;
			velocidad=0;
			return "Ventilador detenido";
		} else {
			return "El ventilador ya estaba detenido";
		}
		
	}
	


}
