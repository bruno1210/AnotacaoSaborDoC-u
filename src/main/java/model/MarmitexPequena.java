package model;

public class MarmitexPequena extends Marmitex{
	private double preco=13.00;
	private double valorT;

	@Override
	public double getValorT() {
		this.valorT=this.getPreco()*this.getQuantidade();
		return valorT;
	}
	public double getPreco() {
		return this.preco;
	}
}
