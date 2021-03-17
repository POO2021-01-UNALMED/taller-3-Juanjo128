package taller3.televisores;

public class Control {
public TV tv;
	
	Control(){
		
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int x) {
		if(x >= 1 && x <= 120) {
		tv.setCanal(x);
		}
	}
	
	public void enlazar(TV x) {
		this.tv = x;
		x.setControl(this);
	}
}
