package com.example.ejerciciohgaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejerciciohgaj.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding2.root)

        var bundle = intent.extras

        var nombre = bundle?.getString("hintnombre","")
        var cumpleaños =bundle?.getString("Cumpleaños","")
        var edad =bundle?.getInt("edad",0)
        var cuenta =bundle?.getString("cuenta","")
        var correo = bundle?.getString("correo","")
        edad.toString()

        binding2.tvNombre2.text="{nombre}"
        binding2.tvCumpleanos.text= "Tu cumpleños es: {cumpleaños}"
        binding2.tvNumerodeCuenta.text= "{cuenta}"
        binding2.tvCorreo2.text= "Correo {correo} "


    }
    fun click(view:View){
        val intent= Intent(this,MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)

    }
}