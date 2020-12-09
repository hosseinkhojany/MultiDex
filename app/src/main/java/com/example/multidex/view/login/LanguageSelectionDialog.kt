package com.example.multidex.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.multidex.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class LanguageSelectionDialog : BottomSheetDialogFragment() {

    lateinit var parentView : View


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        parentView = inflater.inflate(R.layout.login_language_selection_fragment_dialog , container , false);


        return parentView
    }

}