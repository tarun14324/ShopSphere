package com.example.shopsphere.domain.interfaces

import com.example.shopsphere.domain.model.ProductModel
import com.example.shopsphere.domain.model.ProductOwnerDataModel

interface ProductRepository {
    suspend fun getProducts(): Result<List<ProductModel>>
    suspend fun getProductById(id: Int): Result<ProductModel>
    suspend fun getProductsByCategory(category: String): Result<List<ProductModel>>
    fun getProductsOwnersData(): Map<String, ProductOwnerDataModel>
}