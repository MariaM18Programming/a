package com.example.lotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun ClickReg(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun ClickMain(view: View) {
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
    }
    fun ClickProfile(view : View) {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}