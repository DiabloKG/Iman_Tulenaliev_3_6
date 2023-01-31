package com.example.iman_tulenaliev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.iman_tulenaliev.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()
    }

    @Suppress("DEPRECATION")
    private fun getData() {
        if (intent.getParcelableExtra<Footbalist>("footbalist") != null) {
            val bundle = Bundle()
            val footbalist = intent.getParcelableExtra<Footbalist>("footbalist")
            bundle.putParcelable("footbalist", footbalist)
            val fragment = DetailFragment()
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.container_view, fragment).commit()
        }
    }
}