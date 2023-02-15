package com.example.dadobasado

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
    btnLazar.setOnClickListener{
//        mensje para el click
        rollDice()

    }
    }

//    generador de numero

    private fun rollDice(){
        var numero:  Int = lanzar(6)
        Toast.makeText(this,numero.toString(), Toast.LENGTH_LONG).show()
    }

    private fun lanzar(max:Int):Int{
        return (1..max).random()
    }
}