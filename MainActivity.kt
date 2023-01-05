package com.example.elementarylearnersaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Objects
        val mMessageEditText: EditText = findViewById(R.id.nameEditText)
        val btnProceed: Button = findViewById(R.id.btnProceed)
//        var WelcomeView: TextView = findViewById(R.id.WelcomeText)
//        var IntroView: TextView = findViewById(R.id.IntroText)

        //button Listener
        btnProceed.setOnClickListener {
            val recyclerActivityIntent = Intent(this, RecyclerViewActivity::class.java)

            val name = mMessageEditText.text.toString().trim()

            recyclerActivityIntent.putExtra("PLAYER_NAME", name)

            startActivity(recyclerActivityIntent)
        }
    }
}