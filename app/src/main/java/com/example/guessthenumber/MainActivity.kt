package com.example.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rNum = randomNumber()
N
        val num = findViewById(R.id.num) as EditText
        val check = findViewById(R.id.check) as Button

        check.setOnClickListener {
            val enteredNumber = num.text.toString()

            if (rNum != Integer.parseInt(enteredNumber)) {
                Toast.makeText(applicationContext, "もう一度試してください。" + rNum, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "素晴らしい!", Toast.LENGTH_SHORT).show()
                rNum = randomNumber()
            }
        }
    }

    fun randomNumber(): Int {
        return Random().nextInt(25)
    }


}