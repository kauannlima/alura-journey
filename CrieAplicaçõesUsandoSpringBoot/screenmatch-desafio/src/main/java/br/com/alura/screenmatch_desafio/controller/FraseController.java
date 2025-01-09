package br.com.alura.screenmatch_desafio.controller;

import br.com.alura.screenmatch_desafio.dto.FraseDTO;
import br.com.alura.screenmatch_desafio.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO obterFrasesDTO(){
        return fraseService.obterFrase();
    }
}
