package com.example.ist.kotlinproj

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ist.kotlinproj.beans.Child
import kotlinx.android.synthetic.main.reddit_item_view.view.*

/**
 * Created by ist on 23/8/17.
 */

class RedditAdapter(mainActivity: Context, mList: MutableList<Child>) : Adapter<RedditAdapter.ViewHolder>() {
    var mContext = mainActivity
    var mList = mList


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.reddit_item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return mList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        var reddit: Child = mList?.get(position)!!
        holder?.bindItems(reddit.data.title)!!
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(title: String) {
            itemView.tv_item_name.text = title
        }
    }
}