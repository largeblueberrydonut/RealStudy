package com.laregebludberry.realstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laregebludberry.realstudy.databinding.ActivityAcceptBinding

class AcceptActivity : AppCompatActivity() {
    lateinit var binding: ActivityAcceptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcceptBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기본 완료 텍스트 설정
        binding.finishTexts.text = "Good Job!!"

        // 선택된 숫자 리스트를 받음
        val selectedNumbers = intent.getIntegerArrayListExtra("selectedNumbers")
        if (selectedNumbers != null && selectedNumbers.isNotEmpty()) {
            binding.textView.text = selectedNumbers.joinToString(", ") { it.toString() }
        } else {
            binding.textView.text = "No numbers selected"
        }


        binding.backButton.setOnClickListener {
            val intent = Intent(this, ChangeActivity::class.java)
            startActivity(intent)
        }
    }
}
