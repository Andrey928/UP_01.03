package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        Handler().postDelayed({
в



            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // Время задержки в миллисекундах (3 секунды)
    }
}
