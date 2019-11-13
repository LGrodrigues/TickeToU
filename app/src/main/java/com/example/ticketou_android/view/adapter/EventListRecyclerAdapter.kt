package com.example.ticketou_android.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ticketou_android.R
import com.example.ticketou_android.model.Event
import kotlinx.android.synthetic.main.item_event_list.view.*

class EventListRecyclerAdapter(private val data: List<Event>): RecyclerView.Adapter<EventListRecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_event_list, parent,
            false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(data[position])
    }

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        fun bind(event: Event){
            //ToDo: load event image
            view.apply {
                Glide.with(context).load(event.image).into(event_image)
                event_name.text = event.name
                event_description.text = event.description
                event_address.text = event.address
                event_ticket_quantity.text = event.ticketQuantity.toString()
                event_date.text = event.date
                event_price.text = event.price.toString()
                event_share.setImageResource(R.drawable.ic_share_black)
                event_love.setImageResource(R.drawable.ic_heart)
            }
        }
    }
}