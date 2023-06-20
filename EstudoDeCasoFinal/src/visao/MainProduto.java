package visao;

import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	private Scanner scanner;
    private ProdutoDAO puxar;

    public MainProduto() {
        scanner = new Scanner(System.in);
        puxar = new ProdutoDAO();
    }

    public void exibirMenu() {

        int opSelecionada = 10;
		while (opSelecionada != 0) {
			System.out.println("-------  BEM-VINDO A LOJA CHAVOSO.COM  -------");
			System.out.println("0 SAIR");
			System.out.println("1 CADASTRO");
			System.out.println("2 VISUALIZAÇÂO DO CATALOGO");
			System.out.println("3 COMPRA");	
			System.out.println("4 VENDA");
			System.out.println("5 CARRINHO");	
			System.out.println("6 PAGAMENTO");	
            System.out.print("Escolha uma opção: ");

            opSelecionada = scanner.nextInt();
            scanner.nextLine();

            switch (opSelecionada) {
             
            case 0: {
                break;
            }
            case 1: {
            	System.out.print("Digite seu nome: ");
                String nomeCadastro = scanner.nextLine();
                System.out.print("Digite sua senha: ");
                String senhaCadastro = scanner.nextLine();
                System.out.print("Digite seu e-mail: ");
                String emailCadastro = scanner.nextLine();
                break;
            }
            case 2: {
            	puxar.visualizarCatalogo();
                break;
            }
            case 3: {
            	System.out.print("Digite o nome da roupa que deseja comprar: ");
                String nomeCompra = scanner.nextLine();
                Produto roupaCompra = buscarRoupaNoCatalogo(nomeCompra);
                if (roupaCompra != null) {
                    puxar.comprarRoupa(roupaCompra);
                } else {
                    System.out.println("Roupa não encontrada no catálogo.");
                }
                break;
            }
            case 4: {
            	System.out.print("Digite o nome da roupa que deseja vender: ");
                String nomeVenda = scanner.nextLine();
                puxar.venderRoupa(nomeVenda);
                break;
            }
            case 5: {
            	puxar.visualizarCarrinho();
                System.out.println("1. Voltar para o menu");
                System.out.println("2. Ir para o pagamento");
                System.out.print("Escolha uma opção: ");
                int opcaoCarrinho = scanner.nextInt();
                scanner.nextLine();
                if (opcaoCarrinho == 2) {
                    puxar.Pagamento("senha123");
                } else if (opcaoCarrinho != 1) {
                    System.out.println("Opção inválida.");
                }
                break;
            }
            case 6: {
            	System.out.print("Digite sua senha: ");
                String senhaPagamento = scanner.nextLine();
                puxar.Pagamento(senhaPagamento);
                break;

            }
            }
        }
    }

    private Produto buscarRoupaNoCatalogo(String nome) {
        for (Produto roupa : puxar.getCatalogo()) {
            if (roupa.getNome().equalsIgnoreCase(nome)) {
                return roupa;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        MainProduto mostrar = new MainProduto();
        mostrar.exibirMenu();
}
}