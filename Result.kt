package com.example.val3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


    }
    fun buttonNext(view: View) {
        val sharedPref = getSharedPreferences("MY_PREFS_NAME", Context.MODE_PRIVATE)
        val buttonId1 = sharedPref.getInt("BUTTON_ID1", 0)
        val buttonId2 = sharedPref.getInt("BUTTON_ID2", 0)
        val buttonId3 = sharedPref.getInt("BUTTON_ID3", 0)
        val buttonId4 = sharedPref.getInt("BUTTON_ID4", 0)
        val buttonId5 = sharedPref.getInt("BUTTON_ID5", 0)
        val buttonName1 = resources.getResourceEntryName(buttonId1)
        val buttonName2 = resources.getResourceEntryName(buttonId2)
        val buttonName3 = resources.getResourceEntryName(buttonId3)
        val buttonName4 = resources.getResourceEntryName(buttonId4)
        val buttonName5 = resources.getResourceEntryName(buttonId5)
        val buttons = listOf<String>(
            buttonName1,
            buttonName2,
            buttonName3,
            buttonName4,
            buttonName5
        )
        val ans = mutableListOf<Int>(
            0,
            0,
            0,
            0,
            0,
            0,
            0
        )
        if (buttons[0] == "button") {
            for (i in 0..4) {
                ans[i] = ans[i] + 1
            }
        } else if (buttons[0] == "button1") {
            ans[5] = ans[5] + 1
        } else if (buttons[0] == "button2") {
            ans[6] = ans[6] + 1

        }

        if (buttons[1] == "button") {
            for (i in 0..3) {
                ans[i] = ans[i] + 1
            }
        } else if (buttons[1] == "button1") {
            ans[4] = ans[4] + 1
        } else if (buttons[1] == "button2") {
            ans[6] = ans[6] + 1
            ans[5] = ans[5] + 1
        }

        if (buttons[2] == "button") {
            for (i in 0..4) {
                ans[i] = ans[i] + 1
            }
        } else if (buttons[2] == "button1") {
            ans[5] = ans[5] + 1
        } else if (buttons[2] == "button2") {
            ans[6] = ans[6] + 1
        }

        if (buttons[3] == "button") {
            for (i in 0..3) {
                ans[i] = ans[i] + 1
            }
        } else if (buttons[3] == "button1") {
            ans[4] = ans[4] + 1
        } else if (buttons[3] == "button2") {
            ans[5] = ans[5] + 1
            ans[6] = ans[6] + 1
        }

        if (buttons[4] == "button") {
            ans[3] = ans[3] + 1
        } else if (buttons[4] == "button1") {
            ans[1] = ans[1] + 1
            ans[2] = ans[2] + 1
            ans[4] = ans[4] + 1

        } else if (buttons[4] == "button2") {
            ans[0] = ans[0] + 1
            ans[6] = ans[6] + 1
        }

        var max = 0
        var ind = 0
        for (i in 0..6) {
            println("${ans[i]}v ")
            if (ans[i] > max) {
                max = ans[i]
                ind = i
            }
        }
        val intent = when (ind) {
            0 -> Intent(this, Hydrogen::class.java)
            1 -> Intent(this, Nitrogen::class.java)
            2 -> Intent(this, Oxygen::class.java)
            3 -> Intent(this, Flourine::class.java)
            4 -> Intent(this, Chlorine::class.java)
            5 -> Intent(this, Bromine::class.java)
            else -> Intent(this, Iodine::class.java)
        }
        startActivity(intent)

    }


}