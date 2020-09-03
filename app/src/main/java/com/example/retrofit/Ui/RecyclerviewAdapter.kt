package com.example.retrofit.Ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.Data.Model.FortempModel
import com.example.retrofit.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.time
import kotlinx.android.synthetic.main.item_recycler.view.*


class RecyclerviewAdapter : RecyclerView.Adapter<RecyclerviewAdapter.RecyclerHolder>() {
    private val list = arrayListOf<FortempModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return RecyclerHolder(view)
    }

    fun update(list: List<FortempModel>?) {
        if (list != null) {
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }

    override fun onBindViewHolder(holder: RecyclerHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    class RecyclerHolder(v: View) : RecyclerView.ViewHolder(v) {
        fun bind(data: FortempModel) {
            val image = data.weather.first().icon
            Picasso.get().load(" http://openweathermap.org/img/w/$image.png").into(itemView.imgRV)
        }
    }
}