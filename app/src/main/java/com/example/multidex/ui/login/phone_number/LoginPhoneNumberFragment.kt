package com.example.multidex.ui.login.phone_number

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.multidex.R
import com.example.multidex.databinding.LoginLayoutPhoneNumberBinding
import com.example.multidex.ui.login.shared_view_models.CountrySelectionViewModel


class LoginPhoneNumberFragment : Fragment() , View.OnClickListener {

    /* Get Number And pass it to the LoginFragmentStep2 */

    private lateinit var views : LoginLayoutPhoneNumberBinding

    private val countrySelectionViewModel: CountrySelectionViewModel
            by activityViewModels<CountrySelectionViewModel>()


    @SuppressLint("ShowToast")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        views = LoginLayoutPhoneNumberBinding.inflate(inflater, container, false)



        UiBehavior()

        return views.root
    }


    override fun onClick(v: View?) {
        when(v){
            views.gotoVerifycode -> {
                findNavController().navigate(R.id.action_loginFragmentStep1_to_loginFragmentStep2)
            }
            views.countrySelection -> {
                findNavController().navigate(R.id.action_loginFragmentStep1_to_countery_selection_dialog)
            }
            views.languageSelection -> {
                findNavController().navigate(R.id.action_loginFragmentStep1_to_language_selection_dialog)
            }
            views.privatePolicy -> {

            }
        }
    }


    fun UiBehavior(){
        views.number.addTextChangedListener {
            when(it!!.length){
                in 5..10 -> {
                    views.countryCodeContainer.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_blue)
                    views.numberContainer.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_blue)
                    views.gotoVerifycode.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_button_blue)
                    views.textView3.setTextColor(Color.parseColor("#6636D3"))
                }
                in 0..4 -> {
                    views.countryCodeContainer.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_default)
                    views.numberContainer.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_default)
                    views.gotoVerifycode.background = ContextCompat.getDrawable(requireContext()
                            , R.drawable.rounded_button)
                    views.textView3.setTextColor(Color.BLACK)

                }

            }
        }



        views.countryCode.addTextChangedListener{


        }

        views.gotoVerifycode.setOnClickListener(this)
        views.countrySelection.setOnClickListener(this)
        views.languageSelection.setOnClickListener(this)
        views.privatePolicy.setOnClickListener(this)

    }




}