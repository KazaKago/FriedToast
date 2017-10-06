package com.kazakago.friedtoast.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.kazakago.friedtoast.FriedToast

class MainActivity : AppCompatActivity() {

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
