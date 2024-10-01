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
    val storeList = ArrayList<Int>()  // storeList 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MyAdapter(numbers, storeList)  // 어댑터에 storeList 전달
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)//어댑터를 적용하는 과정

        // Add 버튼 클릭 시 리스트에 새로운 숫자 추가
        binding.add.setOnClickListener {
            val nextNumber = numbers.size + 1
            numbers.add(nextNumber)
            adapter.notifyItemInserted(numbers.size - 1)//어댑터에 알려주는 함수
        }

        // Go 버튼 클릭 시 AcceptActivity로 이동하면서 storeList 넘기기
        binding.gobutton.setOnClickListener {
            val intent = Intent(this, AcceptActivity::class.java)
            intent.putIntegerArrayListExtra("selectedNumbers", storeList)  // storeList 전달
            startActivity(intent)
        }

        // 텍스트 동적 변경
        binding.ChangeActivity.text = "Change Complete. Good Job!!"
    }
}
