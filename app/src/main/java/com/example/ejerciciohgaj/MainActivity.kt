package com.example.ejerciciohgaj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.ejerciciohgaj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvTitulo.text ="Ingresa datos"

        binding.tvFecha1.setOnClickListener { showDatePickerDialog() }


    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment{day, month ,year -> onDateSelected(day, (month+1), year)}
        datePicker.show(supportFragmentManager, "datepicker")


    }
    fun onDateSelected(day: Int, month:Int, year: Int){
        binding.tvFecha1.setText("$day/$month/$year")

    }

    fun click1(view: View) {}


}