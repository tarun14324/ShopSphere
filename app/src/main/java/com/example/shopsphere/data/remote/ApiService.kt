package com.example.shopsphere.data.remote

import com.example.shopsphere.data.model.products.Product
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("products")
    suspend fun getProducts(): Response<List<Product>>

    @GET("products/{id}")
    suspend fun getProductsById(@Path("id") id : Int): Response<Product>

    @GET("products/categories")
    suspend fun getCategories(): Response<List<String>>

    @GET("products/category/{categoryName}")
    suspend fun getProductsByCategory(@Path("categoryName") categoryName : String): Response<List<Product>>
}