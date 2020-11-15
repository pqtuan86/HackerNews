package com.pqt.hackernews.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.pqt.hackernews.domain.NewsItem
import com.pqt.hackernews.repository.NewsRepository
import java.lang.IllegalArgumentException

class TopNewsModel(application: Application
       /*,private val newsRepository: NewsRepository*/) : AndroidViewModel(application) {

    val TAG = TopNewsModel::class.java.toString()
    init {
        Log.i(TAG, "TopNewsModel created")
    }

    private val _topNewsLiveData = MutableLiveData<NewsItem>()
    val topNewsLiveData: LiveData<NewsItem>
        get() = _topNewsLiveData

    // Fetch the list of top news
    fun fetchTopNews() {
        _topNewsLiveData.postValue(null)
        // invoke the function from newsRepository
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "TopNewsModel cleared")
    }

    class Factory(private val application: Application/*, private val newsRepository: NewsRepository*/) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(TopNewsModel::class.java)) {
                return TopNewsModel(application = application/*, newsRepository = newsRepository*/) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }

    }
}