package com.example.paging3sample

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.paging3sample.api.GitHubService
import com.example.paging3sample.model.Repo
import kotlinx.coroutines.flow.Flow

object Repository {

    private const val PAGE_SIZE = 50

    private val gitHubService = GitHubService.create()

    fun getPagingData(): Flow<PagingData<Repo>> {
        return Pager(
            config = PagingConfig(PAGE_SIZE),
            pagingSourceFactory = { RepoPagingSource(gitHubService) }
        ).flow
    }

}