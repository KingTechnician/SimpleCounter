package com.kingtechnician.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var step = 1
        val button = findViewById<Button>(R.id.addButton)
        val upgradeButton = findViewById<Button>(R.id.updateButton)
        val textView = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener()
        {
            counter+=step
            if(counter===100)
            {
                Toast.makeText(it.context,"Congrats! There's a new option for you...",Toast.LENGTH_LONG).show()
                upgradeButton.visibility= View.VISIBLE
                upgradeButton.setOnClickListener()
                {
                    step = 2
                    upgradeButton.visibility=View.INVISIBLE
                }
            }
            textView.text = counter.toString()
        }



    }
}