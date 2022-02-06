package com.demonov.xsollaandroidclicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class GameActivity : AppCompatActivity()
{
    private var score:Int = 0
    private var multiplier:Int = 1
    private var scoreText:TextView? = null

    private var buyButton:Button? = null
    private var gameButton:Button? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameButton = findViewById<Button>(R.id.gameButton)
        gameButton?.setOnClickListener { onGameButtonClick() }

        buyButton = findViewById<Button>(R.id.buyButton)
        buyButton?.setOnClickListener { onBuyButtonClick() }

        findViewById<Button>(R.id.logoutButton).setOnClickListener { onLogoutButtonClick() }

        scoreText = findViewById<TextView>(R.id.scoreView)
        scoreText?.text = score.toString()
    }

    private fun onGameButtonClick()
    {
        score += 1 * multiplier
        scoreText?.text = score.toString()
    }

    private fun onBuyButtonClick()
    {
        multiplier = 2
        gameButton?.text = resources.getText(R.string.game_button_bonus)
        buyButton?.visibility = View.GONE
    }

    private fun onLogoutButtonClick()
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}