package com.laregebludberry.realstudy.util


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.laregebludberry.realstudy.painting.MilletFragment
import com.laregebludberry.realstudy.painting.MonetFragment
import com.laregebludberry.realstudy.painting.VanGoghFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> VanGoghFragment()
            1 -> MonetFragment()
            else -> MilletFragment()
        }//프래그먼트와 연결
    }
}