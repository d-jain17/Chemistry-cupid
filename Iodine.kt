package com.example.val3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Iodine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iodine)

    }

    fun goToImage1(view: View) {
        val image1 = findViewById<ImageView>(R.id.iodineCartoon1)
        val image2 = findViewById<ImageView>(R.id.iodineCartoon2)
        val image3 = findViewById<ImageView>(R.id.iodineCartoon3)
        image1.visibility = View.VISIBLE
        image2.visibility = View.INVISIBLE
        image3.visibility = View.INVISIBLE
    }
    fun goToImage2(view: View) {
        val image1 = findViewById<ImageView>(R.id.iodineCartoon1)
        val image2 = findViewById<ImageView>(R.id.iodineCartoon2)
        val image3 = findViewById<ImageView>(R.id.iodineCartoon3)
        image1.visibility = View.INVISIBLE
        image2.visibility = View.VISIBLE
        image3.visibility = View.INVISIBLE
    }
    fun goToImage3(view: View) {
        val image1 = findViewById<ImageView>(R.id.iodineCartoon1)
        val image2 = findViewById<ImageView>(R.id.iodineCartoon2)
        val image3 = findViewById<ImageView>(R.id.iodineCartoon3)
        image1.visibility = View.INVISIBLE
        image2.visibility = View.INVISIBLE
        image3.visibility = View.VISIBLE
    }
    fun goToHome(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}