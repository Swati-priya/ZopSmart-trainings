package com.example.helloapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btorder:Button = findViewById(R.id.btorder)
        val rgmeat:RadioGroup=findViewById(R.id.rgmeat)
        val ckbcheese:CheckBox =findViewById(R.id.ckbcheese)
        val ckbonion:CheckBox =findViewById(R.id.ckbonion)
        val ckbsalad:CheckBox =findViewById(R.id.ckbsalad)
        val ordersstring:TextView= findViewById(R.id.orderstring)
        btorder.setOnClickListener {
            val checkdmeat = rgmeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkdmeat)
            val cheese = ckbcheese.isChecked
            val onion = ckbonion.isChecked
            val salad = ckbsalad.isChecked
            val ordstring =
                "You ordered a Burger with: \n" + "${meat.text}" + (if (cheese) "\n Cheese" else "") + (if (onion) "\nOnion" else "") + (if (salad) "\nSalad" else "")
            ordersstring.text = ordstring
        }
    }
}