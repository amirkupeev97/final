package com.example.fx

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var articleList = emptyList<Country>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ContactViewHolder(v)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as ContactViewHolder
        val currentItem = articleList[position]
        holder.itemView.countryTextView.text = currentItem.Country
        holder.itemView.SlugTextView.text = currentItem.Slug
        holder.itemView.IS02TextView.text = currentItem.IS02

        holder.itemView.toDoItemLayout.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.listCountryFragment)
        }
    }
    fun setData(article: List<Country>){

        this.articleList = article
        notifyDataSetChanged()
    }
    inner class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    }
}