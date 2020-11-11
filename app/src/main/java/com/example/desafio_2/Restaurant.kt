package com.example.desafio_2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    var restaurantName: String,
    var restaurantCardCoverImage: String,
    var restaurantAddress: String,
    var restaurantClosingHour: String,
    val restaurantMenu: MutableList<ItemMenu>
) : Parcelable