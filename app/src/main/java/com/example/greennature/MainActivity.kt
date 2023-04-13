package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var text: TextView
    private var isHide = false
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    private var currentPage = 0
    private var numPages = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("Pilihan"))
        tabLayout.addTab(tabLayout.newTab().setText("Tagihan"))
        tabLayout.addTab(tabLayout.newTab().setText("Insurance"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = MyAdapter(this, supportFragmentManager,
            tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        val btniklan: Button =
            findViewById(R.id.buttoniklan)
        btniklan.setOnClickListener(this)



        val textView = findViewById<TextView>(R.id.saldo)
        val ImageButton = findViewById<ImageButton>(R.id.showHideBtn)
        ImageButton.setOnClickListener(View.OnClickListener {
            var data = if(isHide) "Rp.16.427.213,21" else "•••••••••••••••"
            var icon = if(isHide) R.drawable.ic_action_eye else R.drawable.eyeeewe
            isHide = !isHide
            textView.setText(data)
            ImageButton.setImageResource(icon)
        })

    }




    override fun onClick(v: View) {


        when (v.id) {
            R.id.buttoniklan -> {
                val moveToRegister = Intent(this@MainActivity, AdsActivity::class.java)
                startActivity(moveToRegister)
            }

        }
    }
}