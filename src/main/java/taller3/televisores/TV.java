package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	public Control control;
	public static int numTV;
	
	TV(){
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public TV(Marca x, boolean y) {
		this.marca = x;
		this.estado = y;
		canal = 1;
		volumen = 1;
		precio = 500;
		numTV++;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca x) {
		this.marca = x;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control x) {
		this.control = x;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int x) {
		if(x>=0 && x<= 7) {
		this.volumen = x;}
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int x) {
		this.precio = x;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int x) {
		if(x > 0 && x<=120) {
		this.canal = x;}
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public static void setNumTV(int x) {
		TV.numTV = x;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(this.getEstado() == true && this.getCanal() >= 1 && this.getCanal() <= 120) {
			this.canal ++;
		}
	}
	
	public void canalDown() {
		if(this.getEstado() == true && this.getCanal() > 1 && this.getCanal() <= 120) {
			this.canal --;
		}
	}
	
	public void volumenUp() {
		if(this.getEstado() == true && this.getVolumen() >= 0 && this.getVolumen() <= 7) {
			this.volumen ++;
		}
	}
	
	public void volumenDown() {
		if(this.getEstado() == true && this.getVolumen() > 0 && this.getVolumen() <= 7) {
			this.volumen --;
		}
	}
}
