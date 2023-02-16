package com.example.dadobasado

import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//se genera la clase
class MainActivity : AppCompatActivity() {
    //    fun = metodo o funcion
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_main)

//    usar la vista
        val btnLazar: Button = findViewById(R.id.btnLanzar)

//    metodo click
        btnLazar.setOnClickListener {
//        mensje para el click
            timer()
//            sonido
//            val mp3 = MediaPlayer.create(this,R.drawable)
//            mp3.start()
        }
        rollDice()
    }

//    generador de numero

    private fun rollDice() {
        var numero: Int = lanzar(6)
        val txtResult: TextView = findViewById(R.id.txtResultado)
        txtResult.text = numero.toString()
//        Toast.makeText(this,numero.toString(), Toast.LENGTH_LONG).show()

//        animacion dado
        val drawableResource = when (numero) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val imgDado: ImageView = findViewById(R.id.imgDado)
        imgDado.setImageResource(drawableResource)
    }

    private fun lanzar(max: Int): Int {
        return (1..max).random()
    }

    private fun timer() {

//        contador para tiempo de tirado

        object : CountDownTimer(2000, 200) {

            override fun onTick(p0: Long) {
                rollDice()
            }

            override fun onFinish() {

            }
        }.start()
    }
}