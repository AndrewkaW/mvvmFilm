package com.practicum.filmssearch.data.network

import com.practicum.filmssearch.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/k_8lv89b4l/{expression}")
    fun searchMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}