package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

    }

    fun btn_click(view: View) {
        val textbox = findViewById<EditText>(R.id.et_name)
        if (textbox.text.toString().isEmpty()){
            Toast.makeText(this, "Пожалуйста, введите свое имя", Toast.LENGTH_SHORT).show()

        }else{
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME,textbox.text.toString())
            startActivity(intent)
            finish()
        }
    }

    fun click_info(view: View) {
        val intent = Intent(this, activity_info::class.java)
        startActivity(intent)
        finish()
    }

    fun click_about(view: View) {
        val intent = Intent(this, about_activity::class.java)
        startActivity(intent)
        finish()
    }
}