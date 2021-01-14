package com.example.provapratica1.data.network;

import com.example.provapratica1.data.network.response.FilmesResult;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FilmesService {

    //end point
    @GET("movie/popular")
    Call<FilmesResult> obterFilmesPopulares(@Query("api_key") String chaveApi );

}
