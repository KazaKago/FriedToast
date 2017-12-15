package com.kazakago.friedtoast.samplekotlin

import android.app.Activity
import android.os.Bundle
import com.kazakago.friedtoast.FriedToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToastButton.setOnClickListener {
            showFriedToast()
        }
    }

    private fun showFriedToast() {
        FriedToast.create(this)
                .setTitle("Title!")
                .setDescription("Description!!")
                .setIconImageResource(R.drawable.ic_done_white_80dp)
                .show()
    }

}
