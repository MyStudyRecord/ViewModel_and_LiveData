package com.example.viewmodels

import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.example.viewmodels.databinding.ActivityCodingChallengeBinding

class ChallengeViewModel(startingTotal : Int) :ViewModel(){
    private var score =0

    init{
        score = startingTotal
    }

    fun newScore():Int{
        return score
    }
    fun addScore(plus:Int){
        score+=plus
    }

}