package com.codingtroops.composesample.model

data class FoodItem(
    val id: String,
    val name: String,
    val thumbnailUrl: String,
    val description: String = ""
)
