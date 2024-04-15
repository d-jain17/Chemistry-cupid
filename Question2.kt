package com.example.val3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import android.widget.TextView

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question2)
        val imageView = findViewById<ImageView>(R.id.abundance)
        imageView.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this, R.style.CustomAlertDialogStyle)
            val dialog= dialogBuilder
                .setTitle("Are you easy to get a hold of?")
                .setMessage("Some elements like those found in stars are abundant throughout " +
                        "the universe " +
                        ", while others are rare and hard to find.")
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
            editor.putInt("BUTTON_ID2", R.id.button)
            editor.apply()
        }
        button2.setOnClickListener {
            val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putInt("BUTTON_ID2", R.id.button2)
            editor.apply()
        }
        button3.setOnClickListener {
            val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putInt("BUTTON_ID2", R.id.button3)
            editor.apply()
        }
    }
    fun goToHome(view: View) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }
    fun goToNext(view: View) {
        val intent = Intent(this, Question3::class.java)
        startActivity(intent)
    }
}