package com.example.val3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectElement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_element)

    }
    fun goToHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun goToHydrogen(view: View) {
        val intent = Intent(this, Hydrogen::class.java)
        startActivity(intent)
    }
    fun goToNitrogen(view: View) {
        val intent = Intent(this, Nitrogen::class.java)
        startActivity(intent)
    }
    fun goToFlourine(view: View) {
        val intent = Intent(this, Nitrogen::class.java)
        startActivity(intent)
    }
    fun goToOxygen(view: View) {
        val intent = Intent(this, Oxygen::class.java)
        startActivity(intent)
    }
    fun goToChlorine(view: View) {
        val intent = Intent(this, Chlorine::class.java)
        startActivity(intent)
    }
    fun goToBromine(view: View) {
        val intent = Intent(this, Bromine::class.java)
        startActivity(intent)
    }
    fun goToIodine(view: View) {
        val intent = Intent(this, Iodine::class.java)
        startActivity(intent)
    }
}