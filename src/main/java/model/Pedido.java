package model;

public class Pedido {
	
	MarmitexGrande marmitexG;
	MarmitexMedia marmitexM;
	MarmitexPequena marmitexP;
	CocaCola cocalata;
	CocaGarrafa cocaGarrafa;
	RefriPaulistinha paulistinha;
	private String endereco;
	DataPedido dataH;
	private double taxaEntrega;
	private double precoTotal;
	
	public Pedido(MarmitexGrande marmitexg,MarmitexMedia marmitexm,MarmitexPequena marmitexp,CocaCola cocalata,CocaGarrafa cocaGarrafa,RefriPaulistinha paulistinha,DataPedido dataH) {
		this.marmitexG=marmitexg;
		this.marmitexM=marmitexm;
		this.marmitexP=marmitexp;
		this.cocalata=cocalata;
		this.cocaGarrafa=cocaGarrafa;
		this.paulistinha=paulistinha;
		this.dataH=dataH;
	}
	public void setPrecoTotal() {
		double totalM=this.marmitexG.getValorT()+this.marmitexM.getValorT()+this.marmitexP.getValorT();
		double totalB=this.cocaGarrafa.getValorT()+this.cocalata.getValorT()+this.getPaulistinha().getValorT();
		double precoTotal=totalM+totalB+this.getTaxaEntrega();
		this.precoTotal=precoTotal;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getTaxaEntrega() {
		return taxaEntrega;
	}
	public void setTaxaEntrega(double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	public DataPedido getDataPedido() {
		return dataH;
	}

	public void setDataPedido(DataPedido dataH) {
		this.dataH = dataH;
	}
	public void setMarmitexG(MarmitexGrande marmitexg) {
		this.marmitexG=marmitexg;
	}
	public void setMarmitexM(MarmitexMedia marmitexm) {
		this.marmitexM=marmitexm;
	}
	public void setMarmitexP(MarmitexPequena marmitexp) {
		this.marmitexP=marmitexp;
	}
	public MarmitexGrande getMarmitexG() {
		return this.marmitexG;
	}
	public MarmitexMedia getMarmitexM() {
		return this.marmitexM;
	}
	public MarmitexPequena getMarmitexP() {
		return this.marmitexP;
	}
	public void setCocaLata(CocaCola coca) {
		this.cocalata=coca;
	}
	public CocaCola getCocaLata() {
		return cocalata;
	}
	public void setCocaGarrafa(CocaGarrafa cocaGarrafa) {
		this.cocaGarrafa=cocaGarrafa;
	}
	public CocaGarrafa getCocaGarrafa() {
		return cocaGarrafa;
	}
	public void setPaulistinha(RefriPaulistinha paulistinha) {
		this.paulistinha=paulistinha;
	}
	public RefriPaulistinha getPaulistinha() {
		return paulistinha;
	}
}