package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule


class SplashScreen : AppCompatActivity() {

    // Animation tutorial:
    // https://www.youtube.com/watch?v=JLIFqqnSNmg
    private lateinit var animation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        animation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        findViewById<TextView>(R.id.splashscreen_activity_app_name).animation = animation

        Timer("SettingUp", false).schedule(2500) {
            changeActivity()
        }

    }

    private fun changeActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}