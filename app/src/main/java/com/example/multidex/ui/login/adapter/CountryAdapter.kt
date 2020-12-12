package com.example.multidex.ui.login.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.R
import com.example.multidex.databinding.CountryItemBinding
import com.example.multidex.ui.login.adapter.model.Country
import com.example.multidex.utils.COUNTRIES

class CountryAdapter(private val context: Context) :
    RecyclerView.Adapter<CountryAdapter.CountryAdapterViewHolder>() {

    private var countryList:MutableList<Country> = COUNTRIES as MutableList<Country>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapterViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = DataBindingUtil.inflate<CountryItemBinding>(inflater ,
        R.layout.country_item , parent , false)

        return CountryAdapterViewHolder(binding).apply {
            binding.root.setOnClickListener {

//                findNavController().navigate(R.id.action_loginFragmentStep1_to_countery_selection_dialog)

            }
        }
    }

    override fun onBindViewHolder(holder: CountryAdapterViewHolder, position: Int) {
        holder.binding.apply {
            country = countryList[position]
            imageView7.setImageBitmap(BitmapFactory.decodeResource(context.resources , countryList[position].flag))
            executePendingBindings()
        }
    }

    fun setListSearch(list: List<Country>) {
        countryList = mutableListOf()
        countryList.addAll(list)
        notifyDataSetChanged()
    }
    fun setListReset() {
        countryList = mutableListOf()
        countryList.addAll(COUNTRIES)
        notifyDataSetChanged()
    }

    override fun getItemCount() = countryList.size

    class CountryAdapterViewHolder(val binding: CountryItemBinding):
            RecyclerView.ViewHolder(binding.root)


}
