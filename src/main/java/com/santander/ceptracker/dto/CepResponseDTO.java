package com.santander.ceptracker.dto;

import org.springframework.http.server.reactive.observation.ServerRequestObservationConvention;

public record CepResponseDTO(
		String cep,
		String logradouro,
		String bairro,
		String localidade,
		String uf,
		Boolean erro
) {
}
