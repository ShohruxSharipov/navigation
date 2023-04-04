package com.example.regfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.regfrag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hendler = Handler()
        hendler.postDelayed({
            findNavController(R.id.splash).navigate(R.id.from_splash_to_login)},3000)

    }
}