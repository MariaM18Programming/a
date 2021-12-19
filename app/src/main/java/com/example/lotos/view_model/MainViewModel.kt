package com.example.lotos.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lotos.model.Quotes
import com.example.lotos.retrofit.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel (private val repository : Repository) : ViewModel() {

    val quotesResponse : MutableLiveData<Response<Quotes>> = MutableLiveData()

    fun quotes() {
        viewModelScope.launch {
            val response = repository.quotes()
            quotesResponse.value = response
        }
    }

}