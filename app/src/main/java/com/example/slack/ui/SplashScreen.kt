package com.example.slack.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.slack.R
import kotlinx.coroutines.*


class SplashScreen : Fragment() {

    private val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()
        //lunch activity
        activityScope.launch {
//            if(onBoardingFinished()){
//                //delay for 3 seconds
//                delay(3000)
//                //lunch home fragment
//                findNavController().navigate(R.id.action_splash_screen_to_navigation_home)
//            }
//            else{
//                //delay for 3 seconds
//                delay(3000)
//                //lunch on boarding fragments
//                findNavController().navigate(R.id.action_splash_screen_to_view_pager)
//            }

        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    //cancel this fragment when paused
    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
//
//    private fun onBoardingFinished(): Boolean {
//        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
//        return sharedPref.getBoolean("Finished", false)
//    }

}