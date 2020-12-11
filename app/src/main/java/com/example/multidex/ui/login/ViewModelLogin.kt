package com.example.multidex.ui.login

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.MutableLiveData
import com.example.multidex.BR
import com.example.multidex.common.ViewModelDataEmitter
import com.example.multidex.data.network.AppNetworkClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject


class ViewModelLogin @Inject constructor(val networking: AppNetworkClient)
    : ViewModelDataEmitter() ,Observable{

    val observableCode = MutableLiveData<Long>(0)

    fun setCode(code: Long){
        observableCode.value = code
    }

    fun getCode(): Long?{
        return observableCode.value
    }

    class Code : BaseObservable() {

        @get:Bindable
        var code: String = ""
            set(value) {
                field = value
                notifyPropertyChanged(BR.code)
            }
    }

    fun onValidateClicked(){
        runBlocking(Dispatchers.IO){
            networking.login(getCode().toString()){

            }
        }
    }



    private val callbacks: PropertyChangeRegistry = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.remove(callback)
    }

    //notify a property has change
    fun notifyPropertyChanged(fieldId: Int) {
        callbacks.notifyCallbacks(this, fieldId, null)
    }

    //notify all instance of change
    fun notifyChange() {
        callbacks.notifyCallbacks(this, 0, null)
    }


}