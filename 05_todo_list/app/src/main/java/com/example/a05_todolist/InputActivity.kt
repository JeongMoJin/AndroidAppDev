package com.example.a05_todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_todolist.databinding.ActivityInputBinding

class InputActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}