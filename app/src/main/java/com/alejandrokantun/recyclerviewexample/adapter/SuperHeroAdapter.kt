package com.alejandrokantun.recyclerviewexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alejandrokantun.recyclerviewexample.R
import com.alejandrokantun.recyclerviewexample.SuperHero

//private val onClickListener:(SuperHero)->Unit , is Lambda function that returns the class to mainActivity
class SuperHeroAdapter(val superHeroList:List<SuperHero>,private val onClickListener:(SuperHero)->Unit) :RecyclerView.Adapter<SuperHeroViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item,onClickListener)
    }

    override fun getItemCount(): Int = superHeroList.size
    //this function could be also as Return superHeroList.size

}