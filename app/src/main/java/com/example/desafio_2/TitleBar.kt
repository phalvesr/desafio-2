package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity

class TitleBar {
    fun changeTitleBar(context: AppCompatActivity, title: String, backButton: Boolean = false) {
        context.title = title
        context.supportActionBar?.setDisplayHomeAsUpEnabled(backButton)
    }

    fun setBackButton(context: AppCompatActivity, bool: Boolean) = with(context){
        supportActionBar?.setDisplayHomeAsUpEnabled(bool)
    }
}