package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide

class ItemMenuDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_menu_description)

        val restaurant = RestaurantsDataClass().outback

        TitleBar().setBackButton(this, true)

        Glide
            .with(this)
            .load(restaurant.restaurantMenu[0].itemImage)
            .centerCrop()
            .placeholder(R.drawable.placeholder)
            .into(findViewById(R.id.iv_meal_item_description_activity))

        findViewById<TextView>(R.id.item_menu_description_activity_meal_name)
            .text = restaurant.restaurantMenu[0].itemName

        findViewById<TextView>(R.id.item_menu_description_activity_meal_description)
            .text = restaurant.restaurantMenu[0].itemDescription
    }
}