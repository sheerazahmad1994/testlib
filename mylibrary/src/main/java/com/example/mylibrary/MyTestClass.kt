package com.example.mylibrary

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyTestClass : AppCompatActivity() {

    fun myToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun navigate(context:Context) {
        val intent = Intent(context, NewActivity::class.java)
        startActivity(intent)
    }
}