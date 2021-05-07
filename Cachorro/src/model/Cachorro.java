package model;


import java.util.Random; 


public class Cachorro {
	
	// atributos
	
	private String nome; 
	private String raça; 
	private String sexo;
	private int idade; 
	private int energia = 100; 
	private int numero_filhote = 0; 
	
	
	// construtor 
	
	public Cachorro (String nome, String raça, String sexo, int idade, int energia, int numero_filhote) {
		this.nome = nome; 
		this.raça = raça; 
		this.sexo = sexo; 
		this.idade = idade; 
		this.energia = energia = 100; 
		this.numero_filhote = numero_filhote = 0;
		
	}

	// get e set 
	
	

	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRaça() {
		return this.raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public String getSexo() {
		return this.sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getIdade() {
		return this.idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getEnergia() {
		return this.energia;
	}


	public void setEnergia(int energia) {
		this.energia = energia;
	}


	public int getNumero_filhote() {
		return this.numero_filhote;
	}


	public void setNumero_filhote(int numero_filhote) {
		this.numero_filhote = numero_filhote;
	}
	
	 
	
	// metodos 
	
	public String toString() {
		String info_cao; 
		
		info_cao = "As informações do animal são essas:\n " +
				"nome: "+ this.nome + "\n" + 
				"idade: " + this.idade + "\n" + 
				"sexo: " + this.sexo + "\n" + 
				"raça: " + this.raça + "\n" +
				"energia: " + this.energia + "\n" + 
				"filhotes: " + this.numero_filhote; 
		
				;  
		
		return info_cao; 
	}

	public int Comer(int comida) {
		 
		if (this.energia < 50) {
			 
			if (comida == 1) {
				this.energia += 50;} 
			else if (comida == 2) {
				this.energia += 40;} 
			else if (comida == 3) {
				this.energia += 30; }
		}
		
		return this.energia;
	}
	
	public int Brincar(int brincadeira) {
		
		if (this.energia < 40) {
			
			if (brincadeira == 1) {
				this.energia -= 30;}
			else if (brincadeira == 2) {
				this.energia -= 20;}
			else if (brincadeira == 3) {
				this.energia -= 10;}
		}	
		
		return this.energia;
	}

	
	public boolean PodeCruzar (Cachorro parc) {
		
		boolean cruzar;
		
		if (this.getEnergia() < 80 && parc.getEnergia() < 80) 
		{cruzar =  false ;} 
		else if (this.getIdade() < 1 && this.getIdade() > 9) 
		{cruzar = false ; }
		else if (parc.getIdade() < 1 && parc.getIdade() > 9) 
		{cruzar =  false ; }
		else if (this.getRaça() != (parc.getRaça())) 
		{cruzar =  false; }
		else if (this.getSexo().equals(parc.getSexo())) 
		{cruzar =  false; }
		else {
			cruzar = true;
		}
		
		
		return cruzar;
		
		}
	
	public String Cruzar (Cachorro parc) {
		
		Random random = new Random();
		int filhotes = random.nextInt(10); 
		
		String info_filhotes; 
		
		if (PodeCruzar(parc) == true) {
			this.setEnergia(energia -= 50); 
			parc.setEnergia(energia -= 50);
			this.setNumero_filhote(filhotes);
			}
		
		info_filhotes = " A ninhada virá com essa quantidade de filhotes: " + filhotes; 
		
		return info_filhotes;
		
	}


	


}


	

	




