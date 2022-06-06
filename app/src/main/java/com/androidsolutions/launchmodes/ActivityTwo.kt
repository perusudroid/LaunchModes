package com.androidsolutions.launchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.androidsolutions.launchmodes.databinding.ActivityTwo2Binding

class ActivityTwo : AppCompatActivity() {

    private val binding by lazy { ActivityTwo2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnThree.setOnClickListener {
            startActivity(Intent(this, ActivityThree::class.java))
        }
        binding.btnReopen.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT).show()
    }
}