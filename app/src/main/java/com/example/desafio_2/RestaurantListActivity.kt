package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestaurantListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_list)

        TitleBar()
            .changeTitleBar(this, "Digital House Foods")

        findViewById<RecyclerView>(R.id.restaurantListActivityContainer)
            .apply {
                adapter = RestaurantListAdapter(
                    listOf(
                        RestaurantsDataClass().tonyRomas,
                        RestaurantsDataClass().aoyama,
                        RestaurantsDataClass().outback,
                        RestaurantsDataClass().siSenhor
                    )
                )
                layoutManager = LinearLayoutManager(this@RestaurantListActivity)
            }
    }
}