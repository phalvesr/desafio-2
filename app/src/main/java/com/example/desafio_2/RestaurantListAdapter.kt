package com.example.desafio_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.card.MaterialCardView

class RestaurantListAdapter(
    private val restaurants: List<Restaurant>,
    private val onClick: (Int) -> Unit,
) : RecyclerView.Adapter<RestaurantListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantListAdapter.ViewHolder, position: Int) {
        holder.bind(restaurants[position], onClick)
    }

    override fun getItemCount(): Int {
        return this.restaurants.size
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(restaurant: Restaurant, onClick: (Int) -> Unit) {

            val spinner = Spinner(itemView.context, 5f, 30f).start()

            Glide
                .with(itemView.context)
                .load(restaurant.restaurantCardCoverImage)
                .fitCenter()
                .placeholder(spinner)
                .into(itemView.findViewById(R.id.restaurantImage))

            itemView
                .findViewById<TextView>(R.id.restaurantName)?.text = restaurant.restaurantName

            itemView
                .findViewById<TextView>(R.id.restaurantAdress)?.text = restaurant.restaurantAddress

            itemView
                .findViewById<TextView>(R.id.restaurantClosingHour).text =
                "closes at ${restaurant.restaurantClosingHour}".capitalize()

            itemView
                .setOnClickListener {
                    onClick(this.adapterPosition)
                }
        }
    }
}