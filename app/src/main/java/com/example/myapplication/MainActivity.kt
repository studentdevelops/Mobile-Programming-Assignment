package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            Log.i("Button", "Button was clicked")
            val message = messageTxtBox.text.toString()
            Toast.makeText(this,message, Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("message",message)
            startActivity(intent)
        }
    }
}