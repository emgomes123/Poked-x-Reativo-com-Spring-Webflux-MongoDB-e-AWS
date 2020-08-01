package com.emgomes.pokedex.repository;

import com.emgomes.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon,String >{
}
