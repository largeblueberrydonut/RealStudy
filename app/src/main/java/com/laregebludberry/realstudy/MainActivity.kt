package com.laregebludberry.realstudy

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.laregebludberry.realstudy.databinding.ActivityChangeBinding
import com.laregebludberry.realstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ChangeButton.setOnClickListener{
            val intent:Intent = Intent(this,ChangeActivity::class.java)
            startActivity(intent)
        }
    }
}

