package view;

import model.Cachorro;

import java.util.ArrayList;
import java.util.Scanner;

public class testeCachorro {
	
	ArrayList <Cachorro> lista_cao = new ArrayList();

	public void Main(int escolha) {
		
		if (escolha == 1) {
			System.out.println(" Vou precisar das seguintes informações para poder cadastrar o novo animal:");
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			
			Scanner nomecachorro = new Scanner (System.in); 
			System.out.println("O nome do cachorro é:     ");
			String nome = nomecachorro.next(); 
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			
			
			Scanner racacachorro = new Scanner (System.in); 
			System.out.println("A raça do cachorro é:     ");
			String raca = racacachorro.next(); 
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			
			
			Scanner sexocachorro = new Scanner (System.in); 
			System.out.println("O sexo do cachorro é:     ");
			String sexo = sexocachorro.next(); 
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			
		
			Scanner idadecachorro = new Scanner (System.in); 
			System.out.println("A idade do cachorro é:     ");
			int idade = idadecachorro.nextInt(); 
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			 
			
			Cachorro c1 = new Cachorro ("a", "b", "c", 1, 1 , 1); 
			
			c1.setIdade(idade);
			c1.setNome(nome);
			c1.setRaça(raca);
			c1.setSexo(sexo);
			
		
			lista_cao.add(c1); 
			break; }
		
		
		else if (escolha == 2) {
			
			System.out.println (" Temos os seguintes animais cadastrados:");
			
			int i; 
			
			for (Cachorro Cachorro : lista_cao) {
				System.out.println(lista_cao);  }
			
		}

		else if (escolha == 5) {
			
			System.out.println("Obrigado por usar nosso sistema!");
			 
		}

	}
	
	
	public void manipular_cao (Cachorro cao_atual, ArrayList<Cachorro> lista_cao) {
		
		boolean condicao; 
		condicao = true; 
	
		while (condicao) {
			
			
			System.out.println (" =-=-==-=- Menu de Manipulação -=-=-=-=-=-");
			
			System.out.println (" Opção 1 - Ver dados do animal ");
			System.out.println (" Opção 2 - Alimentar animal "); 
			System.out.println (" Opção 3 - Brincar com o animal ");
			System.out.println (" Opção 4 - Cruzar animal ");
			System.out.println (" Opção 5 - Retorno ao menu principal "); 
			
			System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			Scanner escolha2 = new Scanner(System.in);
			System.out.println(" Informa qual a opção desejada?  ");
			String opcao = escolha2.next();
			
			System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");

			int i;
			int n = lista_cao.size();
			Cachorro cachorro_escolhido;
			
			
			for (i = 0; i < n; i ++) {
				System.out.printf("Posição %d - %s\n", i, lista_cao.get(i)); 
				
			System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			Scanner ler = new Scanner(System.in); 
			System.out.println (" Escolha o cão que deseja manipular");
			i = ler.nextInt();
			
			System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			cachorro_escolhido = lista_cao.get(i);

			if (opcao.equals("1")) {
				
				System.out.println(" As informações do cachorro estão a seguir: ");
				System.out.println(cachorro_escolhido.toString());
		
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
			}

			
			else if (opcao.equals("2")) {
				
				System.out.println(" Escolha o alimento para o cachorro: ");
				System.out.println(" 1 - para ração");
				System.out.println(" 2 - para carne");
				System.out.println(" 3 - para vegetais ");
				
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
				
				Scanner alimento = new Scanner(System.in);
				System.out.println(" Informa qual a opção desejada?  ");
				int comida = alimento.nextInt();
				
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
				
				if (comida == 1) {
					cachorro_escolhido.Comer(comida);}
				else if (comida == 2) {
					cachorro_escolhido.Comer(comida);}
				else if (comida == 3) {
					cachorro_escolhido.Comer(comida);
				} }
			
			else if (opcao.equals("3")) {
				
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
				
				
				System.out.println(" Escolha a brincadeira para o cachorro: ");
				System.out.println(" 1 - para brincar com a bolinha");
				System.out.println(" 2 - para saltar");
				System.out.println(" 3 - para girar no chão ");
					
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");	
				
				Scanner brincar = new Scanner(System.in);
				System.out.println(" Informa qual a opção desejada?  ");
				int brincadeira = brincar.nextInt();
					
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");	
				
				if (brincadeira == 1) {
					cachorro_escolhido.Brincar(brincadeira);}
				else if (brincadeira == 2) {
					cachorro_escolhido.Brincar(brincadeira);}
				else if (brincadeira == 3) {
					cachorro_escolhido.Brincar(brincadeira);} }
			
			
			else if (opcao.equals("4")) {
				
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
				
				System.out.println(" Escolha o cachorro para cruzar com a sua escolha");
				
				int b; 
				Cachorro cachorro_para_cruzar;
				
				
				for (b = 0; b < n; b ++) {
					System.out.printf("Posição %d - %s\n", b, lista_cao.get(b)); 
				}
		
				System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
				
				Scanner ler2 = new Scanner(System.in); 
				System.out.println (" Escolha o cão que deseja cruzar: ");
				b = ler2.nextInt();
				
				System.out.println("=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				cachorro_para_cruzar = lista_cao.get(b);

				
				System.out.println(cachorro_escolhido.PodeCruzar(cachorro_para_cruzar));
				
				System.out.println(cachorro_escolhido.Cruzar(cachorro_para_cruzar)); }
			
			
			else if (opcao.equals("5")) {
				break;
			}
	
				
		}
		
	}
	
}	
	
	

	public static void main(String[] args) {
		
		testeCachorro tc = new testeCachorro(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		System.out.println (" =-=-=- Nasus - Sistema para Cães =-=-=-=-=-");
		
		
		System.out.println (" =-=-==-=- Menu Principal -=-=-=-=-=-=-=-=-=");
		
		System.out.println (" Opção 1 - Cadastrar novo Cachorro ");
		System.out.println (" Opção 2 - Mostrar lista de Cachorros Cadastrados "); 
		System.out.println (" Opção 3 - Sair do Sistema "); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		Scanner es = new Scanner (System.in); 
		System.out.println("Qual sua escolha:  ");
		int escolha = es.nextInt(); 
		
		System.out.println (" =-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-");
		
		if (escolha == 1) {
			tc.Main(escolha);
		}
		
		else if (escolha == 2) {
			tc.Main(escolha);
			tc.manipular_cao(null, null);
		}
		
		else if (escolha == 3) {
			tc.Main(escolha);
		}

	}

}
