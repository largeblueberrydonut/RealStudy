package com.laregebludberry.realstudy.util

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laregebludberry.realstudy.MainActivity
import com.laregebludberry.realstudy.databinding.ActivityViewPagerBinding

class MyViewPager : AppCompatActivity() {

    // binding 초기화
    lateinit var binding: ActivityViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding을 사용해 레이아웃 설정
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ViewPager2와 프래그먼트 어댑터 설정
        val adapter = ViewPagerAdapter(this)
        binding.MyViewPager2.adapter = adapter

        // goback 버튼 클릭 리스너 설정
        binding.goback.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
