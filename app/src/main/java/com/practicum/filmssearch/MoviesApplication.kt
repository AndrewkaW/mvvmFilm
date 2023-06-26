package com.practicum.filmssearch

import android.app.Application
import com.practicum.filmssearch.presentation.movies.MoviesSearchViewModel

class MoviesApplication : Application() {

    var moviesSearchPresenter : MoviesSearchViewModel? = null

}