package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.buttonlogin)
        btnSign.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.buttonlogin -> {
                val moveToRegister = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}