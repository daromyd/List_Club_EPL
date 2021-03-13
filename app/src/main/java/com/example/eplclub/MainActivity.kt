package com.example.eplclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvClubs :RecyclerView
    private var list: ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClubs = findViewById(R.id.rv_clubs)
        rvClubs.setHasFixedSize(true)

        list.addAll(ClubsData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvClubs.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rvClubs.adapter = listClubAdapter

        listClubAdapter.setOnItemClickCallback(object : ListClubAdapter.OnItemClickCallback{
            override fun onItemClicked(club: Club) {
                moveToDetail(club)
            }
        })
    }

    private fun moveToDetail(club: Club){
        val seeDetailIntent = Intent(this@MainActivity, DetailActivity::class.java)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_NAME, club.name)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_MANAGER, club.manager)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_NICKNAME, club.nickname)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_STADIUM, club.stadium)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_LOCATION, club.location)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_OWNER, club.owner)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_DETAIL, club.detail)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_SQUAD, club.squad)
        seeDetailIntent.putExtra(DetailActivity.EXTRA_PHOTO, club.photo)

        startActivity(seeDetailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.to_about->{
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }


}