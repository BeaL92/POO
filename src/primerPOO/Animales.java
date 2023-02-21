package primerPOO;

public class Animales {
	//Atributos
	String nombre;
	int iD;
	int edad;
	
	//metodos
	public void mostrarNombre() {
		System.out.println(nombre);
		
	}
	public void mostrarCaracteristicas(String nomb, int edad, int iD) {
		System.out.println("Mi Animal se llama " +nomb+ " tiene "+edad+ " años y si ID es "+iD);
	}

}
