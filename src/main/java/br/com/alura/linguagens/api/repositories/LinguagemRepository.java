package br.com.alura.linguagens.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.linguagens.api.entities.Linguagem;

public interface LinguagemRepository extends MongoRepository<Linguagem, String> {

}
