package br.com.futebol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.futebol.model.Jogador;

public interface JogadorRepository extends MongoRepository<Jogador, String> {

}
