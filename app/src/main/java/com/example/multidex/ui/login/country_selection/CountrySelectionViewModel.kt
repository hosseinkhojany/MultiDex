package com.example.multidex.ui.login.country_selection

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.*
import com.example.multidex.common.ViewModelDataEmitter
import com.example.multidex.ui.login.adapter.model.Country
import com.example.multidex.utils.COUNTRIES
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CountrySelectionViewModel: ViewModelDataEmitter(){

    val countryListLiveData: LiveData<List<Country>>
    private var countryFetchLiveData: MutableLiveData<String> = MutableLiveData("")

    init {
        countryListLiveData = countryFetchLiveData.switchMap {
            launchOnViewModelScope {
                queryExecute(it).asLiveData()
            }
        }
    }

    @MainThread
    fun realTimeSearch(query: String){
        countryFetchLiveData.value = query
    }

    @WorkerThread
    suspend fun queryExecute(query: String) = flow {

        var listSearch = mutableListOf<Country>()
        COUNTRIES.forEach { country ->

            if (country.country_code.contains(query)){
                listSearch.add(country)
            }
        }


        emit(listSearch as List<Country>)

    }.flowOn(Dispatchers.IO)

}