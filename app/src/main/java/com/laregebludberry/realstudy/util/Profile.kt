package com.laregebludberry.realstudy.util

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.laregebludberry.realstudy.MainActivity
import com.laregebludberry.realstudy.databinding.ProfileBinding

class Profile : AppCompatActivity() {

    private lateinit var binding: ProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Mario.setOnClickListener {

            Toast.makeText(this, "마리오를 클릭하셨습니다!", Toast.LENGTH_SHORT).show()


            binding.helloMario.text = "안녕하세요, 저는 클릭된 마리오입니다!"
        }


        binding.numberTextView.setOnClickListener {

            val currentNumber = binding.numberTextView.text.toString().toInt()
            val newNumber = currentNumber + 1
            binding.numberTextView.text = newNumber.toString()
        }


        binding.OldMario.setOnClickListener {

            binding.OldMario.text = "저는 사실 30살입니다!"
        }
        binding.goHomeButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
