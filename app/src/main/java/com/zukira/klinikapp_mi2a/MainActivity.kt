package com.zukira.klinikapp_mi2a

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //splash screen
        //handle untuk delay selama bbrp detik
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this, StarterPageActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000
        )

        //TASK :
        //Splash Screen
        //PADA PAGE START SCREEN  --> klik button Get Started akan pindah ke page login
        //Paga page login, ketika klik tulisan sign up --> pindah ke page sign up
        //page page signup, ketika klik login --> pindah ke login

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}