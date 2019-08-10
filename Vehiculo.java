public class Automovil {
	
	public int getRuedas() {
		return 4;
	}
	
	public int getVelocidadMaxima() {
		return 200;
	}
	
	public string cadena() {
		return "CantDeRuedas: " + getRuedas() + "VelocMaxima: " + getVelocidadMaxima();
	}
	
	public void presentarEnPantalla() {
		System.out.println(cadena());
	}
}