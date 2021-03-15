package com.example.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataCodingChallengeViewModel : ViewModel() {
    var count = MutableLiveData<Int>()
    init {
        count.value = 0
    }
    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }
}