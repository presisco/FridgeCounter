package com.presisco.fridgecounter.ui.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.presisco.fridgecounter.R
import com.presisco.fridgecounter.ui.fragment.FridgeListFragment
import com.presisco.fridgecounter.ui.fragment.MealListFragment
import com.presisco.fridgecounter.ui.fragment.ShopListFragment

class HostActivity : AppCompatActivity() {

    private lateinit var mPanelFragments: HashMap<Int, Fragment>
    private var lastSelected = -1

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        Log.d(this.localClassName, "onCLick")
        var valid = true
        when (item.itemId) {
            R.id.nav_shop_list -> {
            }
            R.id.nav_fridge_list -> {
            }
            R.id.nav_meal_list -> {
            }
            else -> valid = false
        }
        if (valid and (lastSelected != item.itemId)) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.content, mPanelFragments[item.itemId])
                    .commitNow()
            lastSelected = item.itemId
            return@OnNavigationItemSelectedListener true
        } else {
            return@OnNavigationItemSelectedListener false
        }
    }

    fun prepareFragments() {
        mPanelFragments = hashMapOf()
        with(mPanelFragments) {
            put(R.id.nav_shop_list, ShopListFragment())
            put(R.id.nav_fridge_list, FridgeListFragment())
            put(R.id.nav_meal_list, MealListFragment())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        prepareFragments()

        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction()
                .replace(R.id.content, mPanelFragments[R.id.nav_shop_list])
                .commitNow()
        lastSelected = R.id.nav_shop_list
    }

}
