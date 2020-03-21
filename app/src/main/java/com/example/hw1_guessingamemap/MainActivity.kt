package com.example.hw1_guessingamemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_number_guess.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val numaleatorio: Int = Random.nextInt(1,1000)
    //var numaleatorio = 0
    var contar = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
    }

    /*fun iniciar(view: View){
        aleatorio()
        empezar()
    }*/

    /*fun aleatorio() {
        numaleatorio == Random.nextInt(1, 4)
    }*/

    fun iniciar(view: View){

        val numero = edt1.text.toString()
        contar = contar + 1

        if(numaleatorio == Integer.parseInt(numero)){
            Toast.makeText(applicationContext, "Lo lograste!!, numero de intentos: ${contar}" , Toast.LENGTH_LONG).show()
        }
        else if (numaleatorio > Integer.parseInt(numero)){
            Toast.makeText(applicationContext, "El número que ingresaste es menor!", Toast.LENGTH_LONG).show()
        }
        else if (numaleatorio < Integer.parseInt(numero)){
            Toast.makeText(applicationContext, "El número que ingresaste es mayor!", Toast.LENGTH_LONG).show()
        }

    }

    fun reiniciar(view: View){

        edt1.editableText.clear()
        //iniciar()

    }

}
