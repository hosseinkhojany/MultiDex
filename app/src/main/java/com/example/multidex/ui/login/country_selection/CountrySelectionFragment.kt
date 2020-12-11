package com.example.multidex.ui.login.country_selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.multidex.databinding.LoginCountrySelectionFragmentBinding
import com.example.multidex.ui.login.adapter.CountryAdapter
import com.example.multidex.ui.login.adapter.model.Country
import com.example.multidex.utils.COUNTRIES
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class CountrySelectionFragment : Fragment() {

    lateinit var binding : LoginCountrySelectionFragmentBinding
    private val countrySelectionViewModel: CountrySelectionViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = LoginCountrySelectionFragmentBinding.inflate(
                        inflater ,
                        container ,
                        false);

        binding.adapter = CountryAdapter(requireContext())


        binding.countyText.addTextChangedListener {
            countrySelectionViewModel.realTimeSearch(it.toString())
        }



        return binding.root
    }

}