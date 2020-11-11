package com.example.desafio_2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemMenu (
    var itemImage: String,
    var itemName: String,
    var itemDescription: String,
) : Parcelable