package com.example.multidex.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.multidex.R

class CountrySelectionDialog : Fragment() {

    lateinit var parentView : View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        parentView = inflater.inflate(R.layout.login_country_selection_fragment_dialog , container , false);


        return parentView
    }

}