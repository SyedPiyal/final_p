package com.piyal.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.piyal.finalproject.databinding.ActivityMainBinding
import com.piyal.finalproject.databinding.LogInBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler()

        handler.postDelayed({
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}