package br.edu.infnet.yahoo.financas.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "quoteResponse")
public class Finances {

	@JsonProperty(value = "result")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<FinancesDTO> quoteResponse = new ArrayList<FinancesDTO>();

	public List<FinancesDTO> getQuoteResponse() {
		return quoteResponse;
	}

	public void setQuoteResponse(List<FinancesDTO> quoteResponse) {
		this.quoteResponse = quoteResponse;
	}

	

	
	
}