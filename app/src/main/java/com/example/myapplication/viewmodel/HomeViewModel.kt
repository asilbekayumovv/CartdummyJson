package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.api.Cart
import com.example.myapplication.api.Carts
import com.example.myapplication.model.HomeModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(val model: HomeModel) : ViewModel() {
    private var _carts = MutableStateFlow(Carts(emptyList()))
    val carts = _carts

    private var _user_carts = MutableStateFlow(Carts(emptyList()))
    val user_carts = _user_carts

    private var _cart = MutableStateFlow(Cart(0, 0, emptyList(), 0, 0, 0, 0))
    val cart = _cart

    fun getCarts() {
        viewModelScope.launch {
            _carts.value = model.getCarts()
        }
    }

    fun getUserCarts(id: Int) {
        viewModelScope.launch {
            _user_carts.value = model.getUserCarts(id)
        }
    }

    fun getCart(id: Int) {
        viewModelScope.launch {
            _cart.value = model.getCart(id)
        }
    }

    init {
        getCarts()
    }
}