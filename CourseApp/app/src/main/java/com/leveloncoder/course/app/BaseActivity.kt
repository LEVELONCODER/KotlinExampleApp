package com.leveloncoder.course.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch

class BaseActivity : AppCompatActivity() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var firstSwitch: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var secondSwitch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstSwitch = findViewById(R.id.firstSwitch)
        secondSwitch = findViewById(R.id.secondSwitch)

        firstSwitch.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {

            }
        })
    }
}