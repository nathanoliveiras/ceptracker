package com.santander.ceptracker.service;

import com.santander.ceptracker.dto.CepResponseDTO;
import com.santander.ceptracker.exception.CepNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class CepClient {

    private final RestClient restClient;

    public CepResponseDTO buscarCep(String cep) {
	try {
	    CepResponseDTO response = restClient
			    .get()
			    .uri("https://viacep.com.br/ws/{cep}/json/", cep)
			    .retrieve()
			    .body(CepResponseDTO.class);

	    if (response == null || Boolean.TRUE.equals(response.erro())) {
		throw new CepNotFoundException(cep);
	    }

	    return response;

	} catch (HttpClientErrorException.BadRequest ex) {
	    throw new IllegalArgumentException("CEP inválido: " + cep);
	}
    }
}
