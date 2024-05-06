package com.st10440755.petgamea2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var hungerLevel = 100
    private var cleanlinessLevel = 50
    private var happinessLevel = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val textViewHungerLevel = findViewById<TextView>(R.id.textViewHungerLevel)
        val textViewCleanlinessLevel = findViewById<TextView>(R.id.textViewCleanlinessLevel)
        val textViewHappinessLevel = findViewById<TextView>(R.id.textViewHappinessLevel)


        textViewHungerLevel.text = hungerLevel.toString()
        textViewCleanlinessLevel.text = cleanlinessLevel.toString()
        textViewHappinessLevel.text = happinessLevel.toString()

        btnFeed.setOnClickListener {
            hungerLevel += 10
            happinessLevel += 10
            cleanlinessLevel += 5
            textViewHungerLevel.text = hungerLevel.toString()
            textViewCleanlinessLevel.text = cleanlinessLevel.toString()
            textViewHappinessLevel.text = happinessLevel.toString()
            animateImageChange(
                petEatingGif = R.drawable.pet_eating_gif,
                petPlaying = R.drawable.pet_playing
            )
        }

        btnClean.setOnClickListener {
            cleanlinessLevel += 10
            happinessLevel += 10

            textViewCleanlinessLevel.text = cleanlinessLevel.toString()
            textViewHappinessLevel.text = happinessLevel.toString()
            val petImage = 0 // Not sure what this is, you should replace it with the correct value
            animateImageChange(petImage, R.drawable.pet_playing)
        }


        btnPlay.setOnClickListener {
            happinessLevel += 10
            hungerLevel += 5
            cleanlinessLevel += 5



            textViewHungerLevel.text = hungerLevel.toString()
            textViewCleanlinessLevel.text = cleanlinessLevel.toString()
            textViewHappinessLevel.text = happinessLevel.toString()
            val petImage = 0
            animateImageChange(petImage, R.drawable.pet_playing)
        }
    }


    private fun animateImageChange(petEatingGif: Int, petPlaying: Int) {

    }

    }