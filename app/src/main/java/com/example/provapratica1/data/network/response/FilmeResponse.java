package com.example.provapratica1.data.network.response;

import com.squareup.moshi.Json;

public class FilmeResponse {

    @Json(name = "poster_path")
    private final String caminhoPoster;

    @Json(name = "overview")
    private final String sinopse;

    @Json(name = "release_date")
    private final String anoLancamento;

    @Json(name = "original_title")
    private final String tituloOriginal;

    @Json(name = "original_language")
    private final String linguagem;

    public FilmeResponse(String caminhoPoster, String sinopse, String tituloOriginal, String anoLancamento, String linguagem) {
        this.caminhoPoster = caminhoPoster;
        this.sinopse = sinopse;
        this.tituloOriginal = tituloOriginal;
        this.anoLancamento = anoLancamento;
        this.linguagem = linguagem;
    }

    public String getCaminhoPoster() {
        return caminhoPoster;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public String getLinguagem() {
        return linguagem;
    }
}
