package com.example.provapratica1.ui.detalhesFilme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.provapratica1.R;
import com.example.provapratica1.data.model.Filme;
import com.squareup.picasso.Picasso;

public class DetalhesFilmeActivity extends AppCompatActivity {

    public static final String EXTRA_FILME = "EXTRA_FILME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filme);

        final Filme filme = (Filme) getIntent().getSerializableExtra(EXTRA_FILME);

        ImageView posterFilme = findViewById(R.id.imagePosterFilme);
        Picasso.get().load("https://image.tmdb.org/t/p/w342/" + filme.getCaminhoPoster() ).into(posterFilme);

        TextView textTituloFilme = findViewById(R.id.textTitulo);
        textTituloFilme.setText(filme.getTituloFilme());

        TextView textSinopse = findViewById(R.id.textSinopse);
        textSinopse.setText(filme.getSinopse());

        TextView textAnoLancamento = findViewById(R.id.textAnoLancamento);
        textAnoLancamento.setText(filme.getAnoLancamento());

        TextView textGenero = findViewById(R.id.textLinguagem);
        textGenero.setText(filme.getGenero());
    }
}