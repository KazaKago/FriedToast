package com.kazakago.friedtoast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class FriedToastImpl(context: Context): AbsFriedToast(context) {

    override fun onCreateView(inflater: LayoutInflater): View = inflater.inflate(R.layout.view_fried_toast, null)

    override fun onCreateIconImageView(view: View): ImageView = view.findViewById(R.id.toastImageView)

    override fun onCreateTitleTextView(view: View): TextView = view.findViewById(R.id.toastTitleTextView)

    override fun onCreateDescriptionTextView(view: View): TextView = view.findViewById(R.id.toastDescriptionTextView)

}
