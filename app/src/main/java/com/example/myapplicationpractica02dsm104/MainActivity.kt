package com.example.myapplicationpractica02dsm104
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
lateinit var cantidad1 : EditText
lateinit var cantidad2 : EditText
lateinit var enviar : Button
lateinit var resultado: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cantidad1 = findViewById(R.id.Txtcantidad1)
        cantidad2 = findViewById(R.id.Txtcantidad2)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)
        enviar.setOnClickListener{
            /*
           // var Txtcantidad1: String = cantidad1.text.toString()
           // var Txtcantidad2: String = cantidad2.text.toString()

            Aqui ira el proceso de la suma
            var Suma: String

             */
            resultado.setText(Suma)
        }
    }
}