package com.example.helloworld.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.R

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {

    // 1) CLick en XML
    // 2) Click en linea
    // 3) Click by IDs en 'when'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()

        clickMulti()
    }

    // Regla obligatoria para clicks en XML:
    // - El método tiene que ser público (por defecto so públicos)
    // - Los nombres tienen que coincidir
    // - Solo recibe un solo parámetro (View)
    fun xmlClick(view: View) {
        Toast.makeText(this, "Click by XML!", Toast.LENGTH_SHORT).show()
    }

    private fun clickInLine() {
        val btn = findViewById<Button>(R.id.btnClickInLine)
        btn.setOnClickListener {Toast.makeText(this, "Click in line!", Toast.LENGTH_SHORT).show()}
    }

    private fun clickMulti() {
        val btn1 = findViewById<Button>(R.id.btnClickMulti1)
        val btn2 = findViewById<Button>(R.id.btnClickMulti2)
        val btn3 = findViewById<Button>(R.id.btnClickMulti3)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)
    }

    override fun onLongClick(view: View): Boolean {
        var text = ""
        text = when(view.id) {
            R.id.btnClickMulti1 -> "Click Multi 1"
            R.id.btnClickMulti2 -> "Click Multi 2"
            R.id.btnClickMulti3 -> "Click Multi 3"
            else -> "Unknown button"
        }
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        return true
    }
}
