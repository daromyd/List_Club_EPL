package com.example.eplclub

import android.media.browse.MediaBrowser
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListClubAdapter (private val listClub: ArrayList<Club>) : RecyclerView.Adapter<ListClubAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback:  OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback

    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Club)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvNickname: TextView = itemView.findViewById(R.id.tv_item_nick)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnFav : ImageView = itemView.findViewById(R.id.img_fav)

    }

    override fun onCreateViewHolder( viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_club, viewGroup, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val club = listClub[position]

        Glide.with(holder.itemView.context)
            .load(club.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = club.name
        holder.tvNickname.text = club.nickname

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listClub[holder.adapterPosition])
        }

        holder.btnFav.setOnClickListener{
            if (club.isFav){
                holder.btnFav.setImageResource(R.drawable.ic_fav_border)
                club.isFav = false
                Toast.makeText(holder.itemView.context, "${club.name} removed from your favorite", Toast.LENGTH_SHORT).show()
            } else{
                holder.btnFav.setImageResource(R.drawable.ic_fav_full)
                club.isFav = true
                Toast.makeText(holder.itemView.context, "${club.name} added to your favorite", Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun getItemCount(): Int {
        return listClub.size
    }
}