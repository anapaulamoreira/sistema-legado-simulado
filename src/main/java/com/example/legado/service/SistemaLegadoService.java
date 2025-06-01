package com.example.legado.service;

import com.example.legado.model.DadoResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SistemaLegadoService {

    private final Random random = new Random();

    public DadoResponse obterDadoComLatencia() throws InterruptedException {
        Thread.sleep(3000); // Simula latência
        return new DadoResponse("Resposta com latência");
    }

    public DadoResponse obterDadoInstavel() {
        if (random.nextBoolean()) {
            throw new RuntimeException("Erro interno simulado");
        }
        return new DadoResponse("Resposta estável (desta vez)");
    }

    public DadoResponse obterDadoNormal() {
        return new DadoResponse("Resposta rápida e sem falhas");
    }
}
