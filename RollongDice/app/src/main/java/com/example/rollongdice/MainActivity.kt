package com.example.rollongdice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
       // val resultText:TextView=findViewById(R.id.result_text)
        //resultText.text="Dice rolled!"

    }

    private fun rollDice(){
        val randomInt=(1..6).random()
        val resultText:TextView=findViewById(R.id.result_text)
        resultText.text=randomInt.toString()

        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
    }


}