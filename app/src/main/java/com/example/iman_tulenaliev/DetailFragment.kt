package com.example.iman_tulenaliev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iman_tulenaliev.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
        setData()
    }

    private fun setData() {
        if (arguments != null){
            println("Данные получил")
            binding.textViewDescription.text = arguments?.getString("d")
        }
    }

}