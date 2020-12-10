package com.example.multidex.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.multidex.databinding.LoginCountrySelectionFragmentDialogBinding
import com.example.multidex.view.login.adapter.CountryAdapter

class CountrySelectionDialog : Fragment() {

    lateinit var binding : LoginCountrySelectionFragmentDialogBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = LoginCountrySelectionFragmentDialogBinding.inflate(
                        inflater ,
                        container ,
                        false);

        binding.adapter = CountryAdapter()




        return binding.root
    }

}