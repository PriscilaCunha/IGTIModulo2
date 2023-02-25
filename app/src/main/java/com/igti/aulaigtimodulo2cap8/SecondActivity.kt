package com.igti.aulaigtimodulo2cap8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.igti.aulaigtimodulo2cap8.databinding.ActivityMainBinding
import com.igti.aulaigtimodulo2cap8.databinding.ActivitySecondBinding

private lateinit var binding: ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)

        // Set new view call
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.secondContainer)
    }
}