package com.example.helloworld.activities

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.helloworld.R
import com.example.helloworld.others.LifeCycleEventsActivity

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    /**
     * Se ejecuta cuando se da click en el botón "atrás",
     * aquí se puede controlar el flujo cuando esto ocurra
     */
    override fun onBackPressed() {
        if(exitEnabled){
            super.onBackPressed()
        }

        Toast.makeText(this, "Vuelve a dar click atrás para salir", Toast.LENGTH_LONG).show()
        exitEnabled = true

        /** Funciona como un setTimeout que ejecuta luego de tiempo indicado en milisegundos **/
        Handler().postDelayed({exitEnabled = false}, 2000)
    }
}
