package com.example.colorcal

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        val appNameTextView: TextView = findViewById(R.id.appName)

        appNameTextView.startAnimation(fadeInAnimation)


        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}
