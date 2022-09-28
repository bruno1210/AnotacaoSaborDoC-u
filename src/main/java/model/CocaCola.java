package model;

public class CocaCola extends Bebidas{
	private final double preco=4.00;
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
