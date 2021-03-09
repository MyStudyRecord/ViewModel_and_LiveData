package com.example.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.ActivityCodingChallengeBinding

class CodingChallengeActivity : AppCompatActivity() {
    lateinit var binding: ActivityCodingChallengeBinding
    private lateinit var viewModel : ChallengeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coding_challenge)
        viewModel = ViewModelProvider(this).get(ChallengeViewModel::class.java)

        binding.score.text = viewModel.newScore().toString()
        binding.addBtn.setOnClickListener {
            viewModel.addScore(binding.number.text.toString().toInt())
            binding.score.text = viewModel.newScore().toString()

        }
    }
}