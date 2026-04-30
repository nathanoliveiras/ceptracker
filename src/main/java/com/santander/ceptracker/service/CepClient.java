package com.santander.ceptracker.service;

import com.santander.ceptracker.dto.CepResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class CepClient {

    private final RestClient restClient;

    public CepResponseDTO buscarCep(String cep) {
	return restClient.get()
			.uri("https://viacep.com.br/ws/{cep}/json/", cep)
			.retrieve()
			.body(CepResponseDTO.class);
    }
}
