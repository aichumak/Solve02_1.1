package com.example.solve02_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("DebugMessage", "Debug: Testing message")
        Log.e("ErrorMessage", "ERROR: Testing message")
    }
}