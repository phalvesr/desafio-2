package com.example.desafio_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
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
                        RestaurantsDataClass().siSenor
                    ), { onClick(it) }
                )
                layoutManager = LinearLayoutManager(this@RestaurantListActivity)
            }
    }

    private fun onClick(int: Int) {
        when {
            int == 0 -> {
                val intent = Intent(this, RestaurantInfoActivity::class.java)
                intent.putExtra(KEY_RESTAURANT, RestaurantsDataClass().tonyRomas)
                startActivity(intent)
            }
            int == 1 -> {
                val intent = Intent(this, RestaurantInfoActivity::class.java)
                intent.putExtra(KEY_RESTAURANT, RestaurantsDataClass().aoyama)
                startActivity(intent)
            }
            int == 2 -> {
                val intent = Intent(this, RestaurantInfoActivity::class.java)
                intent.putExtra(KEY_RESTAURANT, RestaurantsDataClass().outback)
                startActivity(intent)
            }
            int == 3 -> {
                val intent = Intent(this, RestaurantInfoActivity::class.java)
                intent.putExtra(KEY_RESTAURANT, RestaurantsDataClass().siSenor)
                startActivity(intent)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val KEY_RESTAURANT = "restaurant"
    }
}