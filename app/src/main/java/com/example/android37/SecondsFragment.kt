package com.example.android37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android37.databinding.FragmentSecondsBinding

class SecondsFragment : Fragment() {

    private var _binding: FragmentSecondsBinding? = null
    private val binding: FragmentSecondsBinding get() = _binding!!
    private val adapter = AnimalsAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        modelAnimals()

    }

    private fun initialize() {
        binding.rvSecond.adapter = adapter
        adapter.setAppList(modelAnimals())
    }

    private fun modelAnimals() = listOf(
        AnimalsModel(R.drawable.dog1, getString(R.string.dog1)),
        AnimalsModel(R.drawable.dog2, getString(R.string.dog2)),
        AnimalsModel(R.drawable.dog3, getString(R.string.dog3)),
        AnimalsModel(R.drawable.dog4, getString(R.string.dog4))
    )

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}