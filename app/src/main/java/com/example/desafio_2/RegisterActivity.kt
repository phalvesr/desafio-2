package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    private val name by lazy {
        findViewById<TextInputEditText>(R.id.etName)
    }

    private val email by lazy {
        findViewById<TextInputEditText>(R.id.etEmail)
    }

    private val password by lazy {
        findViewById<TextInputEditText>(R.id.etPassword)
    }

    private val confirmPassword by lazy {
        findViewById<TextInputEditText>(R.id.etRepeatPassword)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        TitleBar()
            .changeTitleBar(this, getString(R.string.registerActivityTitle), true)
        setEvents()
    }

    private fun setEvents() {
        findViewById<Button>(R.id.containedButton).setOnClickListener {

            val validation = Validation()
            var validRegister = true

            val inputedName = name.text.toString()
            val inputedEmail = email.text.toString()
            val inputedPassword = password.text.toString()
            val confirmedPassword = confirmPassword.text.toString()

            if (!validation.areRegisterPasswordValid(inputedPassword, confirmedPassword)) {
                findViewById<TextInputLayout>(R.id.tilPassword).error = getString(R.string.invalidPasswordString)
                findViewById<TextInputLayout>(R.id.tilRepeatPassword).error = getString(R.string.invalidPasswordString)
                validRegister = false
            }
            if (validation.areRegisterPasswordValid(inputedPassword, confirmedPassword)) {
                findViewById<TextInputLayout>(R.id.tilPassword).error = null
                findViewById<TextInputLayout>(R.id.tilRepeatPassword).error = null
            }
            if (!validation.isEmailValid(inputedEmail)) {
                findViewById<TextInputLayout>(R.id.tilEmail).error = getString(R.string.invalidEmailString)
                validRegister = false
            }
            if (validation.isEmailValid(inputedEmail)) {
                findViewById<TextInputLayout>(R.id.tilEmail).error = null
            }
            if (!validation.isNameValid(inputedName)) {
                findViewById<TextInputLayout>(R.id.tilName).error = getString(R.string.invalidNameInput)
                validRegister = false
            }
            if (validation.isNameValid(inputedName)) {
                findViewById<TextInputLayout>(R.id.tilName).error = null
            }

            if (validRegister) nextActivity()

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun nextActivity() {
        val intent = Intent(this, RestaurantListActivity::class.java)
        startActivity(intent)
        finish()
    }
}