package com.example.val3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)
        val imageView = findViewById<ImageView>(R.id.weight)
        imageView.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this, R.style.CustomAlertDialogStyle)
            val dialog= dialogBuilder
                .setTitle("Are you heavy?")
                .setMessage("Atomic mass is determined by adding up masses of an atom's protons, electrons and neutrons.")
                .setPositiveButton("Got it!"){ _, _ ->
                }
                .create()
            dialog.setOnShowListener {
                dialog.findViewById<TextView>(android.R.id.message)?.setTextAppearance(R.style.CustomAlertDialogMessage)
                val titleTextView = dialog.findViewById<TextView>(resources.getIdentifier("alertTitle", "id", packageName))
                titleTextView?.setTextAppearance(R.style.CustomAlertDialogTitle)
            }

            dialog.show()
        }
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        button1.setOnClickListener {
            val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putInt("BUTTON_ID3", R.id.button)
            editor.apply()
        }
        button2.setOnClickListener {
            val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putInt("BUTTON_ID3", R.id.button2)
            editor.apply()
        }
        button3.setOnClickListener {
            val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putInt("BUTTON_ID3", R.id.button3)
            editor.apply()
        }
    }
    fun goToHome(view: View) {
        val intent = Intent(this, Question2::class.java)
        startActivity(intent)
    }
    fun goToNext(view: View) {
        val intent = Intent(this, Question4::class.java)
        startActivity(intent)
    }

}