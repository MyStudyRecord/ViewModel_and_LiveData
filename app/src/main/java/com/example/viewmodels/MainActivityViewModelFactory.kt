package com.example.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ChallengeViewModel::class.java)){
            return ChallengeViewModel(startingTotal) as T
        }
        //예외 처리
        throw IllegalAccessException("Unknown View Model")
    }
}