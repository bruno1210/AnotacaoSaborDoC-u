package model;

public abstract class Marmitex implements CalculaTotalP{
	private int quantidade;
	
	public void setQuantidade(int quantidade) {
		this.quantidade=quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
