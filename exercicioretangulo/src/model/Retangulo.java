package model;

public class Retangulo {
	
	//atributos
	
	public int base1;
	public int altura1; 
	public int base2; 
	public int altura2; 
	
	
	// construtor 
	public Retangulo (int b1, int a1, int b2, int h2) {
		this.base1 = b1; 
		this.altura1 = a1; 
		this.base2 = b2; 
		this.altura2 = h2;
	}
	
	//metodos
	public int calcularMoldura() {
		return ((this.base1 * this.altura1) - (this.base2 * this.altura2));
	}

}
