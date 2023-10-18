package br.com.exemplo3.utils;

import java.util.Map;

import org.apache.commons.text.StringSubstitutor;

public record Filtro(String nome, String comparacao, Object valor) {

	public StringSubstitutor vars() {
		return new StringSubstitutor(Map.of(
			"nome", nome,
			"comparacao", comparacao
		));
	}
	
	public Object sqlValor() {
		if ("ILIKE".equals(comparacao))
			return "%"+valor.toString()+"%";
		else
			return valor;
	}
	
}
