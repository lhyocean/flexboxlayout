package com.bj.ocean.flexboxlayuouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.flexbox.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var arrayList=resources.getStringArray(R.array.names)
        println("siiiiii"+arrayList.size)
        var list=ArrayList<String>()

        list.addAll(arrayList)
        println("sssssss"+list.size)

        var adapter=TestAdapter(list)

        var layoutManager=FlexboxLayoutManager(this)
        layoutManager.flexWrap=FlexWrap.WRAP
        layoutManager.flexDirection=FlexDirection.ROW
        layoutManager.alignItems=AlignItems.STRETCH


        rec.layoutManager=layoutManager
        rec.adapter=adapter

    }
}
