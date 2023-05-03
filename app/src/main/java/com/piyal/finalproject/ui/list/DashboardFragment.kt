package com.piyal.finalproject.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.piyal.finalproject.R
import com.piyal.finalproject.databinding.FragmentHomeBinding
import com.piyal.finalproject.databinding.FragmentListBinding
import com.piyal.finalproject.ui.home.HomeViewModel

class DashboardFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val dashboardViewModel =
        ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        *//*val textView: TextView = binding.textDashboard*//*
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            *//*textView.text = it*//*
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null*/
        // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_list, container, false)
    }
}