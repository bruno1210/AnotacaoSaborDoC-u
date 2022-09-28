<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Anotação de Pedido</title>
<link rel="icon" href="imagens/favicongarfo.png">
<link rel="stylesheet" href="estilo.css">
</head>
<body>
	<div class="menu"></div>
	<div class="corpo">
		<div class="cadastropedido">
			<form name="pedido" action="salvandoP">

				<h1 class="cabecalho">Cadastro De Pedidos</h1>
				<h2 class="cabecalho">Marmitex:</h2>
				<div class="itens">
					<h4>Grande</h4>
					<select name="grande" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
					</select>
				</div>
				<div class="itens">
					<h4>Média</h4>
					<select name="media" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
					</select>
				</div>
				<div class="itens">
					<h4>Pequena</h4>
					<select name="pequena" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
					</select>
				</div>
				<h2 class="cabecalho">Bebidas:</h2>
				<div class="itens">
					<h4>Coca-cola Lata</h4>
					<select name="cocalata" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<div class="itens">
					<h4>Coca-cola 2litros</h4>
					<select name="coca2" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<div class="itens">
					<h4>Refri Paulistinha</h4>
					<select name="paulistinha" class="quantidade">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<h2 class="cabecalho">Outros:</h2>
				<div class="itens">
					<h4>Endereço:</h4>
					<input type="text" name="endereco" size="40">
				</div>
				<div class="itens">
					<h4>Taxa:</h4>
					<select name="taxa" class="quantidade">
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<div class="total">
					<div>
						<h3>Total:</h3>
					</div>
					<div>
						<input type="button" value="CADASTRAR" class="botao1"
							onclick="validar()"> <input type="button"
							value="CALCULAR" class="botao1" onclick="CalculaTotal()">
					</div>
				</div>
			</form>
		</div>
		<div class="cadastrook"></div>
	</div>
	<script src="scripts/validador.js"></script>
</body>
</html>