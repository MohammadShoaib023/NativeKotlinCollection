package com.example.nativekotlincollection

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {

private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        handler=Handler()
        handler.postDelayed(
            {
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            },3000
        )
    }
}