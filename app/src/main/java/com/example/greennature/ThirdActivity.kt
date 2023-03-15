package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        supportActionBar?.hide()

        val btnSign: Button =
            findViewById(R.id.btnnextthree)
        btnSign.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnnextthree -> {
                val moveToRegister = Intent(this@ThirdActivity, HomeActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}