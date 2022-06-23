package com.takayma.math

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class  MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start_btn: Button = findViewById(R.id.start_btn)
        start_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, GameActivity::class.java)
            this@MainActivity.startActivity(intent)
        }

        val settings_btn: ImageButton = findViewById(R.id.settings_btn)
        settings_btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SettingsActivity::class.java)
            this@MainActivity.startActivity(intent)
        }
    }
}