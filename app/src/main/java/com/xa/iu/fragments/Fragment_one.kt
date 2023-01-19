package com.xa.dizayn.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.xa.iu.R

class Fragment_one : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        val card1 = view.findViewById<CardView>(R.id.cardView_1)
        val card4 = view.findViewById<CardView>(R.id.card4)
        val card5 = view.findViewById<CardView>(R.id.card5)

        val card2 = view.findViewById<CardView>(R.id.card2)
        val card3 = view.findViewById<CardView>(R.id.card3)
        val card6 = view.findViewById<CardView>(R.id.card6)
        //animations
        val left_slow = AnimationUtils.loadAnimation(context,R.anim.left_slow)
        val right_slow = AnimationUtils.loadAnimation(context,R.anim.right_slow)

        card1.startAnimation(left_slow)
        card4.startAnimation(left_slow)
        card5.startAnimation(left_slow)

        card2.startAnimation(right_slow)
        card3.startAnimation(right_slow)
        card6.startAnimation(right_slow)




        return view


    }


}