/**
 * 
 */
 	
	
 function validar(){
	let quantidadeG=pedido.grande.value
	let quantidadeM=pedido.media.value
	let quantidadeP=pedido.pequena.value
	let endereco=pedido.endereco.value
	
	if(quantidadeG ==="0" && quantidadeM ==="0" && quantidadeP==="0"){
		alert('Escolha a quantidade de marmitex em um dos campos')
		pedido.grande.focus()
		return false
	}else if(endereco ===""){
		alert('Endereço não informado')
		pedido.endereco.focus()
		return false
	}else{
		document.forms["pedido"].submit()
	}
}
function CalculaTotal(){
	let quantidadeG=pedido.grande.value
	let valorG=16*quantidadeG
	let quantidadeM=pedido.media.value
	let valorM=14*quantidadeM
	let quantidadeP=pedido.pequena.value
	let valorP=13*quantidadeP
	
	let quantidadeCCL=pedido.cocalata.value
	let valorCCL=4*quantidadeCCL
	let quantidadeCC2=pedido.coca2.value
	let valorCC2=11*quantidadeCC2
	let quantidadePaulista=pedido.paulistinha.value
	let valorPaulistinha=6*quantidadePaulista
	let taxa=pedido.taxa.value
	
	let TotalMarmita=parseInt(valorG)+parseInt(valorM)+parseInt(valorP)
	let TotalBebida=parseInt(valorCCL)+parseInt(valorCC2)+parseInt(valorPaulistinha)+parseInt(taxa)
	alert(parseInt(TotalMarmita)+parseInt(TotalBebida))
}