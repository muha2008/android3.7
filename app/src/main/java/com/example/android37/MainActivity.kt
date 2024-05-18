package com.example.android37

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android37.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(androidx.fragment.R.id.fragment_container_view_tag, HomesFragment())
            .commit()
    }
}