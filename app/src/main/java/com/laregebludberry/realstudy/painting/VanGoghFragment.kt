package com.laregebludberry.realstudy.painting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.laregebludberry.realstudy.R


class VanGoghFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 고흐 화면 레이아웃 불러오기
        return inflater.inflate(R.layout.fragment_van_gogh, container, false)
    }
}


