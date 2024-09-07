package com.laregebludberry.realstudy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.laregebludberry.realstudy.databinding.ActivityAcceptBinding
import com.laregebludberry.realstudy.databinding.ActivityChangeBinding

class AcceptActivity : AppCompatActivity() {
    lateinit var binding:ActivityAcceptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcceptBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.finishTexts.text = "Good Job!!"

    }
}