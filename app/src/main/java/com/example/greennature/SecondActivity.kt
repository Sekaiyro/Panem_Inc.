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

        val btnSign: Button =
            findViewById(R.id.btnnexttwo)
        btnSign.setOnClickListener(this)

        val btnskip: TextView =
            findViewById(R.id.skiptwo)
        btnskip.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        when (v.id) {
            R.id.btnnexttwo -> {
                val moveToRegister = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(moveToRegister)
            }
            R.id.skiptwo -> {
                val moveToRegister = Intent(this@SecondActivity, HomeActivity::class.java)
                startActivity(moveToRegister)
            }
        }
    }
}