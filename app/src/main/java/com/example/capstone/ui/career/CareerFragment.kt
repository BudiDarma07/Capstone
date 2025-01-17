package com.example.capstone.ui.career

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.capstone.databinding.FragmentCareerBinding

class CareerFragment : Fragment() {

    private var _binding: FragmentCareerBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val careerViewModel =
            ViewModelProvider(this).get(CareerViewModel::class.java)

        _binding = FragmentCareerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCareer
        careerViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}