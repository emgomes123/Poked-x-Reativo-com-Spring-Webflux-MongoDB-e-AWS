package com.emgomes.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class TestMono {
     //Caso os methodos retornem vazios
    @Test
    public  void testMono1(){

        Mono<String> mono = Mono.empty();
    }
    //esperando o retorno de um pokemon
    @Test
    public  void testMono2(){
        Mono<String> mono=Mono.just("");
        mono.subscribe(System.out::println);
    }
    //esperando um integer
    @Test
    public  void testMono3(){
        Mono<Integer> mono =Mono.just(10);
        mono.subscribe(System.out::println);


    }
    //tratando uma exeção em Runtime

    @Test
    public  void testMono4(){
        Mono<String> mono = Mono.error(new RuntimeException("Ocorreu uma exeção"));

    }

}
