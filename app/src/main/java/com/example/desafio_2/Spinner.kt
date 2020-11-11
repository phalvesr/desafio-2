package com.example.desafio_2

import android.content.Context
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

class Spinner(
    private val context: Context,
    private var strokeWidth: Float,
    private var centerRadius: Float,
) {

    private val spinner by lazy {
        CircularProgressDrawable(context)
    }

    fun start(): CircularProgressDrawable {
        val spinner = CircularProgressDrawable(this.context)
        spinner.centerRadius = this.centerRadius
        spinner.strokeWidth = this.strokeWidth
        spinner.start()
        return spinner
    }
}