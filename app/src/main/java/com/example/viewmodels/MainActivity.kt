package com.example.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //뷰 모델의 인스턴스를 사용하여 뷰 모델의 함수를 호출 가능
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        //데이터 바인딩에 개체를 할당하기 위해
        binding.myViewModel = viewModel

        viewModel.scoreData.observe(this, Observer {
            binding.countText.text = it.toString()
        })
        binding.countText.text = viewModel.getCurrentCount().toString()


    }
}