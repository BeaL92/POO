package segundoPOO;

public class Persona {
	String nombre;
	byte edad=5;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola. Mi nombre es: "+nombre);
		System.out.println("Encantado de conocerte");
		
	}
	public void cumplirAnios() {
		edad++;//Incrementamos la edad en 1
	}
	public void crecer(double incremento) {
		estatura+=incremento;//la estatura aunmenta segun el incremento 
	}
	

}
