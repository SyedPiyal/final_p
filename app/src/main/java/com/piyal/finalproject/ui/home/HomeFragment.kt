package com.piyal.finalproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.piyal.finalproject.R
import com.piyal.finalproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        *//*val textView: TextView = binding.textDashboard*//*
        homeViewModel.text.observe(viewLifecycleOwner) {
            *//*textView.text = it*//*
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null*/

        // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_home, container, false)
    }
}