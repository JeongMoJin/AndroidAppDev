package kr.jeongmo.a03_emergency_medical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.jeongmo.a03_emergency_medical.databinding.ActivityMainBinding

class EditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}