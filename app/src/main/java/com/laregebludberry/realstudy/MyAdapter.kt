package com.laregebludberry.realstudy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laregebludberry.realstudy.databinding.ItemBinding

class MyAdapter(val numbers: MutableList<Int>, val storeList: ArrayList<Int>) : RecyclerView.Adapter<MyAdapter.NumberViewHolder>() {

    inner class NumberViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(number: Int) {
            binding.text1.text = number.toString()

            // Store 버튼 클릭 이벤트 처리
            binding.Store.setOnClickListener {
                // 번호를 storeList에 추가
                storeList.add(number)
                println("Stored number: $number")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NumberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(numbers[position])
    }

    override fun getItemCount(): Int = numbers.size
}
