package com.example.shopsphere.data.repository

import com.example.shopsphere.data.model.products.Rating
import com.example.shopsphere.domain.interfaces.ProductRepository
import com.example.shopsphere.domain.model.ProductModel
import com.example.shopsphere.domain.model.ProductOwnerDataModel

class ProductRepositoryImpl : ProductRepository {
    override suspend fun getProducts(): Result<List<ProductModel>> {
        return Result.success(emptyList())
    }

    override suspend fun getProductById(id: Int): Result<ProductModel> {
        return Result.success(
            ProductModel(
                category = "tamquam",
                description = "rhoncus",
                id = 5571,
                image = "tortor",
                price = 4.5,
                rating = Rating(count = 7972, rate = 6.7),
                title = "vituperatoribus",
                color = arrayListOf(),
                size = arrayListOf(),
                isFavorite = false,
                ownerId = "liber",
                ownerName = "Arline Briggs",
                ownerImage = 9626
            )
        )
    }

    override suspend fun getProductsByCategory(category: String): Result<List<ProductModel>> {
        return Result.success(
            listOf(ProductModel(
                category = "tamquam",
                description = "rhoncus",
                id = 5571,
                image = "tortor",
                price = 4.5,
                rating = Rating(count = 7972, rate = 6.7),
                title = "vituperatoribus",
                color = arrayListOf(),
                size = arrayListOf(),
                isFavorite = false,
                ownerId = "liber",
                ownerName = "Arline Briggs",
                ownerImage = 9626
            ))
        )
    }

    override fun getProductsOwnersData(): Map<String, ProductOwnerDataModel> {
     return mapOf("tarun" to ProductOwnerDataModel(1,"tarun","1"))
    }
}