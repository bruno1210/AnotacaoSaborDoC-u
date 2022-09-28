package model;

public class RefriPaulistinha extends Bebidas{
		private double preco=6.00;
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
