package com.example.multidex.ui.login.language_selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.multidex.R
import com.example.multidex.databinding.LoginLanguageSelectionFragmentDialogBinding
import com.example.multidex.ui.login.adapter.LanguageAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class LanguageSelectionDialog : BottomSheetDialogFragment() {

    lateinit var binding: LoginLanguageSelectionFragmentDialogBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater ,
            R.layout.login_language_selection_fragment_dialog, container , false)



        binding.adapter = LanguageAdapter()


        return binding.root
    }

}