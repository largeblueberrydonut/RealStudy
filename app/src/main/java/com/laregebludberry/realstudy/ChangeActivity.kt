package com.laregebludberry.realstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.laregebludberry.realstudy.databinding.ActivityChangeBinding


class ChangeActivity : AppCompatActivity() {
    lateinit var binding: ActivityChangeBinding
    lateinit var adapter: MyAdapter
    val numbers = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MyAdapter(numbers)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter


        binding.gobutton.setOnClickListener {
            val intent = Intent(this, AcceptActivity::class.java)
            startActivity(intent)
        }

        binding.add.setOnClickListener {
            val nextNumber = numbers.size + 1
            numbers.add(nextNumber)
            adapter.notifyItemInserted(numbers.size - 1)
        }

        binding.ChangeActivity.text = "Change Complete. Good Job!!"
    }
}
