package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacao.web.fatec.api_fatec.entities.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
        private static final Logger logger = LoggerFactory.getLogger(ClienteController.class.getName());

    @PostMapping("/criarCliente")
    public String CriarCliente(@RequestBody Cliente cliente) {
        logger.info("Recebido JSON: Nome={}, Idade={}", cliente.getNome(), cliente.getIdade());
        return "O Cliente "+cliente.getNome()+ " de idade "+cliente.getIdade() + " residente no endereco" + " " + cliente.getRua() + " " + cliente.getBairro() + " " + cliente.getNumero() + " " + "foi criado";
    }
}