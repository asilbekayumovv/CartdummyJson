package com.example.myapplication.model

import com.example.myapplication.api.Cart
import com.example.myapplication.api.Carts
import com.example.myapplication.api.Service

class HomeModel(val api: Service) {
    suspend fun getCarts(): Carts {
        return api.getCarts()
    }

    suspend fun getUserCarts(id: Int): Carts {
        return api.getUserCarts(id)
    }

    suspend fun getCart(id: Int): Cart {
        return api.getCart(id)
    }
}