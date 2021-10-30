package com.example.slack.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.slack.R
import com.example.slack.databinding.FragmentOnboardingBinding


class Onboarding : Fragment() {

    private lateinit var binding : FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding = fragmentBinding

        binding.getStartedBt.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding_to_sign_up)
        }
        binding.loginText.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding_to_login)
        }
        return binding.root
    }
}