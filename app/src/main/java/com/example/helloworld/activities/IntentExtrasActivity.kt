package com.example.helloworld.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.helloworld.R
import com.example.helloworld.models.Student
import kotlinx.android.synthetic.main.activity_intent_extras.*

class IntentExtrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_extras)

        btnGoBack.setOnClickListener { startActivity(Intent(this, IntentsActivity::class.java)) }

        getIntentExtrasFromPreviousActivity()
        getParcelableExtraFromPreviousActivity()


    }

    private fun getParcelableExtraFromPreviousActivity() {
        val student = intent.getParcelableExtra<Student>("student")
        student?.let {
            textViewName.text = student.name
            textViewLastName.text = student.lastName
            textViewAge.text = student.age.toString()
            checkBox.isChecked = student.isDeveloper
        }
    }

    private fun getIntentExtrasFromPreviousActivity() {
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
