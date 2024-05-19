package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var usuarioinput:EditText
    lateinit var contraseñainput:EditText
    lateinit var inicioboton:Button






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usuarioinput = findViewById(R.id.usuario_input)
        contraseñainput = findViewById(R.id.contraseña_input)
        inicioboton = findViewById(R.id.inicio_boton)

        inicioboton.setOnClickListener{
            val usuario = usuarioinput.text.toString()
            val contraseña = contraseñainput.text.toString()
            Log.i("testiar las credenciales", "usuario: $usuario and contraseña: $contraseña")
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}