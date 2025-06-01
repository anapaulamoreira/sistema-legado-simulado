package com.example.legado.controller;

import com.example.legado.model.DadoResponse;
import com.example.legado.service.SistemaLegadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class SistemaLegadoController {

    @Autowired
    private SistemaLegadoService sistemaLegadoService;

    @GetMapping("/slow-data")
    public ResponseEntity<DadoResponse> dadosLentos() {
        try {
            DadoResponse response = sistemaLegadoService.obterDadoComLatencia();
            return ResponseEntity.ok(response);
        } catch (InterruptedException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new DadoResponse("Erro ao simular latência"));
        }
    }

    @GetMapping("/unstable-data")
    public ResponseEntity<DadoResponse> dadosInstaveis() {
        try {
            DadoResponse response = sistemaLegadoService.obterDadoInstavel();
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new DadoResponse(e.getMessage()));
        }
    }

    @GetMapping("/normal-data")
    public ResponseEntity<DadoResponse> dadosNormais() {
        DadoResponse response = sistemaLegadoService.obterDadoNormal();
        return ResponseEntity.ok(response);
    }
}
