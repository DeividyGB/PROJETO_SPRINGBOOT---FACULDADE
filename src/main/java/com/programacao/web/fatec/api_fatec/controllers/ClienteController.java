package com.programacao.web.fatec.api_fatec.controllers;

import com.programacao.web.fatec.api_fatec.entities.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    private static final Logger logger = LoggerFactory.getLogger(ClienteController.class.getName());

    private final List<Cliente> clientes = new ArrayList<>();
    private Long idCount = 1L;

    @PostMapping("/criarCliente")
    public String CriarCliente(@RequestBody Cliente cliente) {
        cliente.setId(idCount++);
        clientes.add(cliente);

        logger.info("Recebido JSON: Nome={}, Idade={}", cliente.getNome(), cliente.getIdade());
        return "O Cliente "+cliente.getNome()+ " de idade "+cliente.getIdade() + " residente no endereco" + " " + cliente.getRua() + " " + cliente.getBairro() + " " + cliente.getNumero() + " " + "foi criado";
    }

    @GetMapping("/listarClientes")
    public List<Cliente> ListarCLientes() {
        return clientes;
    }

    @DeleteMapping("/deletarCliente/{id}")
public List<Cliente> deleteCliente(@PathVariable long id) {
    for (int i = 0; i < clientes.size(); i++) {
        if (clientes.get(i).getId().equals(id)) {
            clientes.remove(i);
            break;
        }
    }
    return clientes;
}

}