package com.example.desafio_2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantInfoAdapter(
    private val meals: MutableList<ItemMenu>?,
    val onClick: (ItemMenu?) -> Unit
) : RecyclerView.Adapter<RestaurantInfoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantInfoAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantInfoAdapter.ViewHolder, position: Int) {
        holder.bind(meals?.get(position), onClick)
    }

    override fun getItemCount(): Int {
        return this.meals?.size ?: 0
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(meal: ItemMenu?, onClick: (ItemMenu?) -> Unit) {

            Glide
                .with(itemView.context)
                .load(meal?.itemImage.toString())
                .placeholder(R.drawable.placeholder)
                .centerCrop()
                .into(itemView.findViewById(R.id.itemMenuImage))

            itemView
                .findViewById<TextView>(R.id.mealName).text = meal?.itemName.toString()

            itemView
                .setOnClickListener {
                    onClick(meal)
                }
        }
    }
}