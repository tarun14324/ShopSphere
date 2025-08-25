package com.example.shopsphere.data.model.products


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("price")
    val price: Double,
    @SerializedName("rating")
    val rating: Rating,
    @SerializedName("title")
    val title: String,
    val color : ArrayList<String>? = ArrayList(),
    val size : ArrayList<String>? = ArrayList(),
    var isFavorite : Boolean? = false
)