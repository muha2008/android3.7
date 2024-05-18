package com.example.android37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android37.databinding.FragmentThirdsBinding

class ThirdsFragment : Fragment() {
    private var _binding: FragmentThirdsBinding? = null
    private val binding: FragmentThirdsBinding get() = _binding!!
    private val adapter = AnimalsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        modelAnimals()
    }

    private fun initialize() {
        binding.rvThird.adapter = adapter
        adapter.setAppList(modelAnimals())
    }

    private fun modelAnimals() = listOf(
        AnimalsModel(
            R.drawable.movies1,
            getString(R.string.movies1)
        ),
        AnimalsModel(
            R.drawable.movies2,
            getString(R.string.movies2)
        ),
        AnimalsModel(
            R.drawable.movies3,
            getString(R.string.movies3)
        ),
        AnimalsModel(
            R.drawable.movies4,
            getString(R.string.movies4)
        ),
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}