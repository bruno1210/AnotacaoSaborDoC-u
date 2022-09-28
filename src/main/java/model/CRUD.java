package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class CRUD {
	/** Metodo de Conexão **/
	private String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/bancopedidos?useTimezone=true?serverTimezone=UTC";
	private String user="root";
	private String senha="cremosa1234";
	
	private Connection conectar() {
		Connection conexao=null;
		try {
			Class.forName(driver);
			conexao=DriverManager.getConnection(url,user,senha);
			return conexao;
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

	public void inserirPedido(Pedido pedido) {
		String criar = "insert into pedidos (marmitexG,marmitexM,marmitexP,cocaL,cocaG,refriP,endereco,taxaE,total,data) values (?,?,?,?,?,?,?,?,?,?)";

		try {
			Connection conexao = conectar();
			PreparedStatement pst = conexao.prepareStatement(criar);
			pst.setInt(1,pedido.getMarmitexG().getQuantidade());
			pst.setInt(2,pedido.getMarmitexM().getQuantidade());
			pst.setInt(3,pedido.getMarmitexP().getQuantidade());
			pst.setInt(4,pedido.getCocaLata().getQuantidade());
			pst.setInt(5,pedido.getCocaGarrafa().getQuantidade());
			pst.setInt(6,pedido.getPaulistinha().getQuantidade());
			pst.setString(7,pedido.getEndereco());
			pst.setDouble(8,pedido.getTaxaEntrega());
			pst.setDouble(9,pedido.getPrecoTotal());
			pst.setString(10,pedido.getDataPedido().getData());
			pst.executeUpdate();
			conexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
