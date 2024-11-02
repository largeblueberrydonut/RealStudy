package com.laregebludberry.realstudy.painting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.laregebludberry.realstudy.R


class MonetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 모네 화면 레이아웃 불러오기
        return inflater.inflate(R.layout.fragment_monet, container, false)
        // context가 아니므로 이런 식으로 불러야 함
    }
}
