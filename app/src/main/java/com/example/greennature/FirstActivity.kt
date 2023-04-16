package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        supportActionBar?.hide()

        val btnnext: Button =
            findViewById(R.id.btnnextone)
        btnnext.setOnClickListener(this)

        val btnback: Button =
            findViewById(R.id.btnbackone)
        btnback.setOnClickListener(this)

        val btnskip: Button =
            findViewById(R.id.btnskipone)
        btnskip.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnnextone -> {
                val moveToRegister = Intent(this@FirstActivity, SecondActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.btnbackone -> {
                val moveToRegister = Intent(this@FirstActivity, SplashScreenActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.btnskipone -> {
                val moveToRegister = Intent(this@FirstActivity, MainActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}