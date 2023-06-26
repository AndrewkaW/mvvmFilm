package com.practicum.filmssearch.data

import com.practicum.filmssearch.data.dto.Response

interface NetworkClient {
    fun doRequest(dto : Any) : Response
}