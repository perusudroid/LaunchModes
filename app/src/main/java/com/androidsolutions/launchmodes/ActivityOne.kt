package com.androidsolutions.launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidsolutions.launchmodes.databinding.ActivityOneBinding

class ActivityOne : AppCompatActivity() {

    private val binding by lazy { ActivityOneBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnTwo.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }
        binding.btnReopen.setOnClickListener {
            startActivity(Intent(this, ActivityOne::class.java))
        }
    }
}