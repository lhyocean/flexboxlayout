package com.bj.ocean.flexboxlayuouttest

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.lay_item_tv.view.*

/**
 * Created by ocean on 2020-03-27
 * @describe:
 */
class TestAdapter(private var mDatas:ArrayList<String>) : RecyclerView.Adapter<TestAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

       var view =View.inflate(parent?.context,R.layout.lay_item_tv,null)
        return Holder(view)
    }
    override fun getItemCount(): Int {
        println("size=="+mDatas?.size)
        return mDatas?.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        with(holder?.itemView!!){
            tv_content.text=mDatas[position]
        }
    }
    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView)
}