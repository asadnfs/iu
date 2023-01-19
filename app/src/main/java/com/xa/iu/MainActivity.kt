package com.xa.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.xa.dizayn.fragments.Fragment_one
import com.xa.dizayn.fragments.Fragment_three
import com.xa.dizayn.fragments.Fragment_two
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, Fragment_one())
            .commit()

        link(Fragment_one())
        nav_buttom_bar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.dropdown_menu -> link(Fragment_one())
                R.id.carryVelocity -> link(Fragment_two())
                R.id.selection_type -> link(Fragment_three())
            }
            true
        }
    }
    private fun link(fra:Fragment){
        if (fra != null){
            val support = supportFragmentManager.beginTransaction()
            support.replace(R.id.frame_layout,fra)
            support.commit()
        }
    }
}