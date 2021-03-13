package com.example.eplclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_MANAGER = "extra_manager"
        const val EXTRA_NICKNAME = "extra_nickname"
        const val EXTRA_STADIUM = "extra_stadium"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_OWNER = "extra_owner"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_SQUAD = "extra_squad"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val nameC = intent.getStringExtra(EXTRA_NAME)
        val managerC = intent.getStringExtra(EXTRA_MANAGER)
        val nicknameC = intent.getStringExtra(EXTRA_NICKNAME)
        val stadiumC = intent.getStringExtra(EXTRA_STADIUM)
        val locationC = intent.getStringExtra(EXTRA_LOCATION)
        val ownerC = intent.getStringExtra(EXTRA_OWNER)
        val detailC = intent.getStringExtra(EXTRA_DETAIL)
        val squadC = intent.getStringExtra(EXTRA_SQUAD)
        val photoC = intent.getIntExtra(EXTRA_PHOTO, 0)

        supportActionBar?.title = nameC

        val tvManager : TextView = findViewById(R.id.manager_club)
        val tvNickname : TextView = findViewById(R.id.nickname_club)
        val tvStadium : TextView = findViewById(R.id.stadium_club)
        val tvLocation : TextView = findViewById(R.id.location_club)
        val tvOwner : TextView = findViewById(R.id.owner_club)
        val tvDetail : TextView = findViewById(R.id.tv_detail_club)
        val tvSquad : TextView = findViewById(R.id.tv_squad_club)
        val imgClub : ImageView = findViewById(R.id.img_club)

        tvManager.text = managerC
        tvNickname.text = nicknameC
        tvStadium.text = stadiumC
        tvLocation.text = locationC
        tvOwner.text = ownerC
        tvDetail.text = detailC
        tvSquad.text = squadC
        imgClub.setImageResource(photoC)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}