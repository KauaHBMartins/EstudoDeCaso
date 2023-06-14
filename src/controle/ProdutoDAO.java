package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {

	private static ArrayList<Produto> cadastroUsuario;
	private static ArrayList<Produto> tabelaRoupas;
	private static ProdutoDAO instancia;
	public ArrayList<Produto> tabelaa;

	private ProdutoDAO() {
	}

	public static ProdutoDAO getInstance() {
		if (instancia == null) {
			instancia = new ProdutoDAO();
			tabelaRoupas = new ArrayList<>();
			
			Produto camisaUm = new Produto();
			camisaUm.setCodigoRoupa(11);
			camisaUm.setNomeCamisa("Camisa Preta");
			
			Produto camisaDois = new Produto();
			camisaUm.setCodigoRoupa(12);
			camisaUm.setNomeCamisa("Camisa Branca");
			
			Produto camisaTres = new Produto();
			camisaUm.setCodigoRoupa(13);
			camisaUm.setNomeCamisa("Camisa Amarela");
			
			Produto calcaUm = new Produto();
			calcaUm.setCodigoRoupa(21);
			calcaUm.setNomeCalca("Calca Preta");
			
			Produto calcaDois = new Produto();
			calcaDois.setCodigoRoupa(22);
			calcaDois.setNomeCalca("Calca Branca");
			
			Produto calcaTres = new Produto();
			calcaTres.setCodigoRoupa(23);
			calcaTres.setNomeCalca("Calca Amarela");
			
			Produto sapatoUm = new Produto();
			sapatoUm.setCodigoRoupa(31);
			sapatoUm.setNomeSapato("Sapato Preto");
			
			Produto sapatoDois = new Produto();
			sapatoDois.setCodigoRoupa(32);
			sapatoDois.setNomeSapato("Sapato Branco");
			
			Produto sapatoTres = new Produto();
			sapatoTres.setCodigoRoupa(33);
			sapatoTres.setNomeSapato("Sapato Amarelo");
			
			Produto chapeuUm = new Produto();
			chapeuUm.setCodigoRoupa(41);
			chapeuUm.setNomeChapeu("Chapeu Preto");
			
			Produto chapeuDois = new Produto();
			chapeuDois.setCodigoRoupa(42);
			chapeuDois.setNomeChapeu("Chapeu Branco");
			
			Produto chapeuTres = new Produto();
			chapeuTres.setCodigoRoupa(43);
			chapeuTres.setNomeChapeu("Chapeu Amarelo");
			
			tabelaRoupas.add(chapeuTres);
			tabelaRoupas.add(chapeuDois);
			tabelaRoupas.add(chapeuUm);
			tabelaRoupas.add(camisaTres);
			tabelaRoupas.add(camisaDois);
			tabelaRoupas.add(camisaUm);
			tabelaRoupas.add(calcaTres);
			tabelaRoupas.add(calcaDois);
			tabelaRoupas.add(calcaUm);
			tabelaRoupas.add(sapatoTres);
			tabelaRoupas.add(sapatoDois);
			tabelaRoupas.add(sapatoUm);
			
		}
		return instancia;
	}

	@Override
	public boolean inserir(Produto p) {
		tabelaRoupas.add(p);
		return true;
	}

	@Override
	public boolean alterar(Produto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Produto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Produto> list() {
		return tabelaRoupas;
	}
	
}
