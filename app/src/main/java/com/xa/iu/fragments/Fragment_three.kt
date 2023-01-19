package com.xa.dizayn.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import com.xa.iu.R

class Fragment_three : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)

        val left_slow = AnimationUtils.loadAnimation(context,R.anim.left_slow)

        val text2 = view.findViewById<TextView>(R.id.text3)
        text2.startAnimation(left_slow)

        return view
    }


}