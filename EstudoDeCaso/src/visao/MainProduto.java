package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		
	Scanner leitura = new Scanner(System.in); 
	Integer opSelecionada = Integer.MAX_VALUE;
	ArrayList<Produto> produto = new ArrayList<>();
	
	
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
		ArrayList<Produto> lista = ProdutoDAO.getInstance().list();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNomeCamisa());
			System.out.println(lista.get(i).getNomeCalca());
			System.out.println(lista.get(i).getNomeSapato());
			System.out.println(lista.get(i).getNomeChapeu());
		}
		
		
	}
	
	case 2: {
		
	}
	
	case 3: {
	}	
	
	case 4: {
	}
	
	case 5: {
	}
	
	case 6: {
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
			
		}

		Produto usuario = new Produto();
		usuario.nomePessoa = (nomePessoa);
		usuario.emailPessoa = (emailPessoa);
		usuario.senhaPessoa = (senhaPessoa);
		usuario.senhaconfirmaPessoa = (senhaconfirmaPessoa);
	}
	
	
	
	
	
	
	
		}
	}
	
}
}
