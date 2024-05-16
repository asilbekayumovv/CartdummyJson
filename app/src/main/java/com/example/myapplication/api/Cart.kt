package com.example.myapplication.api

data class Cart(
    val discountedTotal: Int,
    val id: Int,
    val products: List<Product>,
    val total: Int,
    val totalProducts: Int,
    val totalQuantity: Int,
    val userId: Int
)