package com.example.kotlina.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlina.Bean.Fruit
import kotlinx.android.synthetic.main.fruit_item.view.*

class Msg(val content:String,val type:Int){
    companion object{
        const val TYPE_RECEIVE = 0
        const val TYPE_SEND = 1
    }
}
////class MsgAdapter(val msgList: List<Msg>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
////    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
////
////    }
//}