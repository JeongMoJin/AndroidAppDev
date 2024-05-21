package com.example.a05_todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a05_todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            view = this@MainActivity
        }
    }
    fun onClickAdd() {

    }
}