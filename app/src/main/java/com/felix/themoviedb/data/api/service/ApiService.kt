package com.felix.themoviedb.data.api.service

import com.felix.themoviedb.data.api.model.get_now_playing.GetNowPlayingResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(): Response<GetNowPlayingResponse>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(): Response<GetNowPlayingResponse>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(): Response<GetNowPlayingResponse>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetail(@Path("movie_id")movieid: Int): Response<GetNowPlayingResponse>

    @GET("tv/latest")
    suspend fun getLatestTv(): Response<GetNowPlayingResponse>

    @GET("tv/{tv_id}")
    suspend fun getTvDetail(@Path("tv_id")tvId: Int): Response<GetNowPlayingResponse>
}