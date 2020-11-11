package com.example.desafio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.desafio_2.RestaurantInfoActivity.Companion.KEY_ITEM_MENU

class ItemMenuDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_menu_description)

        val itemMenu = intent.getParcelableExtra<ItemMenu>(KEY_ITEM_MENU)

        Glide
            .with(this)
            .load(itemMenu?.itemImage)
            .centerCrop()
            .placeholder(R.drawable.placeholder)
            .into(findViewById(R.id.iv_meal_item_description_activity))

        findViewById<TextView>(R.id.item_menu_description_activity_meal_name)
            .text = itemMenu?.itemName

        findViewById<TextView>(R.id.item_menu_description_activity_meal_description)
            .text = itemMenu?.itemDescription

        setEvents()
    }

    private fun setEvents() {
        findViewById<Button>(R.id.backButtonItemMenuDescriptonActivity).setOnClickListener {
            finish()
        }
    }
}