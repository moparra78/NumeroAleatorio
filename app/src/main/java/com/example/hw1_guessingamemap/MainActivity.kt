package com.example.hw1_guessingamemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_number_guess.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val cajatexto1: TextView = findViewById(R.id.caja1) as TextView
    val boton1: Button = findViewById(R.id.btn1) as Button
    val boton2: Button =findViewById(R.id.btn2) as Button
    val editor1: EditText = findViewById(R.id.edt1) as EditText
    val numaleatorio: Int = Random.nextInt(1,100)
    //val randomLeft = (0+Math.random()*100).toInt()
    //val randomRight = (0+Math.random()*100).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)

        boton1.setOnClickListener(View.OnClickListener(){

            val numero = editor1.text.toString() as Int

            if(numero == numaleatorio){

                Toast.makeText(applicationContext, "Lo lograste!", Toast.LENGTH_LONG).show()
            }
            else if (numero < numaleatorio){

                Toast.makeText(applicationContext, "El número que ingresaste es menor!", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext, "El número que ingresaste es mayor!", Toast.LENGTH_LONG).show()
            }

        })

        boton2.setOnClickListener(View.OnClickListener(){

            editor1.editableText.clear()

        })

    }

    //fun doClikLeft(view: View) {
    //Toast.makeText(applicationContext, "$(randomLeft > randomRight)", Toast.LENGTH_LONG)
    //}

    //fun doClikckRight(view: View){
    //if(randomRight >= randomLeft)
    //    Toast.makeText(applicationContext, "Ganaste!", Toast.LENGTH_LONG).show()
    // else
    //      Toast.makeText(applicationContext, "Perdiste!", Toast.LENGTH_LONG).show()
    //}
}
