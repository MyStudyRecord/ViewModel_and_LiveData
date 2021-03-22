package com.example.viewmodels.twoWayDataBinding22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodels.R
import com.example.viewmodels.databinding.ActivityTwoWayDemo1Binding

class TwoWayDemo1 : AppCompatActivity() {
    private lateinit var binding : ActivityTwoWayDemo1Binding
    private lateinit var viewModel : TwoWayDataBindingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_two_way_demo1)
        viewModel = ViewModelProvider(this).get(TwoWayDataBindingViewModel::class.java)

        //구성된 뷰 모델 객체를 레이아웃에 대해 정의한 뷰 모델 객체에 할당
        binding.viewModel = viewModel

        binding.lifecycleOwner = this

    }
}