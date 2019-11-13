package com.example.ticketou_android.model

data class Event(
    val image: String,
    val name: String,
    val description: String,
    val address: String,
    val ticketQuantity: Int,
    val date: String,
    val price: Double
)