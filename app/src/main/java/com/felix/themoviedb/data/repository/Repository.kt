package com.felix.themoviedb.data.repository

import com.felix.themoviedb.data.api.service.ApiService

class Repository(private val apiService: ApiService) {
    suspend fun getNowPlayingMovies() = apiService.getNowPlayingMovies()

    suspend fun getTopRatedMovies() = apiService.getTopRatedMovies()

    suspend fun getUpcomingMovies() = apiService.getUpcomingMovies()

    suspend fun getMovieDetail(movieid: Int) = apiService.getMovieDetail(movieid)

    suspend fun getLatestTv() = apiService.getLatestTv()

    suspend fun getTvDetail(tvId: Int) = apiService.getTvDetail(tvId)
}