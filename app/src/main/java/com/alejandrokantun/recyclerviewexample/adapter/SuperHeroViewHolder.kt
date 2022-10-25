package com.alejandrokantun.recyclerviewexample.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.alejandrokantun.recyclerviewexample.SuperHero
import com.alejandrokantun.recyclerviewexample.databinding.ItemSuperheroBinding
import com.bumptech.glide.Glide

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)

    //val superHeroName = view.findViewById<TextView>(R.id.tvSuperHeroName)
    //val realName = view.findViewById<TextView>(R.id.tvRealName)
    //val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    //val photo = view.findViewById<ImageView>(R.id.ivSuperHero)


    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        itemView.setOnClickListener {
            onClickListener(superHeroModel)
        }
    }
}