package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.button3)
        btnSign.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.button3 -> {
                val moveToRegister = Intent(this@HomeActivity, LoginActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}