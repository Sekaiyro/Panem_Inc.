package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnSign: TextView =
            findViewById(R.id.viewall)
        btnSign.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.viewall -> {
                val moveToRegister = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}