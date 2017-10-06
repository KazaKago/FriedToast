package com.kazakago.friedtoast.extension

import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View

fun View.setBackgroundCompat(drawable: Drawable) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
        background = drawable
    } else {
        setBackgroundDrawable(drawable)
    }
}