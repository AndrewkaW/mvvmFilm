package com.practicum.filmssearch.presentation.poster


class PosterPresenter(private val posterView: PosterView, private  val urlImg : String) {


    fun onCreate() {
        posterView.showPoster(urlImg)
    }
}