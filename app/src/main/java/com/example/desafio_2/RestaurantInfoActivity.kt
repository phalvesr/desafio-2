package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RestaurantInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_info)

        Glide
            .with(this)
            .load(RestaurantsDataClass().outback.restaurantCardCoverImage)
            .placeholder(R.drawable.placeholder)
            .centerCrop()
            .into(findViewById(R.id.ivRestaurantInfoActivity))

        findViewById<TextView>(R.id.restaurantName).text = RestaurantsDataClass().outback.restaurantName

        findViewById<RecyclerView>(R.id.restaurantInfoActivityContainer)
            .apply {
                layoutManager = GridLayoutManager(this.context, 2)
                adapter = RestaurantInfoAdapter(RestaurantsDataClass().outback.restaurantMenu)
            }


    }
}