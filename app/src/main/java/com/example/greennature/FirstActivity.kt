package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.btnnextone)
        btnSign.setOnClickListener(this)

        val btnskip: TextView =
            findViewById(R.id.skipfirst)
        btnskip.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnnextone -> {
                val moveToRegister = Intent(this@FirstActivity, SecondActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.skipfirst -> {
                val moveToRegister = Intent(this@FirstActivity, HomeActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}