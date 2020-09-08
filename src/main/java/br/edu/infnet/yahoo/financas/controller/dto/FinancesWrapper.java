package br.edu.infnet.yahoo.financas.controller.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class FinancesWrapper {

	@JsonProperty(value = "quoteResponse")
	private Finances finances;
	
	public FinancesWrapper() {
		// TODO Auto-generated constructor stub
	}

	public FinancesWrapper(Finances finances) {
		super();
		this.finances = finances;
	}

	public Finances getFinances() {
		return finances;
	}

	public void setFinances(Finances finances) {
		this.finances = finances;
	}
	
	
	
}
