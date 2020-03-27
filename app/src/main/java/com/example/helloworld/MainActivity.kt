package com.example.helloworld


import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.Toast
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.example.helloworld.activities.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToLifeCycle = findViewById<Button>(R.id.button_to_cycle)
        val btnClickToEvents = findViewById<Button>(R.id.button_to_click)
        val btnAndroidExtensions = findViewById<Button>(R.id.button_to_android_extensions)
        val btnToPicasso = findViewById<Button>(R.id.button_to_picasso)
        val btnToListView = findViewById<Button>(R.id.button_to_list_view)
        val btnToIntents = findViewById<Button>(R.id.button_to_intents)
        val btnToPermissions = findViewById<Button>(R.id.button_to_permissions)
        val btnToSharedPreferences = findViewById<Button>(R.id.button_to_shared_preferences)
        val btnToExtensionFunctions = findViewById<Button>(R.id.button_to_extension_functions)

        btnToLifeCycle.setOnClickListener { goToLifeCycleActivity() }
        btnClickToEvents.setOnClickListener { goToClickEventsActivity() }
        btnAndroidExtensions.setOnClickListener { goToAndroidExtensionsActivity() }
        btnToPicasso.setOnClickListener { goToPicassoActivity() }
        btnToListView.setOnClickListener { goToListViewActivity() }
        btnToIntents.setOnClickListener { goToIntentsActivity() }
        btnToPermissions.setOnClickListener { goToPermissionActivity() }
        btnToSharedPreferences.setOnClickListener { goToSharedPreferencesActivity() }
        btnToExtensionFunctions.setOnClickListener { goToExtensionFunctionsActivity() }

//        showToast()
//        showSnackbar()

    }

    fun showToast() {
        Toast.makeText(this, "Hello world!", Toast.LENGTH_LONG).show()
    }

    fun showSnackbar() {
        val layout = findViewById<ConstraintLayout>(R.id.contraint)
        Snackbar.make(layout, "Hello world from Snackbar 1", Snackbar.LENGTH_LONG).show()

        Snackbar.make(layout, "Hello world from Snackbar2", Snackbar.LENGTH_LONG).setAction("UNDO"){
            Snackbar.make(layout, "Email has been restored", Snackbar.LENGTH_LONG).show()
        }
        .show()
    }

    fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))
    fun goToClickEventsActivity() = startActivity(Intent(this, ClickEventsActivity::class.java))
    fun goToAndroidExtensionsActivity() = startActivity(Intent(this, KotlinAndroidExtensionsActivity::class.java))
    fun goToPicassoActivity() = startActivity(Intent(this, PicassoActivity::class.java))
    fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    fun goToIntentsActivity() = startActivity(Intent(this, IntentsActivity::class.java))
    fun goToPermissionActivity() = startActivity(Intent(this, PermissionsActivity::class.java))
    fun goToSharedPreferencesActivity() = startActivity(Intent(this, SharedPreferencesActivity::class.java))
    fun goToExtensionFunctionsActivity() = startActivity(Intent(this, ExtensionFunctionsActivity::class.java))
}
