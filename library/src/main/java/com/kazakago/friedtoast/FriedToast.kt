package com.kazakago.friedtoast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class FriedToast(context: Context) : FriedToastCore(context) {

    companion object {
        @JvmStatic
        fun create(context: Context) = FriedToast(context)
    }

    override fun onCreateView(inflater: LayoutInflater): View = inflater.inflate(R.layout.view_fried_toast, null)

    override fun onCreateIconImageView(view: View): ImageView = view.findViewById(R.id.toastImageView)

    override fun onCreateTitleTextView(view: View): TextView = view.findViewById(R.id.toastTitleTextView)

    override fun onCreateDescriptionTextView(view: View): TextView = view.findViewById(R.id.toastDescriptionTextView)

    override fun onCreateToast(toast: Toast): Toast {
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.CENTER, 0, 0)
        return toast
    }

    override fun onIconImageViewCreated(iconImageView: ImageView) {
        iconImageView.visibility = if (iconImageView.drawable != null) View.VISIBLE else View.GONE
    }

    override fun onTitleTextViewCreated(titleTextView: TextView) {
        titleTextView.visibility = if (titleTextView.text.isNotBlank()) View.VISIBLE else View.GONE
    }

    override fun onDescriptionTextViewCreated(descriptionTextView: TextView) {
        descriptionTextView.visibility = if (descriptionTextView.text.isNotBlank()) View.VISIBLE else View.GONE
    }

}
