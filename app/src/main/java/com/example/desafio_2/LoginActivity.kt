package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        changeTitleBar()
        setEvents()
    }

    private fun setEvents() {
        findViewById<Button>(R.id.logInButton).setOnClickListener {
            val intent = Intent(this@LoginActivity, RestaurantListActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.registerButtonLoginActivity).setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun changeTitleBar() {
        title = "Digital House Foods"
    }
}