package com.example.paging3sample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.paging3sample.model.Repo
import kotlinx.coroutines.flow.Flow

class MainViewModel : ViewModel() {

    fun getPagingData(): Flow<PagingData<Repo>> {
        return Repository.getPagingData().cachedIn(viewModelScope)
    }

}