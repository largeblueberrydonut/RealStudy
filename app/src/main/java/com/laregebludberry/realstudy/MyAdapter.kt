package com.laregebludberry.realstudy

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laregebludberry.realstudy.databinding.ItemBinding

class MyAdapter(val numbers: List<Int>) :
    RecyclerView.Adapter<MyAdapter.NumberViewHolder>() {

    inner class NumberViewHolder(val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(number: Int) {
            binding.text1.text = numbers.toString()
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
