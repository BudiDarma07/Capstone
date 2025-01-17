package com.example.capstone.ui.softskill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.capstone.databinding.FragmentSoftskillBinding

class SoftskillFragment : Fragment() {

    private var _binding: FragmentSoftskillBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val SoftskillViewModel =
            ViewModelProvider(this).get(SoftskillViewModel::class.java)

        _binding = FragmentSoftskillBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSoftskill
        SoftskillViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}