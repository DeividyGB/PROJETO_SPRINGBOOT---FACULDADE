package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class controller {

    @GetMapping("{name}")
    public String HelloWorld(@PathVariable String name){
        return name;
    }

    @GetMapping("/getIdade{idade}")
    public String retornaIdade(@PathVariable Integer idade){
        try {
            if(idade < 0){
                throw new NumberFormatException();
            } else if (idade < 12) {
                return "Criança";
            } else if (idade <= 18) {
                return "Adolescente";
            } else {
                return "veio";
            }

        } catch (NumberFormatException e) {
            return "Resposta invalida";
        }
    }

    @GetMapping("/verificaNumero{numero}")
    public String retornaParImpar(@PathVariable Integer numero){
        try {
            if(numero % 2 == 0){
                return "O numero " + numero + " é par";
            } else {
                return "O numero " + numero + " é impar";
            }
    
        } catch (Exception e) {
           return "valor invalido";
        }
    }

    @GetMapping("/calculadoraIMC/{peso}/{altura}")
public String retornaIMC(@PathVariable Integer peso, @PathVariable Integer altura) {
    try {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser valores positivos.");
        }

        double alturaInMetros = altura / 100.0;
        double imcValue = peso / Math.pow(alturaInMetros, 2);
        
        if (imcValue < 18.5) {
            return "Abaixo do peso";
        } else if (imcValue >= 18.5 && imcValue < 24.9) {
            return "Peso normal";
        } else if (imcValue >= 25 && imcValue < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
        
    } catch (IllegalArgumentException e) {
        return "Erro: " + e.getMessage();
        
    } catch (Exception e) {
        return "Erro inesperado: " + e.getMessage();
    }
}

    
}
