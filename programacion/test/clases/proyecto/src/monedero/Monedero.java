package monedero;

public class Monedero {
	private double dineroInicial;
	private double dineroIngresado;
	private double dineroTotal;
	
	public double getDineroInicial() {
		return dineroInicial;
	}
	public void setDineroInicial(double dineroInicial) {
		this.dineroInicial = dineroInicial;
	}
	public double getDineroIngresado() {
		return dineroIngresado;
	}
	public void setDineroIngresado(double dineroIngresado) {
		this.dineroIngresado = dineroIngresado;
	}
	
	public double getDineroTotal() {
		return dineroTotal;
	}
	public void setDineroTotal(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}
	public Monedero(double dineroInicial) {
		this.dineroInicial = dineroInicial;
		dineroTotal = dineroInicial;
	}
	public void meterdinero(double dineroIngresado) {
		 dineroTotal=dineroTotal + dineroIngresado;
	}
	
	public void pagos(double precio) {
		dineroTotal-=precio;
	}
	
	public double saldodis() {
		return dineroTotal;
		
	}
	public void vaciar() {
		dineroTotal=0;
	}

}
