package com.example.reviewerkotlin.domain.models

import com.example.reviewerkotlin.domain.models.utils.PhotoSource

data class Item(
    val id: String,
    val itemName: String,
    val shop: String,
    val itemPhoto: PhotoSource,
    val itemPriceCurrency: PriceCurrency,
)
