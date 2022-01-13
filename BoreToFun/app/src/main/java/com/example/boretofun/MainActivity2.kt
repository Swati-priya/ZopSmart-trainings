package com.example.boretofun

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

/*class SpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }
}*/


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

       /* val spinner: Spinner = findViewById(R.id.spinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.activity_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = this

        if(spinner. === "Improve your touch typing"){

        }*/
                // access the items of the list
                val activitys = resources.getStringArray(R.array.activity_array)
                // access the spinner
                val spinner = findViewById<Spinner>(R.id.spinner)
                if (spinner != null) {
                    val adapter = ArrayAdapter(this,
                        android.R.layout.simple_spinner_item, activitys)
                    spinner.adapter = adapter

                    spinner.onItemSelectedListener = object :
                        AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(parent: AdapterView<*>,
                                                    view: View, position: Int, id: Long) {
                            Toast.makeText(this@MainActivity2,
                                getString(R.string.selected_item) + " " +
                                        "" + activitys[position], Toast.LENGTH_SHORT).show()

                            if(activitys[position]== "Improve your touch typing"){
                                val tvv1= findViewById<TextView>(R.id.tv1)
                                tvv1.text="Individual"
                                val tvv2= findViewById<TextView>(R.id.tv2)
                                tvv2.text="1"
                                val tvv3= findViewById<TextView>(R.id.tv3)
                                tvv3.text="0.0"
                                val tvv4= findViewById<TextView>(R.id.tv4)
                                tvv4.text="..."
                                val tvv5= findViewById<TextView>(R.id.tv5)
                                tvv5.text="234567"
                                val tvv6= findViewById<TextView>(R.id.tv6)
                                tvv6.text="1"

                            }
                            else if(activitys[position]== "Plant flowers"){
                                val tvv1= findViewById<TextView>(R.id.tv1)
                                tvv1.text="Individual"
                                val tvv2= findViewById<TextView>(R.id.tv2)
                                tvv2.text="1"
                                val tvv3= findViewById<TextView>(R.id.tv3)
                                tvv3.text="Depend on variety of plant"
                                val tvv4= findViewById<TextView>(R.id.tv4)
                                tvv4.text="https://www.floweraura.com"
                                val tvv5= findViewById<TextView>(R.id.tv5)
                                tvv5.text="678467"
                                val tvv6= findViewById<TextView>(R.id.tv6)
                                tvv6.text="1/2"
                            }
                            else if(activitys[position]== "Play cards"){
                                val tvv1= findViewById<TextView>(R.id.tv1)
                                tvv1.text="Double/Triple"
                                val tvv2= findViewById<TextView>(R.id.tv2)
                                tvv2.text="2-4"
                                val tvv3= findViewById<TextView>(R.id.tv3)
                                tvv3.text="Depend on bet"
                                val tvv4= findViewById<TextView>(R.id.tv4)
                                tvv4.text="https://cardgames.io/"
                                val tvv5= findViewById<TextView>(R.id.tv5)
                                tvv5.text="986467"
                                val tvv6= findViewById<TextView>(R.id.tv6)
                                tvv6.text="1"
                            }
                            else if(activitys[position]== "Go for Shopping"){
                                val tvv1= findViewById<TextView>(R.id.tv1)
                                tvv1.text="Individual/Partner"
                                val tvv2= findViewById<TextView>(R.id.tv2)
                                tvv2.text="1/2"
                                val tvv3= findViewById<TextView>(R.id.tv3)
                                tvv3.text="Depend on Money you have!!"
                                val tvv4= findViewById<TextView>(R.id.tv4)
                                tvv4.text="https://www.amazon.in"
                                val tvv5= findViewById<TextView>(R.id.tv5)
                                tvv5.text="23467"
                                val tvv6= findViewById<TextView>(R.id.tv6)
                                tvv6.text="1/2"
                            }
                        }

                        override fun onNothingSelected(parent: AdapterView<*>) {
                            // write code to perform some action
                        }
                    }
                }





    }
}