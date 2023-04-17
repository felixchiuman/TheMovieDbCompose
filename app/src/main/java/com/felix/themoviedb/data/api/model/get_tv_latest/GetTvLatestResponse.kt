package com.felix.themoviedb.data.api.model.get_tv_latest


import com.google.gson.annotations.SerializedName

data class GetTvLatestResponse(
    @SerializedName("backdrop_path")
    val backdropPath: Any,
    @SerializedName("created_by")
    val createdBy: List<Any>,
    @SerializedName("episode_run_time")
    val episodeRunTime: List<Int>,
    @SerializedName("first_air_date")
    val firstAirDate: String,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("homepage")
    val homepage: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("in_production")
    val inProduction: Boolean,
    @SerializedName("languages")
    val languages: List<String>,
    @SerializedName("last_air_date")
    val lastAirDate: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("networks")
    val networks: List<Network>,
    @SerializedName("number_of_episodes")
    val numberOfEpisodes: Int,
    @SerializedName("number_of_seasons")
    val numberOfSeasons: Int,
    @SerializedName("origin_country")
    val originCountry: List<String>,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_name")
    val originalName: String,
    @SerializedName("overview")
    val overview: Any,
    @SerializedName("popularity")
    val popularity: Int,
    @SerializedName("poster_path")
    val posterPath: Any,
    @SerializedName("production_companies")
    val productionCompanies: List<Any>,
    @SerializedName("seasons")
    val seasons: List<Season>,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("vote_average")
    val voteAverage: Int,
    @SerializedName("vote_count")
    val voteCount: Int
) {
    data class Genre(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String
    )

    data class Network(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String
    )

    data class Season(
        @SerializedName("air_date")
        val airDate: String,
        @SerializedName("episode_count")
        val episodeCount: Int,
        @SerializedName("id")
        val id: Int,
        @SerializedName("poster_path")
        val posterPath: Any,
        @SerializedName("season_number")
        val seasonNumber: Int
    )
}