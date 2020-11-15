package com.pqt.hackernews.ui.top

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.pqt.hackernews.domain.NewsItem

class TopNewsAdapter()
    : ListAdapter<NewsItem, TopNewsAdapter.TopNewsViewHolder>(TopNewsDiffCallback()) {

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TopNewsViewHolder, position: Int) {
        holder.bindTo()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopNewsViewHolder {
    }

    fun swapData(data: List<NewsItem>) {
        submitList(data)
    }

    inner class TopNewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindTo() {

        }
    }
}

class TopNewsDiffCallback : DiffUtil.ItemCallback<NewsItem>() {
    override fun areItemsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        TODO("Not yet implemented")
    }

}
