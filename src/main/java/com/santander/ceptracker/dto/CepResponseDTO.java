package com.santander.ceptracker.dto;

public record CepResponseDTO(
    String cep,
    String logradouro,
    String bairro,
    String localidade,
    String uf
) {
}
