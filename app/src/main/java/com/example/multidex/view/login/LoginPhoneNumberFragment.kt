package com.example.multidex.view.login

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController
import com.example.multidex.R
import com.example.multidex.databinding.LoginLayoutCodeVerifyBinding
import com.example.multidex.databinding.LoginLayoutPhoneNumberBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class LoginPhoneNumberFragment : Fragment() {

    /* Get Number And pass it to the LoginFragmentStep2 */

    private lateinit var numberField: EditText
    private lateinit var language_selection : ConstraintLayout
    private lateinit var country_selection : ConstraintLayout

    private val viewmodel: ViewModelLogin by activityViewModels()
    private lateinit var views : LoginLayoutPhoneNumberBinding





    @SuppressLint("ShowToast")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        views = LoginLayoutPhoneNumberBinding.inflate(inflater , container , false)


        selectionsInit()





        return views.root
    }


    fun selectionsInit(){
        views.countrySelection.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragmentStep1_to_countery_selection_dialog)
        }
        views.languageSelection.setOnClickListener {
            findNavController().navigate(LoginPhoneNumberFragmentDirections.
            actionLoginFragmentStep1ToLanguageSelectionDialog())
        }
    }




}