package com.example.viewmodels.twoWayDataBinding22

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayDataBindingViewModel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "frank"
    }
}