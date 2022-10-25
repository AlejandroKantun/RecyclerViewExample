package com.alejandrokantun.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alejandrokantun.recyclerviewexample.adapter.SuperHeroAdapter
import com.alejandrokantun.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //if you want to create grid style you can change from Linearlayout to gridLayoutManager and add the number of columns
        //val manager = GridLayoutManager(this,4)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerSuperHero.layoutManager = manager
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) {superhero->
            onItemSelected(
                superhero
            )
        }
        //binding.recyclerSuperHero.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero:SuperHero){
        Toast.makeText(this, "el nombre del superHero ${superHero.superHero}", Toast.LENGTH_SHORT).show()
    }
}