package com.santander.ceptracker.exception;

public class CepNotFoundException extends RuntimeException {
    public CepNotFoundException(String cep) {
	super("CEP não encontrado: " + cep);
    }
}