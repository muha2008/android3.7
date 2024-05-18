package com.example.android37

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android37.databinding.FragmentHomesBinding


class HomesFragment : Fragment() {

    private var _binding: FragmentHomesBinding? = null
    private val binding: FragmentHomesBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        goFirstFragment()
        goSecondFragment()
        goThirdFragment()

    }

    private fun goFirstFragment() {
        binding.catButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, FirstsFragment())
                .addToBackStack(FIRST_KEY)
                .commit()
        }
    }

    private fun goSecondFragment() {
        binding.dogButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, SecondsFragment())
                .addToBackStack(SECOND_KEY)
                .commit()
        }
    }

    private fun goThirdFragment() {
        binding.movieButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, ThirdsFragment())
                .addToBackStack(THIRD_KEY)
                .commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    companion object{
        const val FIRST_KEY = "first"
        const val SECOND_KEY = "second"
        const val THIRD_KEY = "third"
    }
}