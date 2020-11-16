package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        TitleBar()
            .changeTitleBar(this, getString(R.string.loginActivityTitle))
        setEvents()

    }

    private fun setEvents() {
        findViewById<Button>(R.id.logInButton).setOnClickListener {
            val email = findViewById<TextInputEditText>(R.id.etEmailLogin).text.toString()
            val password = findViewById<TextInputEditText>(R.id.etPasswordLogin).text.toString()
            // Since this app is a proof of concept I'm validating any 8+ characters password in this activity

            val validator = Validation()

            if (validator.isEmailValid(email)) {
                findViewById<TextInputLayout>(R.id.tilEmailLogin).error = null
            }
            if (!validator.isEmailValid(email)) {
                findViewById<TextInputLayout>(R.id.tilEmailLogin).error = getString(R.string.invalidEmailString)
            }
            if (!validator.isPasswordValid(password)) {
                findViewById<TextInputLayout>(R.id.tilPasswordLogin).error = getString(R.string.invalidPasswordString)
            }
            if (validator.isPasswordValid(password)){
                findViewById<TextInputLayout>(R.id.tilPasswordLogin).error = null
            }

            if (validator.isPasswordValid(password) && validator.isEmailValid(email)) {
                changeActivity()
            }
        }

        findViewById<Button>(R.id.registerButtonLoginActivity).setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun changeActivity() {
        val intent = Intent(this@LoginActivity, RestaurantListActivity::class.java)
        startActivity(intent)
        finish()
    }
}