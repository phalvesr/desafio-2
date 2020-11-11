package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.desafio_2.RestaurantListActivity.Companion.KEY_RESTAURANT

class RestaurantInfoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_info)

        val restaurant = intent.getParcelableExtra<Restaurant>(KEY_RESTAURANT)
        val spinner = Spinner(this, 5f, 30f).start()

        Glide
            .with(this)
            .load(restaurant?.restaurantCardCoverImage)
            .placeholder(spinner)
            .centerCrop()
            .into(findViewById(R.id.ivRestaurantInfoActivity))

        findViewById<TextView>(R.id.restaurantName).text = restaurant?.restaurantName

        findViewById<RecyclerView>(R.id.restaurantInfoActivityContainer)
            .apply {
                layoutManager = GridLayoutManager(this.context, 2)
                adapter = RestaurantInfoAdapter(restaurant?.restaurantMenu) { meal ->
                    onClick(meal)
                }
            }

        setEvents()
    }

    private fun onClick(itemMenu: ItemMenu?) {
        val intent = Intent(this, ItemMenuDescriptionActivity::class.java)
        intent.putExtra(KEY_ITEM_MENU, itemMenu)
        startActivity(intent)
    }

    private fun setEvents() {
        findViewById<ImageView>(R.id.backButtonRestaurantInfoActivity).setOnClickListener {
            finish()
        }
    }

    companion object {
        const val KEY_ITEM_MENU = "itemMenu"
    }

}
