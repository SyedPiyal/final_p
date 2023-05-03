package com.piyal.finalproject.ui.user

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.piyal.finalproject.R
import com.piyal.finalproject.databinding.FragmentHomeBinding
import com.piyal.finalproject.ui.home.HomeViewModel

class UserFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*val userViewModel =
            ViewModelProvider(this)[UserViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        *//*val textView: TextView = binding.textDashboard*//*
        userViewModel.text.observe(viewLifecycleOwner) {
            *//*textView.text = it*//*
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null*/

        // Inflate the layout for this fragment
                return inflater.inflate(R.layout.fragment_user, container, false)
    }
}