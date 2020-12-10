package com.example.multidex.view.login.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.R
import com.example.multidex.view.login.adapter.model.Country
import com.example.multidex.databinding.CountryItemBinding
import com.example.multidex.utils.CountryList

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.CountryAdapterViewHolder>() {

    val countryList:List<Country> = CountryList.COUNTRIES()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<CountryItemBinding>(inflater ,
        R.layout.country_item , parent , false)

        return CountryAdapterViewHolder(binding).apply {
            binding.root.setOnClickListener {
                Toast.makeText(parent.context, "Toast", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: CountryAdapterViewHolder, position: Int) {
        holder.binding.apply {
            country = countryList[position]
            executePendingBindings()
        }
    }

    override fun getItemCount() = countryList.size

    class CountryAdapterViewHolder(val binding: CountryItemBinding):
            RecyclerView.ViewHolder(binding.root)


}