package com.example.multidex.view.login.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.R
import com.example.multidex.databinding.LanguageItemBinding
import com.example.multidex.utils.LanguageList
import com.example.multidex.view.login.adapter.model.Language

class ArrayAdapterr : RecyclerView.Adapter<ArrayAdapterr.ArrayAdapterrViewHolder>() {

    val languages: List<Language> = LanguageList.LANGUAGES()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrayAdapterrViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<LanguageItemBinding>(inflater ,
                R.layout.language_item , parent , false)

        return ArrayAdapterrViewHolder(binding).apply {
            binding.root.setOnClickListener {
                Toast.makeText(parent.context, "Toast", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: ArrayAdapterrViewHolder, position: Int) {
        holder.binding.language = languages[position]
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = languages.size

    class ArrayAdapterrViewHolder(val binding: LanguageItemBinding):
            RecyclerView.ViewHolder(binding.root)


} 