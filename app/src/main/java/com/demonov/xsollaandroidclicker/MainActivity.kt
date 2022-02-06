package com.demonov.xsollaandroidclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.loginButton).setOnClickListener { onLoginButtonClick() }
    }

    private fun onLoginButtonClick()
    {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}