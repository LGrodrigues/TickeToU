package com.example.ticketou_android.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.ticketou_android.R
import com.example.ticketou_android.model.Event
import kotlinx.android.synthetic.main.activity_event_detail.*

class EventDetailActivity: Activity() {

    companion object{
        const val KEY = "KEY"
        fun getStartIntent(event: Event, context: Context) = Intent(context, EventDetailActivity::class.java).apply {
            this.putExtra(KEY, event)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)

        (intent?.extras?.get(KEY) as Event)?.let {
            event_detail_name.text = "Nome do evento: ".plus(it.name)
            event_detail_description.text = "Descrição do evento: ".plus(it.description)
            event_detail_address.text = "Endereço do evento: ".plus(it.address)
            event_detail_ticket_quantity.text = "Quantidade de ingressos".plus(it.ticketQuantity)
            event_detail_date.text = "Data do evento ".plus(it.date)
            event_detail_price.text = "Preço do ingresso".plus(it.price)
        }


    }
}