package com.example.paging3sample.api

import com.example.paging3sample.model.RepoResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {

    @GET("search/repositories?sort=stars&q=Android")
    suspend fun searchRepos(@Query("page") page: Int, @Query("per_page") perPage: Int): RepoResponse

    companion object {
        private const val BASE_URL = "https://api.github.com/"

        fun create(): GitHubService {
            return Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(GitHubService::class.java)
        }
    }

}