package com.example.iman_tulenaliev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iman_tulenaliev.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()
    }

    private fun getData() {
        if (intent.getStringExtra("d") != null) {
            val bundle = Bundle()
            bundle.putString("d", intent.getStringExtra("d"))
            val fragment = DetailFragment()
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.container_view, fragment).commit()
        }
    }
}