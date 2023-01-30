package com.example.iman_tulenaliev

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.iman_tulenaliev.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClick()
        setOnLongClick()
    }

    private fun setOnLongClick() {
binding.buttonMessi.setOnLongClickListener {
    val intent = Intent(this, DetailActivity::class.java)
    intent.putExtra("d", "Лионе́ль Андре́с Ме́сси Куччитти́ни[a] (исп. Lionel Andrés Messi Cuccittini, испанское произношение: [ljoˈnel anˈdɾez ˈmesi] (Звук слушать); родился 24 июня 1987, Росарио, Аргентина) — аргентинский футболист, нападающий клуба «Пари Сен-Жермен», капитан сборной Аргентины. Олимпийский чемпион, чемпион Южной Америки, чемпион мира")
    startActivity(intent)
    true
}
    }

    private fun setOnClick() {
        binding.buttonCasillas.setOnClickListener {
            Glide.with(this).load(getString(R.string.casillas_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonBale.setOnClickListener {
            Glide.with(this).load(getString(R.string.bale_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonIbragimovic.setOnClickListener {
            Glide.with(this).load(getString(R.string.ibragimovic_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonPirlo.setOnClickListener {
            Glide.with(this).load(getString(R.string.pirlo_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonNeymar.setOnClickListener {
            Glide.with(this).load(getString(R.string.neymar_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonBenzema.setOnClickListener {
            Glide.with(this).load(getString(R.string.benzema_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonRamires.setOnClickListener {
            Glide.with(this).load(getString(R.string.ramires_image)).into(
                binding.imageViewIcon)
        }
        binding.buttonMessi.setOnClickListener {
            Glide.with(this).load(getString(R.string.messi_image)).into(
                binding.imageViewIcon)
        }
    }
}