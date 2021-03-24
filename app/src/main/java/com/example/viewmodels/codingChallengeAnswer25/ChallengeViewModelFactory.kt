package com.example.viewmodels.codingChallengeAnswer25

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.ChallengeViewModel

class ChallengeViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(com.example.viewmodels.codingChallengeAnswer25.ChallengeViewModel::class.java)){
            return ChallengeViewModel(startingTotal) as T
        }
        //예외 처리
        throw IllegalAccessException("Unknown View Model")
    }
}