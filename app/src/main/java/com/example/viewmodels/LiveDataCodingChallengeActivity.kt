package com.example.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.ActivityLiveDataCodingChallengeBinding

class LiveDataCodingChallengeActivity : AppCompatActivity() {
    lateinit var binding : ActivityLiveDataCodingChallengeBinding
    lateinit var viewModel : LiveDataCodingChallengeViewModel
    lateinit var viewModelFactory : LiveDataCodingChallengeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_live_data_coding_challenge)

//        viewModel = ViewModelProvider..get(LiveDataCodingChallengeViewModel::class.java)
        binding.lifecycleOwner = this

        viewModel.count.observe(this, Observer {
            binding.score.text = it.toString()
         })
        binding.click.setOnClickListener {
            viewModel.updateCount()
        }
    }
}