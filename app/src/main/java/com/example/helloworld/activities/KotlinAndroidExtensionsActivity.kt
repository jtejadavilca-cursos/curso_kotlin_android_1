package com.example.helloworld.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_kotlin_android_extensions.*

class KotlinAndroidExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_android_extensions)

        val btnById = findViewById<Button>(R.id.btnById)
        btnById.setOnClickListener { Toast.makeText(this, "Click By ID", Toast.LENGTH_SHORT).show() }

        btnByKAT.setOnClickListener { Toast.makeText(this, "Click By KAT", Toast.LENGTH_SHORT).show() }
    }
}
