package com.example.multidex.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.multidex.R
import com.example.multidex.databinding.LoginLanguageSelectionFragmentDialogBinding
import com.example.multidex.view.login.adapter.model.Language
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class LanguageSelectionDialog : BottomSheetDialogFragment() {

    lateinit var binding: LoginLanguageSelectionFragmentDialogBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = LoginLanguageSelectionFragmentDialogBinding.inflate(inflater , container , false)






        return binding.root
    }

}