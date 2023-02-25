package com.igti.aulaigtimodulo2cap8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.igti.aulaigtimodulo2cap8.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Original view call
        //setContentView(R.layout.activity_main)

        // Set new view call
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.mainContainer)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        //fragmentTransaction.add(R.id.mainFragmentContainer, FirstFragment())
        //fragmentTransaction.commit()

        binding.mainBtnChange.setOnClickListener {
            Toast.makeText(this, "Button pressed", Toast.LENGTH_SHORT).show()

            binding.mainTextTitle.text = "Changed!"
            binding.mainImageProfile.setBackgroundColor(resources.getColor(R.color.teal_200))

            // Replace Activity with Second Activity and clear history
            //val intent = Intent(this, SecondActivity::class.java)
            //startActivity(intent)
            //finish()

            fragmentTransaction.replace(R.id.mainFragmentContainer, SecondFragment())
            fragmentTransaction.commit()
        }
    }
}