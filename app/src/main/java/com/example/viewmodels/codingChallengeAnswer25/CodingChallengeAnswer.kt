package com.example.viewmodels.codingChallengeAnswer25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.R
import com.example.viewmodels.databinding.ActivityCodingChallengeAnswerBinding

class CodingChallengeAnswer : AppCompatActivity() {
    private lateinit var binding : ActivityCodingChallengeAnswerBinding
    private lateinit var viewModel : ChallengeViewModel
//    private lateinit var viewModelFactory : ChallengeViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coding_challenge_answer)
//        viewModelFactory = ChallengeViewModelFactory(10)
        viewModel = ViewModelProvider(this).get(ChallengeViewModel::class.java)

        binding.myViewModel = viewModel
        binding.lifecycleOwner = this

    }
}