package com.example.provapratica1.ui.listaFilmes;

import com.example.provapratica1.data.model.Filme;

import java.util.List;

public interface ListaFilmesContrato {

    interface ListaFilmesView {

        void mostrarFilmes( List<Filme> filmes );

        void mostraErro();

    }

    interface ListaFilmesPresenter {

        void obtemFilmes();

        void  destruirView();
    }

}
