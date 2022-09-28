package model;

public class MarmitexMedia extends Marmitex{
	private double preco=14.00;
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
