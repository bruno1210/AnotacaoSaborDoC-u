package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CRUD;
import model.CocaCola;
import model.CocaGarrafa;
import model.DataPedido;
import model.MarmitexGrande;
import model.MarmitexMedia;
import model.MarmitexPequena;
import model.Pedido;
import model.RefriPaulistinha;

@WebServlet(urlPatterns = { "/Controller", "/salvandoP", "/testando.html" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CRUD crud = new CRUD();
	MarmitexGrande marmitexG = new MarmitexGrande();
	MarmitexMedia marmitexM = new MarmitexMedia();
	MarmitexPequena marmitexP = new MarmitexPequena();
	RefriPaulistinha paulistinha = new RefriPaulistinha();
	CocaCola cocaLata = new CocaCola();
	CocaGarrafa cocaGarrafa = new CocaGarrafa();
	DataPedido dataH = new DataPedido();
	Pedido p1 = new Pedido(marmitexG, marmitexM, marmitexP, cocaLata, cocaGarrafa, paulistinha, dataH);

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/salvandoP")) {
			novoPedido(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}
	protected void lerPedidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	}

	protected void novoPedido(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		p1.getMarmitexG().setQuantidade(Integer.parseInt(request.getParameter("grande")));
		p1.getMarmitexM().setQuantidade(Integer.parseInt(request.getParameter("media")));
		p1.getMarmitexP().setQuantidade(Integer.parseInt(request.getParameter("pequena")));
		p1.getPaulistinha().setQuantidade(Integer.parseInt(request.getParameter("paulistinha")));
		p1.getCocaGarrafa().setQuantidade(Integer.parseInt(request.getParameter("coca2")));
		p1.getCocaLata().setQuantidade(Integer.parseInt(request.getParameter("cocalata")));
		p1.setEndereco(request.getParameter("endereco"));
		p1.setTaxaEntrega(Double.parseDouble(request.getParameter("taxa")));
		p1.setPrecoTotal();
		System.out.println(p1.getPrecoTotal());

		crud.inserirPedido(p1);
		response.sendRedirect("pedidos.jsp");

	}
}
