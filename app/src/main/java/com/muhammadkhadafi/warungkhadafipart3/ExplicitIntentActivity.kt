package com.muhammadkhadafi.warungkhadafipart3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntentActivity : AppCompatActivity() {


    companion object {
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_MEREK = "extra_merek"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)


        txt_harga.text = intent.getStringExtra(EXTRA_HARGA)
        txt_merek.text = intent.getStringExtra(EXTRA_MEREK)


        btn_back.setOnClickListener {
            val backItem = Intent(this@ExplicitIntentActivity, MainActivity::class.java)
            startActivity(backItem)
        }
    }
}