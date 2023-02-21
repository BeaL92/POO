package segundoPOO;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona();
		p.edad=18;
		p.nombre="Carmen Alicia";
		p.estatura=1.56;
		p.saludar();
		p.cumplirAnios();
		System.out.println("Cuando cumplas años tendras "+p.edad);
		System.out.println("¿Cuanto has crecido? -> ");
		double incremento=new Scanner (System.in).nextDouble();
		p.crecer(incremento);
		System.out.printf("Tu estatura ahora es-> %.2f",p.estatura);
		
		
		
	}

}
