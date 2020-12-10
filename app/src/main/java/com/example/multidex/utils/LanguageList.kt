package com.example.multidex.utils;

import com.example.multidex.view.login.adapter.model.Country
import com.example.multidex.R
import com.example.multidex.view.login.adapter.model.Language

class LanguageList{
    companion object{
        fun LANGUAGES(): List<Language> {
            return listOf<Language>(
                    Language("1"),
                    Language("2"),
                    Language("3"),
                    Language("4"),
                    Language("5")
            )
        }
    }
}