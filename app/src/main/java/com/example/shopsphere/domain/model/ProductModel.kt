package com.example.shopsphere.domain.model

import com.example.shopsphere.data.model.products.Rating

data class ProductModel(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val rating: Rating,
    val title: String,
    val color: ArrayList<String> = ArrayList(),
    val size: ArrayList<String> = ArrayList(),
    var isFavorite: Boolean,
    val ownerId: String = "",
    val ownerName: String = "",
    val ownerImage: Int = 1,
) {
}