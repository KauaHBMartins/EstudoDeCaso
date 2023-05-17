package CasoIII;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaIII {

	public static void main(String[] args) {
		
		
		Scanner leitura = new Scanner(System.in); 
		Integer opSelecionada = Integer.MAX_VALUE;
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		
		
		while (opSelecionada != 0) {
			
			System.out.println("-------  BEM-VINDO A LOJA CHAVOSO.COM  -------");
			System.out.println("0 SAIR");
			System.out.println("1 VISUALIZAÇÂO DO CATALOGO");
			System.out.println("2 PESQUISA");
			System.out.println("3 COMPRA");
			System.out.println("4 VENDA");	
			System.out.println("5 CARRINHO");
			System.out.println("6 PAGAMENTO");	
			System.out.println("7 CADASTRO");	
			
		opSelecionada = Integer.valueOf(leitura.nextLine());
		
		switch (opSelecionada) {
		
		case 0: {
			break;
		}
		
		case 1: {
			//precisamos fazer com o POO.
		}
		
		case 2: {
			//precisamos fazer com o POO.
		}
		
		case 3: {
			//precisamos fazer com o POO.
		}	
		
		case 4: {
			//precisamos fazer com o POO.
		}
		
		case 5: {
			//precisamos fazer com o POO.
		}
		
		case 6: {
			//precisamos fazer com o POO.
		}
		
		case 7: {
			
			System.out.println("Nome:");
			String nomePessoa = leitura.nextLine();
			
			System.out.println("email:");
			String emailPessoa = leitura.nextLine();
			
			System.out.println("Senha:");
			Integer senhaPessoa = Integer.valueOf(leitura.nextLine());
			
			System.out.println("Confirme a senha:");
			Integer senhaconfirmaPessoa = Integer.valueOf(leitura.nextLine());
			
			while (senhaconfirmaPessoa != senhaPessoa) {
				System.out.println("A senha está errada");
				System.out.println("Confirme a senha:");
				Integer senhaconfirmaPessoa = Integer.valueOf(leitura.nextLine());
			}

			Pessoa p = new Pessoa();
			p.nomePessoa = (nomePessoa);
			p.emailPessoa = (emailPessoa);
			p.senhaPessoa = (senhaPessoa);
			p.senhaconfirmaPessoa = (senhaconfirmaPessoa);

			pessoa.add(p);
		}
		
		
		
		
		
		
		
			}
		}
		
	}
}
