package com.example.exercise2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val  usernameid = findViewById<EditText>(R.id.usernameid)
        val loginid = findViewById<Button>(R.id.loginid)

        loginid.setOnClickListener {
            passdata()
        }

    }
    private fun passdata() {
        val usernameid = findViewById<EditText>(R.id.usernameid)
        val username = usernameid.text.toString()
        val intent = Intent (this, front_page ::class.java).also {
            it.putExtra("EXTRA_MESSAGE", username)
            startActivity(it)
        }
    }







}
