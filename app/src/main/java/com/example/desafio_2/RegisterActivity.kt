package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        TitleBar()
            .changeTitleBar(this, getString(R.string.registerActivityTitle), true)
        setEvents()
    }

    private fun setEvents() {


























































        
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}