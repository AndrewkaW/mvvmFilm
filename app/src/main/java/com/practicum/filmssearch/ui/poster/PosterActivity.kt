package com.practicum.filmssearch.ui.poster

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.practicum.filmssearch.until.Creator
import com.practicum.filmssearch.R
import com.practicum.filmssearch.presentation.poster.PosterPresenter
import com.practicum.filmssearch.presentation.poster.PosterView

class PosterActivity : Activity(), PosterView {

    lateinit var posterPresenter: PosterPresenter


    lateinit var poster : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poster)
        val urlImg = intent.extras?.getString("poster", "")?: ""
        posterPresenter = Creator.providePosterPresenter(this, urlImg)
        posterPresenter.onCreate()
        poster = findViewById(R.id.poster)

    }

    override fun showPoster(url: String) {
        Glide.with(this.applicationContext)
            .load(url)
            .into(poster)
    }
}