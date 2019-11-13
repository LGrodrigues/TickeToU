package com.example.ticketou_android.model

import java.io.Serializable

data class Event(
    val image: String,
    val name: String,
    val description: String,
    val address: String,
    val ticketQuantity: Int,
    val date: String,
    val price: Double
) : Serializable