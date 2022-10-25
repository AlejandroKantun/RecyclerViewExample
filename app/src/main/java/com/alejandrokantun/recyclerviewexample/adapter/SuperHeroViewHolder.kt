package com.alejandrokantun.recyclerviewexample.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alejandrokantun.recyclerviewexample.R
import com.alejandrokantun.recyclerviewexample.SuperHero
import com.bumptech.glide.Glide

class SuperHeroViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val superHeroName = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)


    fun render (superHeroModel: SuperHero){
        superHeroName.text = superHeroModel.superHero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    }
}