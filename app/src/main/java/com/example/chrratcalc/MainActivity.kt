package com.example.chrratcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    val forecastList = findViewById(R.id.forecast_list) as RecyclerView
    forecastList.layoutManager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //messageChr.text = "Hello kotlin! chr (fra MainAcrivity.kt)"//KotlinForAndroidDevs 28/226

    }
}
