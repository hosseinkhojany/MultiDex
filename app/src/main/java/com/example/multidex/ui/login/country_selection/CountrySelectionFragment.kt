package com.example.multidex.ui.login.country_selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.multidex.R
import com.example.multidex.databinding.LoginCountrySelectionFragmentBinding
import com.example.multidex.ui.login.adapter.CountryAdapter
import com.example.multidex.ui.login.shared_view_models.CountrySelectionViewModel

class CountrySelectionFragment : Fragment() {

    lateinit var binding : LoginCountrySelectionFragmentBinding
    private val countrySelectionViewModel: CountrySelectionViewModel
    by activityViewModels<CountrySelectionViewModel>()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(
                        inflater ,
                        R.layout.login_country_selection_fragment,
                        container ,
                        false);

        binding.adapter = CountryAdapter(requireContext())


        //text changed change observable
        binding.countyText.addTextChangedListener {
            if (!it.isNullOrEmpty()){
                countrySelectionViewModel.realTimeSearch(it.toString())
            }else{
                (binding.adapter as CountryAdapter).setListReset()
            }
        }

        //observable change submit value from emitter
        countrySelectionViewModel.countryListLiveData.observe(requireActivity() ,{
            (binding.countrys.adapter as CountryAdapter).setListSearch(it)
            binding.countrys.postDelayed({binding.countrys.scrollToPosition(0)} ,200)
        })



        return binding.root
    }

}