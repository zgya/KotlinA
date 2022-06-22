package com.example.kotlina

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.title.view.*

class TitleLayout(context:Context,atttrs:AttributeSet):LinearLayout(context,atttrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this)
    }

}