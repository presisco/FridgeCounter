package com.presisco.fridgecounter.ui.fragment


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.presisco.fridgecounter.R
import com.presisco.fridgecounter.ui.activity.AddShopItemActivity


/**
 * A simple [Fragment] subclass.
 */
class ShopListFragment : Fragment() {
    var mShopListAdapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        inner class ViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {
            val lateinit mNameText : TextView
            val lateinit mCountText : TextView

            init {

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemCount(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView = inflater!!.inflate(R.layout.fragment_shop_list, container, false)
        with(rootView) {
            findViewById(R.id.buttonAdd).setOnClickListener { _ ->
                startActivityForResult(
                        Intent(activity, AddShopItemActivity::class.java), 1)
            }
        }
        return rootView
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if ((requestCode == 1) and (resultCode == Activity.RESULT_OK)) {

        }
    }
}// Required empty public constructor
