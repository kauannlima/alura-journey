package br.com.alura.screenmatch_desafio.service;

import br.com.alura.screenmatch_desafio.dto.FraseDTO;
import br.com.alura.screenmatch_desafio.model.Frase;
import br.com.alura.screenmatch_desafio.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFrase() {
        return converteDados(fraseRepository.buscaFraseAleatoria());
    }

    private FraseDTO converteDados(Frase frase) {
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
