package com.example.desafio_2

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantInfoAdapter(
    val meals: List<ItemMenu>
) : RecyclerView.Adapter<RestaurantInfoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantInfoAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantInfoAdapter.ViewHolder, position: Int) {
        holder.bind(this.meals[position])
    }

    override fun getItemCount(): Int {
        return this.meals.size
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(meal: ItemMenu) {
            Glide
                .with(itemView.context)
                .load(meal.itemImage)
                .placeholder(R.drawable.placeholder)
                .centerCrop()
                .into(itemView.findViewById(R.id.itemMenuImage))

            itemView
                .findViewById<TextView>(R.id.mealName).text = meal.itemName
        }
    }
}