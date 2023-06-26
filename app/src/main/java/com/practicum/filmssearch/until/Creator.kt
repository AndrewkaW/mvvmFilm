package com.practicum.filmssearch.until

import android.content.Context
import com.practicum.filmssearch.data.LocalStorage
import com.practicum.filmssearch.data.MoviesRepositoryImpl
import com.practicum.filmssearch.data.network.RetrofitNetworkClient
import com.practicum.filmssearch.domain.api.MoviesInteractor
import com.practicum.filmssearch.domain.api.MoviesRepository
import com.practicum.filmssearch.domain.impl.MoviesInteractorImpl
import com.practicum.filmssearch.presentation.movies.MoviesSearchViewModel
import com.practicum.filmssearch.presentation.poster.PosterPresenter
import com.practicum.filmssearch.presentation.poster.PosterView

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(
            RetrofitNetworkClient(context),
            LocalStorage(context.getSharedPreferences("local_storage", Context.MODE_PRIVATE)),
        )
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun providePosterPresenter(posterView: PosterView, urlImg : String,): PosterPresenter {
        return PosterPresenter(posterView, urlImg)
    }
}