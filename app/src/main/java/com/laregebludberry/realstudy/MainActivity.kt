package com.laregebludberry.realstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.font.FontVariation
import androidx.core.view.GravityCompat
import androidx.viewpager.widget.ViewPager
import com.laregebludberry.realstudy.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.laregebludberry.realstudy.fragment.SettingsFragment
import com.laregebludberry.realstudy.util.MyViewPager
import com.laregebludberry.realstudy.util.Profile
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 툴바 설정
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // ActionBarDrawerToggle 설정
        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar, // 툴바를 연결
            R.string.open_drawer,
            R.string.close_drawer
        )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        //화면 전환
        binding.ChangeButton.setOnClickListener {
            val intent = Intent(this, ChangeActivity::class.java)//화면 전환
            startActivity(intent)
        }

        binding.navigationview.setNavigationItemSelectedListener(this)

        val viewpager:ViewPager2 = binding.InstarViewPager
        val adapter = InstarViewPagerAdapter(this)
        InstarViewPager.adapter = adapter

    }


    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    //왼쪽 드로어 레이아웃 열때 가정한 코드
    override fun onNavigationItemSelected(item: android.view.MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
            R.id.nav_home -> {
                val intentTwo = Intent(this, MainActivity::class.java)
                startActivity(intentTwo)
            }//이 구조는 엑티비티 -> 엑티비티로 화면 전환
            R.id.nav_settings -> {
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragment_container, SettingsFragment())
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }//이 구조는 액티비티 -> 프래그먼트로 화면 전환
            R.id.ViewPager2 -> {
                val intentThree = Intent(this, MyViewPager::class.java)
                startActivity(intentThree) //뷰페이저2로 넘어가고 뷰페이저 2에서 또다른 프래그먼트를 개발완료 후 연결하기
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START) // 드로어 닫기
        return true
    }



}
