package com.santander.ceptracker.service;

import com.santander.ceptracker.dto.CepResponseDTO;
import com.santander.ceptracker.entity.ConsultaLog;
import com.santander.ceptracker.repository.ConsultaLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CepService {

    private final CepClient cepClient;

    private final ConsultaLogRepository logRepository;

    public CepResponseDTO buscarCep(String cep) {
	CepResponseDTO response = cepClient.buscarCep(cep);

	ConsultaLog log = new ConsultaLog();
	log.setCep(cep);
	log.setDataHora(LocalDateTime.now());
	log.setRespostaApi(response.toString());

	logRepository.save(log);

	return response;
    }

    public List<ConsultaLog> listarLogs() {
	return logRepository.findAll();
    }
}
