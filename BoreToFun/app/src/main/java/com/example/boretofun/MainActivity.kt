package com.example.boretofun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boredbutton = findViewById<Button>(R.id.btbored)
        boredbutton.setOnClickListener{
                    val intent:Intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
            buttonclicked()

        }
        // val resultText:TextView=findViewById(R.id.result_text)
        //resultText.text="Dice rolled!"

    }

    private fun buttonclicked(){
        Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
    }

}
