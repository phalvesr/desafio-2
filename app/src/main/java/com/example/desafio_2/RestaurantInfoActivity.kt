package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_restaurant_info)

        findViewById<RecyclerView>(R.id.restaurantInfoActivityContainer)
            .apply {
                layoutManager = GridLayoutManager(this.context, 2)
                adapter = RestaurantInfoAdapter(RestaurantsDataClass().outback, RestaurantsDataClass().outback.restaurantMenu)
            }


    }
}