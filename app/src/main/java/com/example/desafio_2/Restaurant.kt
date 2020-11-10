package com.example.desafio_2

data class Restaurant(
    var restaurantName: String,
    var restaurantCardCoverImage: String,
    var restaurantAddress: String,
    var restaurantClosingHour: String,
    val restaurantMenu: MutableList<ItemMenu>
) {

}