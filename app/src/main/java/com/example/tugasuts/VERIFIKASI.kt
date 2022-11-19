package com.example.tugasuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class VERIFIKASI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi)
    }
    private fun btnloginistener(){
        gambar1.setOnClickListener {
            startActivity(Intent(this, selamat::class.java))
        }
    }
}
