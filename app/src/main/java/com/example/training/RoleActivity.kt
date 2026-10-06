package com.example.training

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RoleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_role)
        val btnAdmin = findViewById<Button>(R.id.btnAdmin)
        val btnUser = findViewById<Button>(R.id.btnUser)
        val btnGuest = findViewById<Button>(R.id.btnGuest)
        btnAdmin.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("selectedRole", "Admin")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
        btnUser.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("selectedRole", "User")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
        btnGuest.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("selectedRole", "Guest")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}