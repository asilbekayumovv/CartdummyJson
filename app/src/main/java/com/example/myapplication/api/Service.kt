package com.example.myapplication.api

import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("/carts")
    suspend fun getCarts(): Carts

    @GET("/carts/user/{id}")
    suspend fun getUserCarts(@Path("id") id: Int): Carts

    @GET("/carts/{id}")
    suspend fun getCart(@Path("id") id: Int): Cart
}