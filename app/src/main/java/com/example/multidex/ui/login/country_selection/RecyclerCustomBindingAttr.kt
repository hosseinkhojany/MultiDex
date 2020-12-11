package com.example.multidex.ui.login.country_selection

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.ui.login.adapter.CountryAdapter
import com.example.multidex.ui.login.adapter.model.Country

@BindingAdapter("adapterSearchList")
fun bindAdapterSearchList(view: RecyclerView , countries: List<Country>){
    countries.let {
        (view.adapter as? CountryAdapter)?.setListSearch(it)
    }
}