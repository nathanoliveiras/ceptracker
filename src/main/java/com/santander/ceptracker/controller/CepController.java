package com.santander.ceptracker.controller;

import com.santander.ceptracker.dto.CepResponseDTO;
import com.santander.ceptracker.entity.ConsultaLog;
import com.santander.ceptracker.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ceps")
@RequiredArgsConstructor
public class CepController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    public CepResponseDTO buscarCep(@PathVariable String cep) {
	return cepService.buscarCep(cep);
    }

    @GetMapping("/logs")
    public List<ConsultaLog> listarLogs() {
	return cepService.listarLogs();
    }
}
