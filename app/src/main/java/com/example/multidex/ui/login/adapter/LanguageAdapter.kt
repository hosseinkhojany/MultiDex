package com.example.multidex.ui.login.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.R
import com.example.multidex.databinding.LanguageItemBinding
import com.example.multidex.ui.login.adapter.model.Language
import com.example.multidex.utils.LANGUAGES

class LanguageAdapter : RecyclerView.Adapter<LanguageAdapter.LanguageAdapterViewHolder>() {

    //list language
    val languages:List<Language> = LANGUAGES

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            LanguageAdapterViewHolder {


        val inflater = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<LanguageItemBinding>(inflater ,
                R.layout.language_item , parent , false)

        return LanguageAdapterViewHolder(binding).apply {
            binding.root.setOnClickListener {
                Toast.makeText(parent.context, "Toast", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: LanguageAdapterViewHolder, position: Int) {
        holder.binding.language = languages[position]
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = languages.size

    class LanguageAdapterViewHolder(val binding: LanguageItemBinding):
            RecyclerView.ViewHolder(binding.root)


} 