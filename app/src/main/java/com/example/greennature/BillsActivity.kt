package com.example.greennature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bills)
        supportActionBar?.hide()
    }
}