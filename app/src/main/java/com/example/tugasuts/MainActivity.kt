package com.example.tugasuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnloginistener()
    }
    private fun btnloginistener(){
gambar1.setOnClickListener {
    startActivity(Intent(this, VERIFIKASI::class.java))
}
    }
}