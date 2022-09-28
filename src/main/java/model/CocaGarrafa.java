package model;

public class CocaGarrafa extends Bebidas{
		private double preco=11.00;
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
