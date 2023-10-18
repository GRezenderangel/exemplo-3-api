package br.com.exemplo3.time;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class TimeAdapter {

	public Time toEntity(TimeRequest req, Time entity) {
		return entity
			.setNome(req.getNome())
			.setAnoDeFundacao(req.getAnoDeFundacao())
			.setEstado(req.getEstado())
			.setCidade(req.getCidade());
	}
	
	public Time toEntity(TimeRequest req) {
		return toEntity(req, new Time().setId(UUID.randomUUID()));
	}
	
}
