package com.example.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
    val scoreData : LiveData<Int>
        get() = count

    init {
        count.value = 0
    }
    fun getCurrentCount() : Int? {
        return count.value
    }

    fun getUpdatedCount() {
        count.value = count.value?.plus(1)
    }
}