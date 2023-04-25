package com.example.reviewerkotlin.domain.models

data class PriceCurrency(
    val name: String,
    val currencyWeight: Float,
    val price: Float
){
    fun convertTo(priceCurrency: PriceCurrency, price: Float): Float = currencyWeight / priceCurrency.currencyWeight * price
}