package com.example.provapratica1.data.model;

import java.io.Serializable;

public class Filme implements Serializable {

    private final String tituloFilme;
    private final String caminhoPoster;
    private final String sinopse;
    private final String anoLancamento;
    private final String genero;

    public Filme(String tituloFilme, String caminhoPoster, String sinopse, String anoLancamento, String genero) {
        this.tituloFilme    = tituloFilme;
        this.caminhoPoster  = caminhoPoster;
        this.sinopse        = sinopse;
        this.anoLancamento  = anoLancamento;
        this.genero         = genero;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public String getSinopse(){
        return sinopse;
    }

    public String getCaminhoPoster() {
        return caminhoPoster;
    }

    public String getAnoLancamento() { return anoLancamento; }

    public String getGenero() { return genero;}
}
