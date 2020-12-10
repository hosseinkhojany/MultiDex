package com.example.multidex.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.multidex.databinding.LoginCountrySelectionFragmentBinding
import com.example.multidex.view.login.adapter.CountryAdapter

class CountrySelectionFragment : Fragment() {

    lateinit var binding : LoginCountrySelectionFragmentBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = LoginCountrySelectionFragmentBinding.inflate(
                        inflater ,
                        container ,
                        false);

        binding.adapter = CountryAdapter()




        return binding.root
    }

}