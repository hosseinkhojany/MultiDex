package com.example.multidex.ui.login.shared_view_models

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.*
import com.example.multidex.common.ViewModelDataEmitter
import com.example.multidex.ui.login.adapter.model.Country
import com.example.multidex.utils.COUNTRIES
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class CountrySelectionViewModel: ViewModelDataEmitter() {

    val countryListLiveData: LiveData<List<Country>>
    private var countryFetchLiveData = MutableLiveData<String>()

    init {
        countryListLiveData = countryFetchLiveData.switchMap {
            launchOnViewModelScope {
                queryExecute(it).asLiveData()
            }
        }

    }

    @MainThread
    fun realTimeSearch(query: String) {
        countryFetchLiveData.value = query
    }

    @WorkerThread
    suspend fun queryExecute(query: String) = flow {

        val listSearch = mutableListOf<Country>()
        //start with first load
        COUNTRIES.forEach { country ->

            if (country.country_name.startsWith(query, true) ||
                country.country_code.startsWith(query, true)
            ) {
                listSearch.add(country)
            }
        }
        //content with second load
        COUNTRIES.forEach { country ->
            if (country.country_name.contains(query, true) ||
                country.country_code.contains(query, true)
            ) {
                if (!listSearch.contains(country)) {
                    listSearch.add(country)
                }
            }
        }
        emit(listSearch as List<Country>)

    }.flowOn(Dispatchers.IO)

}