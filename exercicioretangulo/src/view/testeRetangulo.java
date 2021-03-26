package view;

import model.Retangulo;

public class testeRetangulo {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(30, 10, 26, 6);
		System.out.println("A moldura do quadro vai ter área de " + r1.calcularMoldura());
		
		
	}

}
