package com.example.provapratica1.ui.listaFilmes;

import com.example.provapratica1.data.mapper.FilmeMapper;
import com.example.provapratica1.data.model.Filme;
import com.example.provapratica1.data.network.ApiService;
import com.example.provapratica1.data.network.response.FilmesResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaFilmesPresenter implements ListaFilmesContrato.ListaFilmesPresenter {

    private ListaFilmesContrato.ListaFilmesView view;

    public ListaFilmesPresenter(ListaFilmesContrato.ListaFilmesView view) {
        this.view = view;
    }

    @Override
    public void obtemFilmes() {
        ApiService.getInstance()
                .obterFilmesPopulares("af0433008a720cff511626a9d0899a3a")
                .enqueue(new Callback<FilmesResult>() {
                    @Override
                    public void onResponse(Call<FilmesResult> call, Response<FilmesResult> response) {
                        if (response.isSuccessful()){
                            final List<Filme> listaFilmes = FilmeMapper
                                    .deResponseParaDominio(response.body().getResultadoFilmes());

                            view.mostrarFilmes(listaFilmes);
                        } else {
                            view.mostraErro();
                        }
                    }

                    @Override
                    public void onFailure(Call<FilmesResult> call, Throwable t) {
                        view.mostraErro();
                    }
                });

    }

    @Override
    public void destruirView() {
        this.view = null;
    }
}
