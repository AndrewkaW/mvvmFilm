package com.practicum.filmssearch.domain.api

import com.practicum.filmssearch.domain.models.Movie

interface MoviesInteractor {
    fun searchMovies(expression: String, consumer: MoviesConsumer)

    fun addMovieToFavorites(movie: Movie)

    fun removeMovieFromFavorites(movie: Movie)

    interface MoviesConsumer {
        fun consume(foundMovies: List<Movie>?, errorMassage: String?)
    }

}