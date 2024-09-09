package com.laregebludberry.realstudy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.laregebludberry.realstudy.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView // 네비게이션 뷰 임포트 추가
import com.laregebludberry.realstudy.util.Profile

// NavigationView.OnNavigationItemSelectedListener 인터페이스 구현
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

        // 드로어 리스너 연결
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // 버튼 클릭 리스너 설정
        binding.ChangeButton.setOnClickListener {
            val intent = Intent(this, ChangeActivity::class.java)
            startActivity(intent)
        }


        binding.navigationview.setNavigationItemSelectedListener(this)
    }


    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onNavigationItemSelected(item: android.view.MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
            R.id.nav_home -> {
                    val intentTwo = Intent(this, MainActivity::class.java)
                startActivity(intentTwo)
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START) // 드로어 닫기
        return true
    }
}
