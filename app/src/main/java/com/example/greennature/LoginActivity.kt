package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.buttonlogin)
        btnSign.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.buttonlogin -> {
                val moveToRegister = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}