package com.example.multidex.view.login

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.multidex.R
import com.example.multidex.databinding.LoginLayoutCodeVerifyBinding

class LoginVerifyCodeFragment : Fragment() {

    /* Validate SMS code and Login */

    private val viewmodel: ViewModelLogin by activityViewModels()
    private lateinit var parentView: LoginLayoutCodeVerifyBinding


    @SuppressLint("ShowToast")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        parentView = DataBindingUtil.inflate(inflater ,R.layout.login_layout_code_verify
                , container , false)


        val timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                viewmodel.setCode(213123)
            }

            override fun onFinish() {}
        }
        timer.start()



        activity?.let {
            viewmodel.observableCode.observe(it, {



            })
        }


        return parentView.root
    }




}