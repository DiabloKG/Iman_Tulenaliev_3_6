package com.example.iman_tulenaliev

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.iman_tulenaliev.databinding.FragmentDetailBinding
import kotlin.math.log


class DetailFragment : Fragment() {

    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
    }

    @Suppress("DEPRECATION")
    private fun setData() {
        if (arguments != null){
            val footbalist = arguments?.getParcelable<Footbalist>("footbalist")
            binding.textViewDescription.text = footbalist?.description
            Glide.with(this).load(footbalist?.image).into(binding.imageViewImage)
            binding.textViewName.text = footbalist?.name
        }
    }

}