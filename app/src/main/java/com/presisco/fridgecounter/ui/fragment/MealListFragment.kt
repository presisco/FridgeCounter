package com.presisco.fridgecounter.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.presisco.fridgecounter.R


/**
 * A simple [Fragment] subclass.
 */
class MealListFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_meal_list, container, false)
    }

}// Required empty public constructor
