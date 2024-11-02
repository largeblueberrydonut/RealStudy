package com.laregebludberry.realstudy.fragment.camera

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.laregebludberry.realstudy.MainActivity
import com.laregebludberry.realstudy.R


class InstarViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int =2

    override fun createFragment(position: Int): Fragment{
        return when(position){
            0 -> MainActivity()
            1 -> CarmeraFragment()
            else -> MainActivity()
        }
    }
}