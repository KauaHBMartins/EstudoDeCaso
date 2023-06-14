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
		System.out.println("1 CADASTRO");
		System.out.println("2 VISUALIZAÇÂO DO CATALOGO");
		System.out.println("3 COMPRA");	
		System.out.println("4 VENDA");
		System.out.println("5 CARRINHO");	
		System.out.println("6 PAGAMENTO");	
		
	opSelecionada = Integer.valueOf(leitura.nextLine());
	
	switch (opSelecionada) {
	
	case 0: {
		break;
	}
	
	case 1: {
		
		System.out.println("Nome:");
		String nomePessoa = leitura.nextLine();
		
		System.out.println("email:");
		String emailPessoa = leitura.nextLine();
		
		System.out.println("Senha:");
		Integer senhaPessoa = Integer.valueOf(leitura.nextLine());
		
		System.out.println("Confirme a senha:");
		Integer senhaconfirmaPessoa = Integer.valueOf(leitura.nextLine());
		
		if (senhaconfirmaPessoa != senhaPessoa) {
			System.out.println("A senha está errada");
			return;}
			
			Produto usuario = new Produto();
			usuario.nomePessoa = (nomePessoa);
			usuario.emailPessoa = (emailPessoa);
			usuario.senhaPessoa = (senhaPessoa);
			usuario.senhaconfirmaPessoa = (senhaconfirmaPessoa);
			break;
		}
		
	
	case 2: {
		ArrayList<Produto> lista = ProdutoDAO.getInstance().list();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNomeCamisa());
			System.out.println(lista.get(i).getNomeCalca());
			System.out.println(lista.get(i).getNomeSapato());
			System.out.println(lista.get(i).getNomeChapeu());
		}
		break;
	}
	
	case 3: {
		System.out.println("Digite o codico da roupa que deseja comprar :");
		Integer codicoCompra = Integer.valueOf(leitura.nextLine());
		
		System.out.println("Deseja ir direto para o pagamento digite 1 caso contrario digite 2 para continuar escolhendo as roupas :");
		Integer opcaoCompra = Integer.valueOf(leitura.nextLine());//se escolher 1 continua para o pagamento pro outro caso se for continuar comprando repete esse de cima e também tem q pegar e peguntar se ele quer add no carrinho
	}	
	
	case 4: {
		break;
	}
	
	case 5: {
		
		
		break;
		}
	
	case 6: {
		
		System.out.println("Confirme sua senha para efetuar o pagamento :");
		
		System.out.println("Senha:");
		Integer senhaPessoa = Integer.valueOf(leitura.nextLine());
		
		System.out.println("Confirme a senha:");
		Integer senhaconfirmaPessoa = Integer.valueOf(leitura.nextLine());
		
		while (senhaconfirmaPessoa != senhaPessoa) {
			System.out.println("A senha está errada");
			return;
		
		}
		break;
	}
		}
	}
	
}
}
