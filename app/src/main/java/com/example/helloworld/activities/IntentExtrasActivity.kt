package com.example.helloworld.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        val name: String? = intent.getStringExtra("name")
        val lastName: String? = intent.getStringExtra("lastName")
        val age = intent.getIntExtra("age", 0)
        val isDeveloper = intent.getBooleanExtra("developer", false)

        textViewName.text = name
        textViewLastName.text = lastName
        textViewAge.text = age.toString()
        checkBox.isChecked = isDeveloper
    }
}
