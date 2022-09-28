package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataPedido {
	private LocalDate dataHoje=LocalDate.now();
	private DateTimeFormatter dataformatada=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String dataH=dataHoje.format(dataformatada);
	
	public String getData() {
		return dataH;
	}
}
