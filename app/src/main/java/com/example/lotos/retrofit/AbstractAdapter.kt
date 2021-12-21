package com.example.lotos.retrofit

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractAdapter<ITEM> constructor (
    protected var itemList: List<ITEM>,
    private val layoutResId: Int
) : RecyclerView.Adapter<AbstractAdapter.Holder>() {
    class Holder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}