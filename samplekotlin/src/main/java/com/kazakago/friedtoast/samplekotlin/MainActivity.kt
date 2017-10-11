package com.kazakago.friedtoast.samplekotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.kazakago.friedtoast.FriedToast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showToastButton: Button = findViewById(R.id.showToastButton)
        showToastButton.setOnClickListener {
            showFriedToast()
        }
    }

    private fun showFriedToast() {
        FriedToast.create(
                context = this,
                titleText = "Title!",
                descriptionText = "Description!!",
                iconImageResourceId = R.drawable.ic_done_white_80dp)
                .show()
    }

}
