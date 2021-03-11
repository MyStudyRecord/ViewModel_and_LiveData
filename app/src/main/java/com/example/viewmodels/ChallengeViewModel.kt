package com.example.viewmodels

import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodels.databinding.ActivityCodingChallengeBinding

class ChallengeViewModel(startingTotal : Int) :ViewModel(){
    //메인엑티비티에서 관찰하기 때문에 private를 쓰면 안된다
    //따라서 캡슐화를 한다
    //객체지향의 4대 특성중 하나 (캡슐화)
    //4대 : 추상화, 캡슐화, 상속, 다형성
    //MutableLiveData는 읽기 쓰기 가능
    //LiveData는 읽기만 가능
    private var score =MutableLiveData<Int>()
    val scoreData : LiveData<Int>
    get() = score

    init{
        score.value = startingTotal
    }

    fun addScore(plus:Int){
        score.value = (score.value)?.plus(plus)
    }

}