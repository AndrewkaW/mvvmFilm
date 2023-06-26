package com.practicum.filmssearch.domain.api

import com.practicum.filmssearch.domain.models.Movie
import com.practicum.filmssearch.until.Resource

interface MoviesRepository {
    fun searchMovies (exception: String) : Resource<List<Movie>>
    fun addMovieToFavorites(movie: Movie)
    fun removeMovieFromFavorites(movie: Movie)
}