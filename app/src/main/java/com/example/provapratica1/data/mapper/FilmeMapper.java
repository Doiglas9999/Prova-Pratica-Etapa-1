package com.example.provapratica1.data.mapper;

import com.example.provapratica1.data.model.Filme;
import com.example.provapratica1.data.network.response.FilmeResponse;

import java.util.ArrayList;
import java.util.List;

//converte lista de filmes response em uma lista de filmes
public class FilmeMapper {
    public static List<Filme> deResponseParaDominio(List<FilmeResponse> listaFilmeResponse ){
        List<Filme> listaFilmes = new ArrayList<>();

        for ( FilmeResponse filmeResponse : listaFilmeResponse ){
            final Filme filme = new Filme(
                    filmeResponse.getTituloOriginal(),
                    filmeResponse.getCaminhoPoster(),
                    filmeResponse.getSinopse(),
                    filmeResponse.getAnoLancamento(),
                    filmeResponse.getLinguagem()
            );

            listaFilmes.add(filme);
        }
        return listaFilmes;
    }
}
