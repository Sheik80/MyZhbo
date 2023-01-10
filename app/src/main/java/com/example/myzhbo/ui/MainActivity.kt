package com.example.myzhbo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myzhbo.R
import com.example.myzhbo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}