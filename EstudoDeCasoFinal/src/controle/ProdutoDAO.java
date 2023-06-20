package controle;

import java.util.ArrayList;
import modelo.IProdutoDAO;
import modelo.Produto;
import java.util.Scanner;

public class ProdutoDAO implements IProdutoDAO {

	private ArrayList<Produto> catalogo;
	private ArrayList<Produto> carrinho;
	
	 public ProdutoDAO() {
	        catalogo = new ArrayList<>();
	        carrinho = new ArrayList<>();
	        adicionarRoupasIniciais();
	    }
	 
	 public void adicionarRoupasIniciais() {
	        catalogo.add(new Produto("Camisa"));
	        catalogo.add(new Produto("Calça"));
	        catalogo.add(new Produto("Sapato"));
	    }
	  
	 public ArrayList<Produto> getCatalogo() {
	        return catalogo;
	 }
	 
	 public void visualizarCatalogo() {
		 		System.out.println("Catálogo:");
		        for (Produto roupa : catalogo) {
		            System.out.println(roupa.getNome());
		        }
		    }
	 
	 public void comprarRoupa(Produto roupa) {
	        catalogo.remove(roupa);
	        carrinho.add(roupa);
	        System.out.println(roupa.getNome() + " roupa adicionada ao carrinho");
	    }
	 
	 public void visualizarCarrinho() {
	        System.out.println("Carrinho:");
	        for (Produto roupa : carrinho) {
	            System.out.println(roupa.getNome());
	        }
	    }
	 
	 public void removerRoupaDoCarrinho(Produto roupa) {
	        carrinho.remove(roupa);
	        catalogo.add(roupa);
	        System.out.println(roupa.getNome() + "roupa removida do carrinho");
	    }
	 
	  public void Pagamento(String senhaCadastro) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Digite sua senha: ");
				String senhaDigitada = scanner.nextLine();

			
				while (!senhaDigitada.equals(senhaCadastro)) {
				    System.out.println("Senha incorreta, tente novamente !");
				    System.out.print("Digite sua senha: ");
				    senhaDigitada = scanner.nextLine();
				}
			}
	        System.out.println("Pagamento realizado com sucesso!");
	    }
	  
	  public void venderRoupa(String nomeRoupa) {
	        Produto roupa = new Produto(nomeRoupa);
	        catalogo.add(roupa);
	        System.out.println(roupa.getNome() + "roupa adicionada ao catálogo");
	    
	}

	public boolean inserir(Produto p) {
		return false;
	}

	public boolean alterar(Produto p) {
		return false;
	}

	public boolean excluir(Produto p) {
		return false;
	}

	public ArrayList<Produto> list() {
		return null;
	}
}
