package com.example.provapratica1.ui.listaFilmes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.provapratica1.R;
import com.example.provapratica1.data.model.Filme;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListaFilmesAdapter extends RecyclerView.Adapter<ListaFilmesAdapter.ListaFilmesViewHolder> {

    private List<Filme> filmes;
    private static ItemFilmeClickListener itemFilmeClickListener;

    public ListaFilmesAdapter( ItemFilmeClickListener itemFilmeClickListener ){
        this.itemFilmeClickListener = itemFilmeClickListener;
        filmes = new ArrayList<>();
    }

    @NonNull
    @Override
    public ListaFilmesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_adapter_list_filmes, parent, false);

        return new ListaFilmesViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaFilmesViewHolder holder, int position) {
        holder.bind(filmes.get(position));

    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    static class ListaFilmesViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo;
        private ImageView imagePosterFilme;
        private Filme filme;

        public ListaFilmesViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            imagePosterFilme = itemView.findViewById(R.id.image_poster_filme);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemFilmeClickListener != null) {
                        itemFilmeClickListener.onItemFilmeClicado(filme);

                    }
                }
            });
        }

        public void bind (Filme filme){
            this.filme = filme;

            titulo.setText(filme.getTituloFilme());
            Picasso.get().load("https://image.tmdb.org/t/p/w342/" + filme.getCaminhoPoster() ).into(imagePosterFilme);;
        }

    }
    public void setFilmes(List<Filme> filmes){
        this.filmes = filmes;
        notifyDataSetChanged();
    }

    public interface ItemFilmeClickListener {
        void onItemFilmeClicado( Filme filme );
    }

}
