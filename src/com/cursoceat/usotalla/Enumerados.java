package com.cursoceat.usotalla;

import java.util.Scanner;

public class Enumerados {
	
	enum Talla{
		
		MINI("S"), MEDIANA("M"), GRANDE("L"), MUYGRANDE("XL");
		


		private Talla (String abreviatura) {
			this.abreviatura=abreviatura;
		}
		public String getAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUYGRANDE");
		String entradaDatos=entrada.next().toUpperCase();
		
		Talla laTalla=Enum.valueOf(Talla.class,entradaDatos);
		
		System.out.println("Talla= "+laTalla);
		
		System.out.println("Abreviatura= "+laTalla.getAbreviatura());
		
		entrada.close();

	}

}
