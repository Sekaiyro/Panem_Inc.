package com.example.greennature

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()

        val btnnext: Button =
            findViewById(R.id.btnnexttwo)
        btnnext.setOnClickListener(this)

        val btnback: Button =
            findViewById(R.id.btnbacktwo)
        btnback.setOnClickListener(this)

        val btnskip: Button =
            findViewById(R.id.btnskiptwo)
        btnskip.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnnexttwo -> {
                val moveToRegister = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.btnbacktwo -> {
                val moveToRegister = Intent(this@SecondActivity, FirstActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.btnskiptwo -> {
                val moveToRegister = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}