package com.example.val3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View
import android.content.Context


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToQuizActivity(view: View) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }
    fun goToSelectElement(view: View) {
        val intent = Intent(this, SelectElement::class.java)
        startActivity(intent)
    }

}




