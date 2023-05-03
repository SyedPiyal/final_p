package com.piyal.finalproject.ui.sell

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.piyal.finalproject.R
import com.piyal.finalproject.databinding.FragmentHomeBinding
import com.piyal.finalproject.databinding.FragmentSellBinding
import com.piyal.finalproject.ui.home.HomeViewModel

class NotificationsFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val notificationsViewModel =
        ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textDashboard*/
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            /*textView.text = it*/
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}